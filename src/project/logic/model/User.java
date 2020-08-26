package project.logic.model;

public class User {
    private String fName;
    // TODO : RQ - 1
    private int age;
    private String lName;
    private Address address;
    private Double salary;
    private String Dob; // new variable declared for date of birth



    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDob() {return Dob;}

    public void setDob (String dob){this.Dob = dob;}


    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", lName='" + lName + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}
