package Assignment_1;

public class String_Upper_lower {
public static void main(String args[]) {
	String s="Hello Raam";
	String s1[]=s.split(" ");
	String s2=s1[0].toLowerCase()+" "+s1[1].toUpperCase();
	
	System.out.println(s2);
	
}
}
