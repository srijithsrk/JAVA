import java.lang.*;
import java.util.*;
class LogicGen<anything>
{
anything ob;
anything get(anything ob)
{
this.ob=ob;
return ob;	
}
void srijith()
{
System.out.println("thats it it is" +ob.getClass().getName());
}
}
class Implement 
{
int arr[5]={10,20,30,40};
int sum;
float avg;
void demo()
{
System.out.println("calculate the average of array");
}
}
class Results extends Implement
{
public static void main(String args[])
{
int arr[5]={10,20,30,40};
int sum;
float avg;
LogicGen<integer> ob1=new LogicGen<integer>();
int a =IntegerParseInt(arr[0]);
int b =IntegerParseInt(arr[1]);
int c =IntegerParseInt(arr[2]);
int d =IntegerParseInt(arr[3]);
sum=a+b+c+d;
avg=sum/4;
ob1.srijith();
ob1.demo();
}
}




