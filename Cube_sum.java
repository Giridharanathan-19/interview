import java.util.*;
class Cube_sum { 
    
    public boolean cubesum(int num) { 
        int original = num; 
        int sum = 0; 
        
        while (num > 0) { 
            int digit = num % 10; 
            sum += digit * digit * digit; 
            num = num / 10; 
        } 
        
        return original == sum; 
    } 
    public static void main(String[] args){
        Cube_sum obj=new Cube_sum();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(obj.cubesum(num));
        sc.close();
    }
}
