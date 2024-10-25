class TrainTicket{

long PNR;
int Age;
String Gender;
String Name;

public TrainTicket(){
this(1234567890L,"Rajesh Kumar");
	
}

public TrainTicket( long TrainPNR, String Name){
this(34,"Male");
this.PNR = PNR;
this.Name = Name;	
}

public TrainTicket( int Age, String Gender){
this.Age = Age;
this.Gender = Gender;

	
}


public void TrainDetails(){
	System.out.println("The Passenger PNR number is :"+PNR);
	System.out.println("The Passenger Age is :"+Age);
	System.out.println("The Passenger Gender is :"+Gender);
	System.out.println("The Passenger Name is :"+Name);
	System.out.println("--------------------");
	
}


}