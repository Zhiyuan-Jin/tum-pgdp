package pgdp.array;

public class Switch {

    public static String locationOfLectureHall(String hall) {
        // TODO
        return "";
    }

    public static int inclusions(char c) {
        // TODO
        return 0;
    }

    public static String formatDate(int day, int month, int weekday) {
        // TODO
        return "";
    }

    /*public static int daysInFebruary(int year) {
        // TODO
        switch (year) {
            case year % 4 == 0:
                System.out.println(29);
                yield 29;
            case year % 400 == 0:
                System.out.println(29);
                return 29;
            case year % 100 == 0:
                System.out.println(28);
                return 28;
            default:
                System.out.println(28);
                return 28;
        }
    }*/

    public static int daysLeftInYearAfter(int day, int month, int year) {
        // TODO 1.1.2022
        int r = 0;
        switch (month) {
            case 1:
                r = r + 31;
            case 2:
                r = r + daysInFebruary(year);
            case 3:
                r += 31;
            case 4:
                r = r + 30;
            case 5:
                r += 31;
            case 6:
                r = r + 30;

            case 7:
                r = r + 31;
            case 8:
                r = r + 31;
            case 9:
                r += 30;
            case 10:
                r = r + 31;
            case 11:
                r += 30;
            case 12:
                r += 31;
                r = r - day;
            default:
             r=-1;
                System.out.println(r);
                return r;
        }


    }
}
