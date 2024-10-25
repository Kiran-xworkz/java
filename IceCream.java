class IceCream {
    int id;
    String brand;
    String flavors;
    String type;
    int quantity;
	
	public IceCream(){
		this(402,"Kwality Walls");	
	}
	public IceCream(int id, String brand){
		this("Chocolate","Stick",120);
		this.id = id;
		this.brand = brand;
		
	}
	public IceCream( String flavors,String type, int quantity){
		this.flavors = flavors;
		this.type = type;
		this.quantity = quantity;
		
	}
	
	
	public void Display(){
	System.out.println("The Pen Brand Name is:"+ id);
	System.out.println("The Pen Brand Name is:"+ brand);
	System.out.println("The Pen Price is:"+flavors);
	System.out.println("The Pen Color is:"+type);
	System.out.println("The Type ofthe pen is:"+quantity);
	System.out.println("--------------------");
}
}

