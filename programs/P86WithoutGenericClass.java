//without objects

class LogicNonGen

{
	Object ob;
	Object display(Object ob)
		{
			this.ob=ob;
			return ob;
		}
	void belonging()
			{
	System.out.println("anything is" +ob.getClass().getName());
			}
}

class P86WithoutGenericClass
{
	public static void main(String args[])
		{
		LogicNonGen obj=new LogicNonGen();
		int a=(Integer)obj.display(44);
		System.out.println(""+a);
		obj.belonging();

		LogicNonGen obj1=new LogicNonGen();
		String s=(String)obj1.display("seefhkwjf");
		System.out.println(""+s);
		obj1.belonging();

		obj=obj1;



		
		}
		
		
}
	
