class BillRunner{
public static void main(String product[]){


Bill  bill1=new Bill(1 ,250.00);
bill1.setBillId(12);
int billId=bill1.getBillId();
bill1.setBillAmount(250.00);
double billAmount=bill1.getBillAmount();
bill1.setBillName("Mouse");
String billName=bill1.getBillName();
bill1.setBillAddress("Bangalore");
String billAddress=bill1.getBillAddress();
bill1.setIsBillPaid(true);
boolean isbillPaid=bill1.getIsBillPaid();

System.out.println("the bill id is: "+ billId);
System.out.println("the bill Amount is: "+ billAmount);
System.out.println("the bill Name is: "+ billName);
System.out.println("the bill Address is: "+ billAddress);
System.out.println("the bill paid is: "+ isbillPaid);


}

}