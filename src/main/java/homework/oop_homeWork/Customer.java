package homework.oop_homeWork;

import java.util.Date;

public class Customer {
    private String name;
    private boolean Member = false;
    private String memberType;
    private Date date;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return Member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMember(boolean member) {
        this.Member = member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + Member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}