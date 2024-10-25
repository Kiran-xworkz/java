class Train{

long trainNo;
String noOfCoaches;
String trainName;

public Train(){
this(12627L ,"Approx. 24-26 coaches");
}

public Train( long trainNo, String noOfCoaches){
this("Karnataka Express");
this.trainNo = trainNo;
this.noOfCoaches = noOfCoaches;

}
public Train( String trainName){
this.trainName = trainName;
}

public void TrainDetails(){
	System.out.println("The Train number is :"+trainNo);
	System.out.println("The Train Name is :"+trainName);
	System.out.println("The Train Number of coaches are:"+noOfCoaches );
	System.out.println("---------------------------------" );
}
}