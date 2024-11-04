class VivoT3Runner{
public static void main(String product[]){


VivoT3  model=new VivoT3();
model.setmodelNumber("V2356");
String modelNumber=model.getmodelNumber();
model.setColor("red");
String color=model.getColor();
model.setmodelName("T3 Lite 5G");
String modelName=model.getmodelName();
model.setsimType("Dual Sim");
String simType=model.getsimType();

System.out.println("the Model Number is: "+ modelNumber);
System.out.println("the Model Color is: "+ color);
System.out.println("the Model Name  is: "+ modelName);
System.out.println("the Model SIM Type is: "+ simType);


}

}