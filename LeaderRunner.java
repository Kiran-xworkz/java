class LeaderRunner{
public static void main(String product[]){


Leader model=new Leader();
model.setmodelNumber("Beast 26T with Front Suspension and Disc Brake and Complete Accessories");
String modelNumber=model.getmodelNumber();
model.setColor("Matte Black");
String color=model.getColor();
model.setmodelName("Beast 26T with Front Suspension and Disc Brake and Complete Accessories");
String modelName=model.getmodelName();
model.setMudguard("No Mudguard");
String Mudguard=model.getMudguard();
model.setTire("26 x 2.40 Extra Wide Tyres");
String Tire=model.getTire();

System.out.println("the Model  name  is: "+ modelName);
System.out.println("the part Number is: "+ modelNumber);
System.out.println("the Model Color is: "+ color);
System.out.println("the Model Portable  is: "+ Mudguard);
System.out.println("the Model maximum Brightness  is: "+ Tire);



}

}