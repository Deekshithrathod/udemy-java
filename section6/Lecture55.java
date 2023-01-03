package section6;

public class Lecture55 {
    public static void main(String[] args) {
        // find if the email id is on gmail
        System.out.println(isEmailGmail("super@gmail.com"));
        System.out.println(getUsername("super@gmail.com"));
        System.out.println(getDomainName("super@gmail.com"));
//        System.out.println(isEmailGmail("@gmail.com"));
//        System.out.println(isEmailGmail("@gmail.org"));
    }

    public static boolean isEmailGmail(String emailId) {
        return emailId.matches(".+@gmail[.]com");
    }

    public static String getUsername(String emailId) {
        return emailId.substring(0, emailId.indexOf('@'));
    }

    public static String getDomainName(String emailId) {
        return emailId.substring(emailId.indexOf('@') + 1);
    }
}
