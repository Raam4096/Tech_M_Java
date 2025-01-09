import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number a");
        int a =s.nextInt();
        System.out.println("enter number b");
        int b=s.nextInt();
        int len;
        
        double res=0;
        for(int i=a;i<=b;i++){
            int temp=i;
            int main=i;
            int finala=i;
            len=0;
            while(temp!=0){
                temp=temp/10;
                len++;
                
            }
            res=0;
            while(main!=0){
                int tem=main%10;
                res=res+Math.pow(tem, len);
                main=main/10;
            }
            if(finala==res)
            System.out.println((int)res);
        }
    }
}
