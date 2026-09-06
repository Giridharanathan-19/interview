import java.util.*;
public class Conditional1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int bill=0;
        if(units>0&&units<=100){
            bill=units*2;
            System.out.print(bill);
        }
        else if(units>100&&units<=200){
            bill=units*3;
            System.out.print(bill);
        }
        else if(units>200&&units<=300){
            bill=units*5;
            System.out.print(bill);
        }
        else if(units>300){
            bill=units*7;
            System.out.print(bill);
        }
        else{
            System.out.print(bill);
        }
        sc.close();
}
}