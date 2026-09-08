import java.util.*;
class Name {
    public String my_Name(String names){
        return names;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        Name obj=new Name();
        System.out.print(obj.my_Name(name));
        sc.close();
    }
    
}
