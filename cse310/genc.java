class T<A extends Number>
{
A num;
T(A nums)
{
num=nums;
}
void display()
{
System.out.println(num);
}
public static void main(String ...args)
{
T<Integer> o=new T<Integer>(44);
o.display();
}
}