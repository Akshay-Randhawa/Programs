import java.io.*;
class Car implements Externalizable
{
static int age;
String name;
int year;
public Car()
{
System.out.println("default");
}
Car(String n,int y)
{
name=n;
year=y;
age=10;
}
public void writeExternal(ObjectOutput out)throws IOException
{
	System.out.println("writeExternal");
	out.writeObject(name);
	out.writeObject(year);
	out.writeObject(age);
}
public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException
{
	System.out.println("readExternal");
	year=in.readInt();
	age=in.readInt();
}
public String toString()
{
	return("Name:"+name+"\n"+"Year:"+year+"\n"+"age:"+age);
}
}
class ExternalExample
{
public static void main (String[] args)
{
//create a car object 
Car car = new Car("Mitsubishi",2009);
Car newCar=null;
//Serialize the car
try
{
FileOutputStream fo = new FileOutputStream("tmp");
ObjectOutputStream so=new ObjectOutputStream(fo);
so.writeObject(car);
so.flush();
}
catch(Exception e)
{
System.out.println(e);
}
//deseriallize the car
try
{
FileInputStream fi = new FileInputStream("Temp");
ObjectInputStream si =new ObjectInputStream(fi);
newCar= (Car)si.readObject();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("The Original Car is");
System.out.println(car);
System.out.println("The New Car is");
System.out.println(newCar);	
}
}


