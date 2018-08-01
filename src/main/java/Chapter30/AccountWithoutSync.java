package Chapter30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {
	private static Account account = new Account();

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();

		for(int i=0; i<100; i++){
			executorService.execute(new AddAPennyTash());
		}
		executorService.shutdown();

		while (!executorService.isTerminated()){

		}

		System.out.println("What is balance? "  + account.getBalance());
	}

	private static class AddAPennyTash implements Runnable{

		@Override
		public void run() {
			synchronized (account){
				account.deposit(1);
			}
		}
	}

	private static class Account{
		private int balance = 0;

		public int getBalance(){
			return balance;
		}

		public void deposit(int amount){
			int newBalance = balance + amount;
			try{
				Thread.sleep(5);
			}catch (InterruptedException ex){
				ex.printStackTrace();
			}
			balance = newBalance;
		}
	}
}
