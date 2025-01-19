package Assignment_1;
import java.util.Arrays;
public class Strings_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="raman";
        String s1="maran";
        char[] ch1=s.toCharArray();
        char[] ch2=s1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2))
        	System.out.println("its anagram");
        else
        	System.out.println("not anagram");
        
	}

}
