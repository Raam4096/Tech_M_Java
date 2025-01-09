import java.util.Scanner;

public class Fibbnocci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
       int f1=0;
       int f2=1;
       int f3=f1+f2;
       int res=f1+f2;
       for(int i=2;i<=n;i++){
        if(i==2){
            System.out.println(f1+"\n"+f2);
        }
        
        else{

            if(f3<n){
                if(i%2==0){
                    res+=f3;}
            System.out.println(f3);
            f1=f2;
            f2=f3;
            f3=f1+f2;
            }
            else{
                break;
            }
        }
       }
       System.out.println("sum is "+res);
       
    }
}
