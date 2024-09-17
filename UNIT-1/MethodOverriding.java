class SuperClass {
    protected void getData() {
        System.out.println("I am from getData() method of SuperClass.");
    }
}

class MethodOverriding extends SuperClass {
    @Override
    public void getData() {
        // super.getData();
        System.out.println("I am from getData() method of MethodOverriding class.");
    }

    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.getData();
    }
}
