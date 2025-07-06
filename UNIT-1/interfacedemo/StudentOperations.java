public class StudentOperations implements AccountOperations {
  public void showMessage() {
    System.out.println("This is Student Operation Class.");
  }

  @Override
  public void viewTotalFee(){
    System.out.println("Total Fee: 500000");
  };

  @Override
  public void paidFee(){
    System.out.println("Paid Fee: 260000");
  };

  @Override
  public void remainingFee(){
    System.out.println("Remaining Fee: 240000");
  };

  public static void main(String[] args) {
    StudentOperations obj = new StudentOperations();
    obj.viewTotalFee();
    obj.paidFee();
    obj.remainingFee();
    obj.showMessage();
  }

}
