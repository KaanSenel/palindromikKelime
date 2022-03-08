import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        while(true){
        System.out.print("Bir kelime giriniz : ");
        String input=scanner.next();
        System.out.println(isReverse(input));
        }

    }
    public static boolean isReverse(String input){

        int x=0;
        for (int i = 0; i <= (input.length() / 2) + 1; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                x++;
                //or return false
            }
        }
        return x==0 ? true : false;
        //or return true
    }
}
