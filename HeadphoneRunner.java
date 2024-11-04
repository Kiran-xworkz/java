class HeadphoneRunner{
public static void main(String product[]){


Headphone  model=new Headphone();
model.setmodelID(1);
int modelID=model.getmodelID();
model.setcolor("red");
String color=model.getcolor();
model.setheadphoneType("Bangalore");
String headphoneType=model.getheadphoneType();
model.setconnectivity("Bluetooth");
String connectivity=model.getconnectivity();

System.out.println("the Model id is: "+ modelID);
System.out.println("the Model Color is: "+ color);
System.out.println("the Model HeadPhone type  is: "+ headphoneType);
System.out.println("the Model connectivity is: "+ connectivity);


}

}