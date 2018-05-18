import java.lang.*;
import java.util.*;
abstract class Vehicle()
{
char name[23];
abstract void speed();
}
abstract class Car extends Vehicle
{
abstract speed();
}
class Jeep extends Car
{
speed()
{
System.out.println("no 1 can touch me");
}
public static void main(String[] args)
{
car c;
c.speed()
}


