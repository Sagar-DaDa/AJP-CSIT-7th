public class SingleInheritance extends SingleParent {
    public static void main(String[] args) {
        SingleInheritance obj = new SingleInheritance();
        obj.a = 10;
        obj.b = 5;
        System.out.println("Total: " + obj.sum());
    }
}

class SingleParent{
    int a;
    int b;
    
    int sum(){
        return a+b;
    }

}
