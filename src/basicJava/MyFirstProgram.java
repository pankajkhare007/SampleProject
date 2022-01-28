package basicJava;

import otherPack.ClassWithoutMain;

public class MyFirstProgram {
	
	  int j =20;

	public static void main(String[] args) {
	
		String str=" ";
		String str1 = new String ("selenium");
		if(str.isEmpty())
		{
			System.out.println("empty");
		}
		
		MyFirstProgram obj = new MyFirstProgram();
		System.out.println(obj.j);
		obj.add(23);
		System.out.println(obj.j);
	}
	
	public void add(int j)
	{
		this.j=j;
		System.out.println(j);
		
	}
	

}
