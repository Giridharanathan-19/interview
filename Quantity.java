import java.util.*;
public class Quantity { 
    public double bill(int quantity1, int quantity2, int quantity3, int price1, int price2, int price3) {
        return (quantity1 * price1) + (quantity2 * price2) + (quantity3 * price3);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Quantity obj=new Quantity();
        int quant1=sc.nextInt();
        int quant2=sc.nextInt();
        int quant3=sc.nextInt();
        int price1=sc.nextInt();
        int price2=sc.nextInt();
        int price3=sc.nextInt();
        System.out.println(obj.bill(quant1, quant2, quant3, price1, price2, price3));
        sc.close();
        

    }
}
