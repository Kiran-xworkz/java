class Wallet {
    int id;
    String brand;
    double noOfCompartments;
    String color;
	
	public Wallet(){	
		this(10,"Levis");
	}
	public Wallet(int id,String brand){	
		this(5.0,"balck");
		this.id=id;
		this.brand=brand;	
	}
	public Wallet(double noOfCompartments, String color){	
		this.noOfCompartments=noOfCompartments;
		this.color=color;	
	}

	
	public void MoneyBank(){
		System.out.println("-----------------------");
		System.out.println("The Wallet Id is"+id);
		System.out.println("The Wallet brand is"+brand);
		System.out.println("The Wallet noOfCompartments is"+noOfCompartments);
		System.out.println("The Wallet color is"+color);
		System.out.println("-----------------------");
	}
}


