package homework.oop_homeWork;

public class Example {
    public static void main(String[] args) {
    Customer customer = new Customer("Sandris");
    customer.setMember(true);
    customer.setMemberType("Gold");
    customer.isMember();
        System.out.println(customer.toString());

    }
}
