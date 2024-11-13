package learnjava.SWCase;

import java.util.Scanner;

public class SwCaseDate {
    public int test;
    private int year;
    private int month;

    public SwCaseDate() {}
    public SwCaseDate(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam");
        this.year = sc.nextInt();

        System.out.println("Nhap thang");
        this.month = sc.nextInt();
    }

    public boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean checkInputed() {
        return this.year > 0 && this.month > 0 && this.month < 12;
    }

    public int countDayOfMonth() {
//        int count = -1;
//        switch(this.month){
//            case 1, 3, 5, 7, 8, 10, 12: count = 31; break;
//            case 2 :
//                if(checkLeapYear(this.year)) count = 29;
//                else count = 28; break;
//            case 4, 6, 9, 11 : count = 30; break;
//        }
//        return count;
        switch(this.month){
            case 1, 3, 5, 7, 8, 10, 12: return 31;
            case 2 :
                if(checkLeapYear(this.year)) return 29;
                else return 28;
            case 4, 6, 9, 11 : return 30;
            default : return -1;
        }
    }

    public void displayCountDayOfMonth() {
        if (!checkInputed()) {
            input();
        }
        System.out.println("Thang " + this.month
                + " nam " + this.year
                + " co " + countDayOfMonth()
                + " ngay!");
    }
}
