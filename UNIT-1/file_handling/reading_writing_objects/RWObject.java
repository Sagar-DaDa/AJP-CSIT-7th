import java.io.*;

public class RWObject {
    public static void main(String[] args) {
        Student p1 = new Student("Rohan", "9812345678", "Male");
        Student p2 = new Student("Pratik", "9887654321", "Male");

        try {
            // Writing objects to file
            FileOutputStream fos = new FileOutputStream("myObjects.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.close();
            fos.close();

            // Reading objects from file
            FileInputStream fis = new FileInputStream("myObjects.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student pr1 = (Student) ois.readObject();
            Student pr2 = (Student) ois.readObject();
            ois.close();
            fis.close();

            // Output the read objects
            System.out.println(pr1);
            System.out.println(pr2);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}