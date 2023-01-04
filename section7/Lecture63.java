package section7;

public class Lecture63 {
    public static void main(String[] args) {
        // display the day based on number
        displayDay(1);
        displayDay(2);
        displayDay(3);
        displayDay(4);
        displayDay(5);
        displayDay(6);
        displayDay(7);

        // find the type of website & protocol used
        displayProtocolAndType("http://www.google.com");
        displayProtocolAndType("http://www.google.gov");
        displayProtocolAndType("http://www.google.org");
        displayProtocolAndType("http://www.google.io");
        displayProtocolAndType("ftp://www.google.org");
        displayProtocolAndType("smtp://www.google.org");
    }

    public static void displayDay(int dayId) {
        if (dayId == 1) {
            System.out.println("Monday");
        } else if (dayId == 2) {
            System.out.println("Monday");
        } else if (dayId == 3) {
            System.out.println("Tuesday");
        } else if (dayId == 4) {
            System.out.println("Thursday");
        } else if (dayId == 5) {
            System.out.println("Friday");
        } else if (dayId == 6) {
            System.out.println("Saturday");
        } else if (dayId == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Data");
        }
    }

    public static void displayProtocolAndType(String url) {
        String protocol = url.substring(0, url.indexOf(":"));
        String typeExtension = url.substring(url.lastIndexOf(".") + 1);
        System.out.println(protocol);
        if (typeExtension.equals("com")) {
            System.out.println("Commercial");
        } else if (typeExtension.equals("gov")) {
            System.out.println("Government");
        } else if (typeExtension.equals("org")) {
            System.out.println("Organization");
        } else {
            System.out.println("Unknown");
        }
    }
}
