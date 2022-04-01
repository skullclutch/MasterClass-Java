package computer.home;

public class Main {

    public static void main(String[] args) {
//        BankAccount mine = new BankAccount();
//        mine.setAccountNumber("8675309");
//        mine.setCustomerName("Rowan Gee");
//        mine.setEmail("heatherngee@gmail.com");
//        mine.setPhoneNumber("5742654497");
//        mine.setBalance(5000.00);
//        mine.withdrawalFunds(2500.00);
//        mine.depositFunds(1000.00);
//        System.out.println(mine.getCustomerName());
//        System.out.println(mine.getAccountNumber());
//        System.out.println(mine.getEmail());
//        System.out.println(mine.getPhoneNumber());
//        System.out.println(mine.getBalance());
//        mine.withdrawalFunds(4000.00);
//        System.out.println(mine.getBalance());
//        mine.depositFunds(500.00);



        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Rowan",500000.00,"imawesome@awesomeness.com");
        System.out.println(person3.getName());


    }

}
