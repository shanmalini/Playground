import java.util.*;
class Main
{
  public static void main(String args[])
  {
    customer a=new customer();
    a.registration();
    a.customerDetail();
    
  }
}
class customer
{
  int count=0;
String name;
String address;
String number;
String mail;
 String proof;
 String proofId;

  public void registration(){
    
    Scanner s=new Scanner(System.in);
     System.out.println("Enter the number of Customer");
    this.count=Integer.parseInt(s.nextLine());
    System.out.println("Enter the name");
    this.name=s.nextLine();
    System.out.println("Enter the address");
    this.address=s.nextLine();
    System.out.println("Enter the contact number");
    this.number=s.nextLine();
    System.out.println("Enter the email");
    this.mail=s.nextLine();
    System.out.println("Enter the ProofType");
    this.proof=s.nextLine();
    System.out.println("Enter the proof ID");
    this.proofId=s.nextLine();
    if(number.length()==10)
    System.out.println("Registration Successfull");
    else{
      System.out.println("Invalid Contact Number");
     System.out.println("Registration Failed");
  }}
  public  void customerDetail()
  {
    System.out.println("Your Details:");
    System.out.println(name);
    System.out.println(address);
    System.out.println(number);
    System.out.println(mail);
    System.out.println(proof);
    System.out.println(proofId);
    System.out.println("Your id is "+count);
    }
    

} 