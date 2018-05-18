import java.lang.*;
class S
{
public static void main(String arr[])
{
int a[]={10,20,30,40,50};
B obj=new B();
obj.marks(a);
}
}
class B
{
void marks(int x[])
{
for(int i=0;i<5;i++)
{
System.out.println("marks of subject "+(i+1)+" is:"+x[i]);
}
}
}