package Assignment_1;

public class Strings_Deleteword {
public static void main(String args[]) {
	String s="Hello ram";
	String x="ram";
	String res="";
	String[] s1=s.split(" ");
	for(String s2:s1) {
		if(!s2.equals(x)) {
			res+=s2;
		}
	}
	System.out.println(res);
}
}
