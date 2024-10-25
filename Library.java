class Library{
	int libraryId;
	String address;
	String type;
	String libraryOwnerName;	
	
	Library(){
		this(11,"Jayanagar,4th block,Bengaluru");
	}
	
	Library(int libraryId, String address){
		this("Public","Ravi Kumar");
		this.libraryId=libraryId;
		this.address= address;
	}
	Library(String type, String libraryOwnerName){
		this.type=type;
		this.libraryOwnerName=libraryOwnerName;
	}
	public void Book(){
	  System.out.println("The library Id is : "+libraryId);
	  System.out.println("The library address is : "+address);
	  System.out.println("The library type is : "+type);
	  System.out.println("The library library Owner Name is : "+libraryOwnerName);
	  System.out.println("---------------------------");
	  
	  
		
	}
}