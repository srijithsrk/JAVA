import java.lang.*;
class S
{
public static void main(String arr[])
{
int a[]={1,2,3,4,5};
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