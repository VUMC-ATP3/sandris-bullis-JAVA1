package homework.oop_homeWork;

public class Customer {
    String name;
    boolean member = false;
    String memberType;

    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
}
