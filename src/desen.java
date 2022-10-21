import java.util.Scanner;

public class desen {
    static void desen(int a){
        System.out.print(a + " ");
        if(a > 0){
            desen(a - 5);
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int n = inp.nextInt();
        desen(n);
    }
}
