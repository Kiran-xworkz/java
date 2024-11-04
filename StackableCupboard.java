class StackableCupboard{
	
	private String color;
	private String material;
	private String brand;
	private String productDimension;
	private int noOfDrawers;
	private int itemWhight;
	private boolean assemblyRequried;
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setMaterial(String material){
		this.material = material;
	}
	
	public String getMaterial(){
		return material;
	}
	
	public void setBrand(String Brand){
		this.brand = brand;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public void setProductDimension(String productDimension){
		this.productDimension = productDimension;
	}
	
	public String getProductDimension(){
		return productDimension;
	}
	
	public void setNoOfDrawers(int noOfDrawers){
		this.noOfDrawers = noOfDrawers;
	}
	
	public int getNoOfDrawers(){
		return noOfDrawers;
	}
	
	public void setItemWhight(int itemWhight){
		this.itemWhight = itemWhight;
	}
	
	public int getItemWhight(){
		return itemWhight;
	}
	
	public void isAssemblyRequried(boolean assemblyRequried){
		this.assemblyRequried = assemblyRequried;
	}
	
	public boolean getAssemblyRequried(){
		return assemblyRequried;
	}
}