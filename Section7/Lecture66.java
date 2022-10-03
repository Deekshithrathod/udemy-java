package Section7;

import java.util.HashMap;

public class Lecture66 {
    public static void main(String[] args) {
        // SC : Display name of the day using number
        int n = 5;
        System.out.println(getDayName(n));

        // SC : Display name of the month using number
        System.out.println(getMonthName("Jan"));

        // SC : Display protocol of the website being used
        String URL ="http://google.com";
        System.out.println(getProtocol(URL));
    }

    public static String getDayName(int n){
        return switch (n) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "";
        };
    }

    public static String getMonthName(String month){
        return switch (month) {
            case "Jul" -> "July";
            case "Oct" -> "October";
            case "Feb" -> "February";
            case "Apr" -> "April";
            case "Jun" -> "June";
            case "Aug" -> "August";
            case "Dec" -> "December";
            case "May" -> "May";
            case "Nov" -> "November";
            case "Jan" -> "January";
            case "Mar" -> "March";
            case "Sep" -> "September";
            default -> "";
        };
    }

    public static String getProtocol(String url){
        return url.substring(0,url.indexOf(":"));
    }
}
