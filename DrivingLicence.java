class DrivingLicence{
	String dlNo;
	String name;
	String dob;
	String validTill;
	String bloodGroup;
	String fatherName;
	String rtoOfficeNumber;
	
	DrivingLicence(){
	 this("KA46 2020003345","Abhishek","10/03/2001");
	}
	DrivingLicence(String dlNo,String name,String dob){
	this("04/10/2040","A+","Shekhar","K46");
	 this.dlNo=dlNo;
	 this.name=name;
	 this.dob=dob;
	 
	}
	DrivingLicence(String validTill,String bloodGroup,String fatherName,String rtoOfficeNumber){
	 
	 this.validTill=validTill;
	 this.bloodGroup=bloodGroup;
	 this.fatherName=fatherName;
	 this.rtoOfficeNumber=rtoOfficeNumber;
	}
	
	public void DrivingDetails(){
		System.out.println("--------------------------------");
		System.out.println("The Dl number is:"+dlNo);
		System.out.println("The Dl Name is:"+name);
		System.out.println("The Dl Date of Birth is:"+dob);
		System.out.println("The Dl Valid Till is:"+validTill);
		System.out.println("The Dl Blood Group is:"+bloodGroup);
		System.out.println("The Dl Father Name is:"+fatherName);
		System.out.println("The Dl RTO Office Number is:"+rtoOfficeNumber);
		System.out.println("--------------------------------");
		
		
	}
}