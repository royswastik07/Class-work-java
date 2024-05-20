package fun;
public class Student {
    private String regNo;
    private String phoneNumber;
    private String name;

    public Student(String regNo, String phoneNumber, String name) {
        this.regNo = regNo;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Registration Number: " + regNo + ", Phone Number: " + phoneNumber + ", Name: " + name;
    }
}
