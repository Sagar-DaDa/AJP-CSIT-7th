public class AccessModifiers {
    public static void main(String[] args) {
        DummyData dummyData = new DummyData();
        System.out.println("Student name: " + dummyData.name);
        // System.out.println("Mobile: " + dummyData.mobile);
        System.out.println("Faculty: " + dummyData.faculty);
        System.out.println("Semester: " + dummyData.semester);
    }
}

class DummyData{
    String name = "Utsav Jung Rayamajhi";
    private int mobile = 981234567;
    public String faculty = "BSc. CSIT";
    protected int semester = 7;
}
