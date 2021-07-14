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
 /** public customer(){
    count=count+1;
   this.name=name;
this.address=address;
this.number=number;
this.mail=mail;
 this.proof=proof;
 this.proofId=proofId;
  }**/
  public void registration(){
    count=count+1;
    Scanner s=new Scanner(System.in);
     System.out.println("Registration");
    System.out.println("Enter your name");
    this.name=s.nextLine();
    System.out.println("Enter your address");
    this.address=s.nextLine();
    System.out.println("Contact Number");
    this.number=s.nextLine();
    System.out.println("E-Mail ID");
    this.mail=s.nextLine();
    System.out.println("Enter proof type");
    this.proof=s.nextLine();
    System.out.println("Enter proof id");
    this.proofId=s.nextLine();
    //
   //System.out.println("");
  }
  public  void customerDetail(){
    System.out.println("Customer Details");
    System.out.println(name);
    System.out.println(address);
    System.out.println(number);
    System.out.println(mail);
    System.out.println(proof);
    System.out.println(proofId);
    System.out.println("Thank you for registering. Your id is "+count+"...");
}
} 