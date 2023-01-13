package section14;

interface Member {
    void callback();
}

class Store {
    Member[] members = new Member[10];
    int count = 0;

    void register(Member member) {
        members[count] = member;
        count++;
    }

    void invite() {
        for (int i = 0; i < count; i++) {
            members[i].callback();
        }
    }
}

class Customer implements Member {
    String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("Accepting the invite: " + name);
    }
}

public class Lecture145 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Surya");
        Customer customer2 = new Customer("Vijay");

        Store store = new Store();
        store.register(customer1);
        store.register(customer2);

        store.invite();

    }
}
