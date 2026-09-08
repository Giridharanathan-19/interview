import java.util.*;
class Product {
    int product=1;
    public int product(int nums){
        for(int i=1;i<=nums;i++){
            if(i%2==0) product=product*i;
        }
        return product;
    }
    public static void main(String[] args) {
        Product obj=new Product();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(obj.product(num));
        sc.close();
    }
    
}
