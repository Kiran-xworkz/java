class Egatei9Runner{
public static void main(String product[]){


Egatei9 model=new Egatei9();
model.setpartNumber("Ei9027");
String partNumber=model.getpartNumber();
model.setColor("White");
String color=model.getColor();
model.setmodelName("i9");
String modelName=model.getmodelName();
model.setPortable("No");
String Portable=model.getPortable();
model.setmaximumBrightness("8400 lm");
String maximumBrightness=model.getmaximumBrightness();

System.out.println("the Model  name  is: "+ modelName);
System.out.println("the part Number is: "+ partNumber);
System.out.println("the Model Color is: "+ color);
System.out.println("the Model Portable  is: "+ Portable);
System.out.println("the Model maximum Brightness  is: "+ maximumBrightness);



}

}