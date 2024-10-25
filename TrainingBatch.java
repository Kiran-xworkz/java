class TrainingBatch{
	
String batchName;
int noOfTrinees;
String TrainerName;
String instituteName;

TrainingBatch(){
	this("Python Mastery",25);
	
}
TrainingBatch(String batchName,int noOfTrinees){
	this("Mr. Raghav Sharma","CodeAcademy Institute");
	this.batchName=batchName;
	this.noOfTrinees=noOfTrinees;
	
}
TrainingBatch( String TrainerName, String instituteName){
	this.TrainerName=TrainerName;
	this.instituteName=instituteName;
}

public void Training(){
	System.out.println("----------------------------");
	System.out.println("The Batch Name is :"+batchName);
	System.out.println("The No od Trainees  is :"+noOfTrinees);
	System.out.println("The Trainee name is :"+TrainerName);
	System.out.println("The Institute Name  is :"+instituteName);
	System.out.println("----------------------------");
}

}