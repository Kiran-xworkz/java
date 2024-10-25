class Pg{
	 String pgOwner;
	 int rent;
	 int noOfFloors;
	 String pgAddress;
	 
	 Pg(){
		 this("Venugopal Reddy",5000);
		 
	 }
	 
	 Pg(String pgOwner,int rent){
		 this(4,"Rajajinagar,Bengaluru);
		 this.pgOwner=pgOwner;
		 this.rent=rent;
		 
	 }
	 Pg( int noOfFloors,String pgAddress){
		 this.noOfFloors=noOfFloors;
		 this.pgAddress=pgAddress;
	 }
	 public void Details(){
		 System.out.println("---------------------");
		System.out.println("Name of the PgOwner:"+pgOwner);
		System.out.println("Rent Of PG:"+rent);
		System.out.println("No of Floors :"+noOfFloors);
		System.out.println("PG Address is:"+pgAddress);
		System.out.println("---------------------");
	 }
}