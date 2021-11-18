public class Program {

    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.allSet("Yusuf", "Balık", 2, 2001, "Turkiye");
        BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
        baseCustomerManager.Save(customer);
    }
    
}
