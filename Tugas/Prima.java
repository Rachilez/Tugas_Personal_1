package Tugas;

import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, i, pembagi = 0;
        boolean Prima = true;

        System.out.print("Input sebuah angka bulat: ");
        n = input.nextInt();
        input.close();

        if (n == 0 || n == 1) {
            Prima = false;
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    pembagi = i;
                    Prima = false;
                    break;
                }
            }
        }

        if (Prima)
            System.out.println(n + " adalah angka prima");
        else
            System.out.println(n + " bukan angka prima karena bisa dibagi "
                    + pembagi);
    }
}