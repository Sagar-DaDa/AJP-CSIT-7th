import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private String mobile;
    private String gender;

    Student(String name, String mobile, String gender) {
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name=" + name + "\nMobile=" + mobile + "\nGender=" + gender;
    }
}