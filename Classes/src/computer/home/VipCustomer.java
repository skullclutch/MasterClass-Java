package computer.home;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, String email) {
        this(name,3000.00,email);
        this.name = name;
        this.email = email;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"oops@ididitagain.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer() {
        this("Customer",3000.00,"customer1@fakemail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
