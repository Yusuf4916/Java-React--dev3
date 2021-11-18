
public class BaseCustomerManager implements ICustomerServise{


    @Override
    public void Save(Customer customer) {
        System.out.println("Kullanıcı id : "+customer.getId());
        System.out.println("Kullanıcı Ad : "+customer.getFirstName());
        System.out.println("Kullanıcı Soyad : "+customer.getLastName());
        System.out.println("Kullanıcı Nereli : "+customer.getNationality());
        System.out.println("Kullanıcı Doğum Yılı : "+customer.getBirthDateYear());
    }

    
}