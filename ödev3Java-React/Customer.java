

public class Customer {

    private int id,birthDateYear;
    private String  firstName,lastName,nationality;



    public int getId() {
        return this.id;
    }


    public int getBirthDateYear() {
        return this.birthDateYear;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void allSet(String firstName,String lastName,int id,int birthDateYear,String nationality) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.id=id;
        this.birthDateYear=birthDateYear;
        this.nationality=nationality;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getNationality() {
        return this.nationality;
    }

    
}
