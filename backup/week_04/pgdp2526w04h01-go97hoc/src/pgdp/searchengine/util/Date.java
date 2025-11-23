package pgdp.searchengine.util;

public class Date {

    // TODO 1: Implement the helper methods isLeapYear, daysInYear,
    //  daysInMonth, isValidDate and the constructor.

    // TODO 2: Implement the methods daysLeftThisYear, daysPassedThisYear ans use them to implement
    //  yearsUntil and daysUntil.

    // TODO 3: Implement the methods dateMillisecondsAfterNewYear1970 & today.

    private final int day;
    private final int month;
    private final int year;

    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            this.day = -1;
            this.month = -1;
            this.year = -1;
            System.out.println("Der " + day + "." + month + "." + year + " ist kein valides Datum.");
        }
    }

    public boolean equals(Date other) {
        return day == other.day && month == other.month && year == other.year;
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    //Getter
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int daysInYear(int year) {
        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
        }
    }
    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
    public static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        return day >= 1 &&daysInMonth(month,year)>=day;
    }

    public int daysPassedThisYear() {
        int totalDays=0;
        for (int i = 1; i < month; i++) {
            totalDays+=daysInMonth(i,year);
        }
        return totalDays+day;
    }
    public int daysLeftThisYear(){
        return daysInYear(year)-daysPassedThisYear();
    }

    public int yearsUntil(Date other) {
        int yearsUntil=other.year - this.year;
        if  ( yearsUntil>0){
            if (other.month < this.month || (other.month == this.month && other.day < this.day)) {
                yearsUntil--;
            }}
            else {
            yearsUntil++;
        }
            return yearsUntil;
        }
    public int daysUntil(Date other) {
        return other.daysPassedThisYear()-this.daysPassedThisYear();
    }

    public static Date dateMillisecondsAfterNewYear1970(long millis) {
        long days = millis / 86400000;

        int year = 1970;

        while (days >= daysInYear(year)) {
            year++;
            days -= daysInYear(year);
        }
        int month = 1;
        while (days >= daysInMonth(month, year)) {
            month++;
            days -= daysInMonth(month, year);
        }

        return new Date((int) days, month, year);
    }
    public static Date today() {
        long today = System.currentTimeMillis();
        return dateMillisecondsAfterNewYear1970(today);
    }
}
