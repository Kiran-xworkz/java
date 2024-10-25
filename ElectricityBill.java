class ElectricityBill{
	
String rrNo;
long accountId;
String address;

public ElectricityBill(){
this("N-435608",110057649L);

}
public ElectricityBill( String rrNo, long accountId){
this("Malleswarm Bangalore");
this.rrNo = rrNo ;
this.accountId = accountId;

}
public ElectricityBill( String address){
this.address = address;
}

public void LightBill(){
	System.out.println("The Electricity Bill RRno is " + rrNo);
	System.out.println("The Electricity Bill AccountID is " + accountId);
	System.out.println("The Electricity Bill Address is "+ address);
	System.out.println("----------------------------");
}

}