class TubeLight {
    int id;
    String brand;
    double price;
    int voltage;
	
	
	TubeLight(){
		this(301,"Philips");
	}
	
	TubeLight(int id, String brand){
		this(150.0,220);
		this.id=id;
		this.brand=brand;
		
	}
	TubeLight( double price,int voltage){
		this.price=price;
		this.voltage=voltage;
	}
	
	public void Flash(){
		System.out.println("----------------------");
		System.out.println("TubeLight ID is:"+id);
		System.out.println("TubeLight brand is:"+brand);
		System.out.println("TubeLight price is:"+price);
		System.out.println("TubeLight voltage is:"+voltage);
		System.out.println("----------------------");
	}
}


