public class JavaClassDemo {
    public static void main(String[] args) {
        System.out.println("I am from the main method of JavaClassDemo class.");
        info();
        
    }

    public static void info(){
        System.out.println("I am from info method of JavaClassDemo");
    }

    public void demo(){
        info();
    }
}




