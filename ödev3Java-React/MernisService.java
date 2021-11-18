

public class MernisService implements ICustomerChechServise {

    @Override
    public boolean Check(Customer customer) {
        
       if(customer.getBirthDateYear()!=0&&customer.getFirstName()!=null&&customer.getId()!=0&&customer.getLastName()!=null)
       {
           return true;
       }
       else
       {
           return false;
       }
    }


    
}
