package Assignment_1;

public class String_palindrome {
public static void main(String arg[]) {
	String s="mam";
	String s1="";
	for(int i=s.length()-1;i>=0;i--) {
		s1+=s.charAt(i);
	}
	if(s.equals(s1))
		System.out.println("palindrome");
	else
		System.out.println("not a palindrome");
}
}
