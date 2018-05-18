import java.lang.*;
class SuperClass
{
int price;
int mileage;
int fuel;
float res;
SuperClass(int x,int y,int z)
{
price=x;
mileage=y;
fuel=z;
}
int getFuel()
{
res=mileage/price;
return(fuel);
}
}
class Car extends Superclass
{
string car_name;
int getFuel()
{
int 10;
Scanner obj=new Scanner(System.in);
if(price>10)
{
System.out.println("mercedes");
}
else()
{
System.out.println("bmw");
}
rel=mileage/price;
return(fuel);
}
class Result
{
public static void main(String args[])
{
Result re1;
re1=new SuperClass(100,200,300);
re1.getFuel();
System.out.println("name of car is" +name);
}
}
}

