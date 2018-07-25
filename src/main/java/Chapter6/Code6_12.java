package Chapter6;
import java.util.Scanner;
/**
 * Created by ubuntu on 16-10-17.
 * PrintCalendar
 */
public class Code6_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //读取用户输入
        System.out.println("Enter full year (e.g.,2001): ");
        int year = in.nextInt();
        System.out.println("Enter month as number between 1 adn 12: ");
        int month  = in.nextInt();

        //打印日历
        printMonth(year,month);
    }

    //打印日历方法的实现
    public static void printMonth(int year,int month){
        printCalanderTitle(year,month);
        printCalanderBody(year,month);
    }

    //打印日历头
    public static void printCalanderTitle(int year,int month){
        System.out.println("          " + getMonthName(month) + " " + year);
        System.out.println("----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    //获取当月的名字
    public static  String getMonthName(int month){
        String monthName = "";
        switch (month){
            case 1:monthName = "一月";break;
            case 2:monthName = "二月";break;
            case 3:monthName = "三月";break;
            case 4:monthName = "四月";break;
            case 5:monthName = "五月";break;
            case 6:monthName = "六月";break;
            case 7:monthName = "七月";break;
            case 8:monthName = "八月";break;
            case 9:monthName = "九月";break;
            case 10:monthName = "十月";break;
            case 11:monthName = "十一月";break;
            case 12:monthName = "十二月";break;
        }
        return monthName;
    }

    //打印日历体
    public static void printCalanderBody(int year,int month){
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumbersOfDaysInMonth(year, month);

        int i = 0;
        for(i = 0;i < startDay; i++){
            System.out.print("    ");
        }

        for(i = 1; i <= numberOfDaysInMonth; i++ ){
            System.out.printf("%4d",i);

            if((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

    //获取当月第一天的星期数
    public static int getStartDay(int year,int month){
        final int  START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year,month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800 % 7);
    }

    //获取距离某一天的总天数
    public  static  int getTotalNumberOfDays(int year,int month){
        int total = 0;

        for(int i = 1800; i < year ; i++){
            if(isLeapYear(i))
                total += 366;
            else
                total += 365;
        }

        for(int i = 1; i < month; i++){
            total += getNumbersOfDaysInMonth(year,i);
        }
        return total;

    }

    //获取该月的天数
    public static int getNumbersOfDaysInMonth(int year,int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if(month == 2)
            return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    //判断是否闰年
    public  static boolean isLeapYear(int year){
        return year % 400 ==0 || (year % 4 == 0 && year % 100 != 0);
    }

}
