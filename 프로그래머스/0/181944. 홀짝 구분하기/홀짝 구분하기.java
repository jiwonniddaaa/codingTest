import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // /는 몫, %는 나머지
        if ((a % 2) == 0) {
            System.out.println(a + " is even");
        }
        else{
            System.out.println(a + " is odd");
        }
    }
}