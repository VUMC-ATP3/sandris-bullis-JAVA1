package homework.oop_homeWork;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        //Premium
        Customer customerOne = new Customer("Jānis");
        customerOne.setMember(true);
        customerOne.setMemberType("Premium");

        //Gold
        Customer customerTwo = new Customer("Līga");
        customerTwo.setMember(true);
        customerTwo.setMemberType("Gold");

        //Silver
        Customer customerFour= new Customer("Anna");
        customerFour.setMember(true);
        customerFour.setMemberType("Silver");

        //no member
        Customer customerThree = new Customer("Jurģis");
        customerThree.setMember(false);


        Visit one = new Visit(customerOne, new Date());
        Visit two = new Visit(customerTwo, new Date());
        Visit three = new Visit(customerThree, new Date());
        Visit four = new Visit(customerFour, new Date());


        one.setServiceExpense(30.0);
        one.setProductExpense(20.0);
        System.out.println(one);
        System.out.println("Total expense made by " + one.getName() + " = " + one.getTotalExpense());

        two.setServiceExpense(30.0);
        two.setProductExpense(20.0);
        System.out.println(two);
        System.out.println("Total expense made by " + two.getName() + " = " + two.getTotalExpense());

        three.setServiceExpense(30.0);
        three.setProductExpense(20.0);
        System.out.println(three);
        System.out.println("Total expense made by " + three.getName() + " = " + three.getTotalExpense());

        four.setServiceExpense(30.0);
        four.setProductExpense(20.0);
        System.out.println(four);
        System.out.println("Total expense made by " + four.getName() + " = " + four.getTotalExpense());

    }
}
