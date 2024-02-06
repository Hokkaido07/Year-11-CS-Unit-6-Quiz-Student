public class Student {
    //properties
    private int age;
    private String firstName;
    private String lastName;
    private int year;
    private Address address;

    //constructor
    public Student(int age, String firstName, String lastName , int year, Address address){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.address = address;
    }

    //methods
    public int getAge(){
        return age;
    }

    public String getFirstname(){
        return firstName;
    }

    public String getLastname(){
        return lastName;
    }

    public int getYear(){
        return year;
    }

    public Address getAddress(){
        return address;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void getYear(int year){
        this.year = year;

    }

    public void getAddress(Address address){
        this.address = address;
    }

    private void addOneAge(){
        age = getAge() + 1;
    }

    public int birthday(){
        addOneAge();
        return age;
    }

    public String toString(){
        return firstName + " " + lastName + ", age " + age + ", year " + year + ", " + address;
    }


}
