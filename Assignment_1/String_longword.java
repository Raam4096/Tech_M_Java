package Assignment_1;

public class String_longword {
public static void main(String args[]) {
	String s="Hello raam how are you";
	int max=0;
	String s1[]=s.split(" ");
	for(String x:s1) {
		if(x.length()>max) {
			max=x.length();
		}
	}
	for(String x:s1) {
		if(x.length()==max) {
			System.out.println(x+"  "+max+" length");
		}
	}
}
}
