import java.util.*;
class Add {
    public int add(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Add obj=new Add();
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print(obj.add(num1, num2));
        sc.close();
    }
    
}
