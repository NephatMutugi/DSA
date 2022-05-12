package data_structures.linked_lists.customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Nephat", 20.78);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(10.05);

        System.out.println("Balance for customer " + customer.getName()
        + " is: " + customer.getBalance());
    }
}
