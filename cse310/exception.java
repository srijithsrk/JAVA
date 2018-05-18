class Srk
{
public static void main(String args[])
{
int a,b,c;
try
{
 a=15;
b=0;
 c=a/b;
}
catch(Exception e)
{
System.out.println("its a exception"+e);
}
finally
{
System.out.println("executed");
}
}
}


