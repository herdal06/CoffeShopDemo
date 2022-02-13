
public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Test","Test",2000,1000000000L)); // throws exception. invalid person.
    }
}
