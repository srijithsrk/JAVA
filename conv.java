import java.lang.*;
class W
{
public static void main(String arr[])
{
float a[]={1.1f,2.2f,3.3f,4.4f,5.5f};
int b[]=(int)a[];
D obj=new D();
obj.marks(b);
}
}
class D
{
int[] marks(int x[])
{
for(int i=0;i<5;i++)
{
System.out.println("marks of subject "+(i+1)+" is:"+x[i]);
}
}
}