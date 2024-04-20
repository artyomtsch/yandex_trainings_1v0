import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] temps = sc.nextLine().split(" ");
        int troom = Integer.parseInt(temps[0]);
        int tcond = Integer.parseInt(temps[1]);
        String mode = sc.nextLine();

        if (mode.equals("freeze")) {
            System.out.println(Math.min(troom,tcond));
        } else if (mode.equals("heat")) {
            System.out.println(Math.max(troom,tcond));
        } else if (mode.equals("auto")) {
            System.out.println(tcond);
        } else {
            System.out.println(troom);
        }
    }
}