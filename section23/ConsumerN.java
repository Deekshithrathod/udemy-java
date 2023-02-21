package section23;

import java.io.Serializable;

public class ConsumerN implements Serializable {
    String customerId;
    String name;
    String phoneNumber;

    static int currentCustomerNumber = 1;
    ConsumerN(){}

    @Override
    public String toString() {
        return "ConsumerN{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public ConsumerN(String name, String phoneNumber) {
        this.customerId = "Cust"+ currentCustomerNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        currentCustomerNumber++;
    }
}
