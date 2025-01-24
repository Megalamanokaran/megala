class vehicle
{
String brand;
void brandname(String brand)
{
this.brand=brand;
}
void display()
{
System.out.println("vehicle brand:"+brand);
}
}
class car extends vehicle
{
void drive()
{
System.out.println("this car very expensive:");
}
}
class bike extends vehicle
{
void ride()
{
System.out.println("this is megala bike");
}
}
public class vehicles1
{
public static void main(String args[])
{
car car=new car();
car.brandname("BMW");
car.display();
car.drive();
bike bike=new bike();
bike.brandname("royal enfield");
bike.display();
bike.ride();
}
}
