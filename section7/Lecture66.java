package section7;

public class Lecture66 {
    public static void main(String[] args) {
        // display the day based on number
        displayDay(1);
        displayDay(2);
        displayDay(3);
        displayDay(4);
        displayDay(5);
        displayDay(6);
        displayDay(7);
        displayDay(0);
        displayDay(8);

        // find the type of website & protocol used
//        displayProtocolAndType("http://www.google.com");
//        displayProtocolAndType("http://www.google.gov");
//        displayProtocolAndType("http://www.google.org");
//        displayProtocolAndType("http://www.google.io");
//        displayProtocolAndType("ftp://www.google.org");
//        displayProtocolAndType("smtp://www.google.org");
    }

    public static void displayDay(int dayId) {
        switch (dayId) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Data");
        }
    }

    public static void displayProtocolAndType(String url) {
        String protocol = url.substring(0, url.indexOf(":"));
        String typeExtension = url.substring(url.lastIndexOf(".") + 1);
        System.out.println(protocol);
        switch (typeExtension) {
            case "com" -> System.out.println("Commercial");
            case "gov" -> System.out.println("Government");
            case "org" -> System.out.println("Organization");
            default -> System.out.println("Unknown");
        }
    }
}
