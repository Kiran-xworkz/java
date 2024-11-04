class NovaRunner{
public static void main(String product[]){


Nova  model=new Nova();
model.setmodelNumber("NHP 8100");
String modelNumber=model.getmodelNumber();
model.setColor("Blue");
String color=model.getColor();
model.setmodelName("Silky Shine Hot And Cold Foldable");
String modelName=model.getmodelName();
model.setBrand("NOVA");
String Brand=model.getBrand();

System.out.println("the Model Brand name  is: "+ Brand);
System.out.println("the Model Number is: "+ modelNumber);
System.out.println("the Model Color is: "+ color);
System.out.println("the Model Name  is: "+ modelName);



}

}