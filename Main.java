import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      char st = sc.next().charAt(0);
      switch(st){
        case '+': System.out.println(a+b);
                  break;
        case '-': System.out.println(a-b);
                  break;
        case '×': System.out.println(a*b);
                  break;
        case '/': System.out.println(a/b);
                  
                  break;
        default : System.out.println("invalid");
                  break;
        
      }
  }
}