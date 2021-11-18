

public class StarbucksCustomerManager extends BaseCustomerManager{

    private ICustomerChechServise chechServise;

    public void setChechServise(ICustomerChechServise chechServise) {
        this.chechServise = chechServise;
    }

    
    public void CheckSave(Customer customer)
    {
        if(chechServise.Check(customer))
        {
            super.Save(customer);
        }
        else
        {
            System.out.println("Kullanıcı Hatası");
        }
    }

}
