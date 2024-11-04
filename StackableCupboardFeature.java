class StackableCupboardFeature{
	public static void main(String features[]){
		StackableCupboard sc = new StackableCupboard();
		sc.setColor("White");
		sc.setMaterial("Polypropylene");
		sc.setBrand("JEYANG");
		sc.setProductDimension("38D x 33W x 107H Centimeters");
		sc.setNoOfDrawers(1);
		sc.setItemWhight(240);
		sc.isAssemblyRequried(true);
		
		String color = sc.getColor();
		String material = sc.getMaterial();
		String brand = sc.getBrand();
		String productDimension = sc.getProductDimension();
		int noOfDrawers = sc.getNoOfDrawers();
		int itemWhight = sc.getItemWhight();
		boolean assemblyRequried = sc.getAssemblyRequried();
		
		System.out.println("The Color is : "+color);
		System.out.println("The Material : "+material);
		System.out.println("The Brand is : "+brand);
		System.out.println("The Product Dimension is : "+productDimension);
		System.out.println("Number of Drawers is : "+noOfDrawers);
		System.out.println("The Whight : "+itemWhight+"Grams");
		System.out.println("Assembly Requried : "+assemblyRequried);
	}
}