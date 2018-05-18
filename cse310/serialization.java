import java.lang.*;
import java.util.*;
class Sri implements serializable
{
string a;
int b;
float c;
Sri( string a,int b,float c)
{
this.a=a;
this.b=b;
this.c=c;
}
public String toString()
{
return "a=+a;b=+b;c=+c";
}
class SriSerialize
{
public static void main(String args[])
{
try{
Sri obj =new SRI("hi",3,3.5);
System.out.println("obj1 : +obj");
FileOutputStream fos=new FileOutputStream("abc.txt");
ObjectOutputStream=new ObjectOutputStream(fos);
aab.writeObject(obj);
aab.close();
}
catch(IOException e)
{
System.out.println("exception during serialization: "+e);
}
}
}

