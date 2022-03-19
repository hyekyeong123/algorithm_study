package baekjoon.onearr;

import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = a * b * c;
        String sresult = result+"";

        scanner.close();

        for (int i = 0; i<sresult.length(); i++){
            arr[result % 10]++;
            result = result/10;
        }

        // 음.....
        for(Object r : arr){
            System.out.println(r);
        }
    }
}
