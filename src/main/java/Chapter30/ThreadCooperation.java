package Chapter30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCooperation {
	private static Account account = new Account();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new DepositTask());
		executor.execute(new WithdrawTask());
		executor.shutdown();

		System.out.println("Thread1\t\tThread2\t\tBalance");
	}

	public static class  DepositTask implements Runnable{
		@Override
		public void run() {
			try{
				while (true){
					account.deposit((int)(Math.random() * 10) + 1);
					Thread.sleep(1000);
				}
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}


	public static class WithdrawTask implements Runnable{
		@Override
		public void run() {
			while(true){
				account.withdraw((int)(Math.random() * 10) + 1);
			}
		}
	}

	public static class Account{
		private static Lock lock = new ReentrantLock();
		private static Condition newDeposit = lock.newCondition();
		private int balance = 0;

		public int getBalance(){
			return balance;
		}

		public void withdraw(int amount){
			lock.lock();
			try{
				while (balance < amount){
					System.out.println("\t\tWait for a deposit");
					newDeposit.await();
				}

				balance -= amount;
				System.out.println("\t\t\tWithdraw " + amount + "\t\t" + getBalance());
			}catch (InterruptedException e){
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
		}

		public void deposit(int amount){
			lock.lock();
			try{
				balance += amount;
				System.out.println("Deposit " + amount + "\t\t\t\t\t" + getBalance());
				newDeposit.signalAll();
			} finally {
				lock.unlock();
			}
		}
	}
}
