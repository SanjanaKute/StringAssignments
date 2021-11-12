package core.java.String.Assignment;

public class String3 
{

	public static void main(String[] args) 
	{
		String s1="Java String pool refers to collection of Strings which are stored in heap memory";
		
		String s1lower=s1.toLowerCase();                //1
		System.out.println(s1lower);
		
		String s1upper=s1.toUpperCase();               //2
		System.out.println(s1upper);
		
		String replace=s1.replace('a','$');           //3 
		System.out.println(replace);
		
		System.out.println(s1.contains("collection")); //4
		
		String s2="java string pool refers to collection of strings which are stored in heap memory"; //5
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));  //6
	}

}
