package Assignment_1;

public class String_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="Hello ram how are you ram ";
         String s1[]=s.split(" ");
         String ns="";
         int count=0;
         for(int i=0;i<s1.length;i++) {
        	 count=0;
        	 for(String x:s1) {
        		 if(x.equals(s1[i])) {
        			 count++;
        	       		 }
        	 }
        	 if(count==1) {
        		 ns+=s1[i]+" ";
        	 }
         }
         System.out.println(ns);
	}

}
