class Harpic {
    int id;
    int quantity;
    double price;
    String color;
	
	Harpic(){
		this(101,500);	
		
	}
	Harpic(int id,int quantity){
		this(150);
		this.id=id;
		this.quantity=quantity;
		
	
	}
	Harpic(double price){
		this.price=price;
	
	}
	
	public void  View(){
		System.out.println("---------------------");
		System.out.println("Id of Harpic:"+id);
		System.out.println("Quantity of Harpic:"+quantity);
		System.out.println("Price of Harpic:"+price);
		System.out.println("Color of Harpic:"+color);
		System.out.println("---------------------");
	}
}

