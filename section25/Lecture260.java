package section25;

import java.io.*;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Account implements Serializable {
    String name;
    String accountNumber;
    int balance;
    static int currAccountNumber=1;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = Math.max(balance, 0);
        this.accountNumber = "AC"+currAccountNumber++;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
public class Lecture260 {

    static HashMap<String, Account> accountHashMap= new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //fetch from accounts.txt if something already exists
        fetchAccountsFromFile();

        // create, delete ,view one, view All, save to file, exit
        int input;
        do{
            // display menu
            displayMenu();

            input = scanner.nextInt();
            String acntId;
            switch (input){
                case 1:
                    createAccount();
                    break;
                case 2:
                    System.out.print("Enter the ID of the account to delete: ");
                    acntId = scanner.next();
                    deleteAccountWithId(acntId);
                    break;
                case 3:
                    System.out.print("Enter the ID of the account to view: ");
                    acntId = scanner.next();
                    viewAccountWithId(acntId);
                    break;
                case 4:
                    viewAllAccounts();
                    break;
                case 5:
                    saveToFile();
                    break;
                case 6:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Not an option");
            }
            System.out.println("--------------");
        }while (input != 6);
    }

    public static void displayMenu(){
        System.out.println("1 - Create Account");
        System.out.println("2 - Delete Account");
        System.out.println("3 - View Account with ID");
        System.out.println("4 - View all Accounts");
        System.out.println("5 - Save accounts to File");
        System.out.println("6 - Exit program");
        System.out.print("Enter your option: ");
    }

    public static void createAccount(){
        System.out.print("Enter the name of account holder: ");
        String name  = scanner.next();
        System.out.print("Enter the balance: ");
        int balance  = scanner.nextInt();

        Account newAccount = new Account(name,balance);
        accountHashMap.put(newAccount.accountNumber,newAccount);
    }
    public static void deleteAccountWithId(String id){
        System.out.println("Removing the account with id: "+id);
        accountHashMap.remove(id);
    }
    public static void viewAccountWithId(String id){
        System.out.println("Fetching the account with Id: "+id);
        System.out.println(accountHashMap.get(id));
    }
    public static void saveToFile() {
        System.out.println("Started the process to save accounts to a file");
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/deekshith/Desktop/udemy-java/section25/static/accounts.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            Set<String> accountKeys = accountHashMap.keySet();

            int numberOfAccounts = accountKeys.size();
            objectOutputStream.writeInt(numberOfAccounts);

            for(String accountNumber: accountHashMap.keySet()){
                objectOutputStream.writeObject(accountHashMap.get(accountNumber));
            }

            objectOutputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            System.out.println("Process failed");
            System.out.println(e);
        }
        System.out.println("Completed the process to save accounts to a file");
    }
    public static void viewAllAccounts(){
        System.out.println("Showing all accounts");
        for(String accountNumber: accountHashMap.keySet()){
            System.out.println("------------------");
            System.out.println(accountHashMap.get(accountNumber));
        }
    }

    public static void fetchAccountsFromFile() throws IOException, ClassNotFoundException {
        File file = new File("/Users/deekshith/Desktop/udemy-java/section25/static/accounts.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        if (br.readLine() == null && file.length() == 0)
        {
            System.out.println("No errors, and file empty");
        }
        else
        {
            System.out.println("Starting Account Recovery");
            FileInputStream fileInputStream = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section25/static/accounts.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            int n = objectInputStream.readInt();
            System.out.println("retrieved n value is: "+n);
            for (int i = 0; i < n; i++) {
                Account account = (Account) objectInputStream.readObject();
                accountHashMap.put(account.accountNumber,account);
            }
            System.out.println("Successfully fetched all previous accounts from the file");
            objectInputStream.close();
            fileInputStream.close();
        }
    }
}
