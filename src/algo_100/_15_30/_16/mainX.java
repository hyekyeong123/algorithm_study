package algo_100._15_30._16;

import java.util.Scanner;

public class mainX {
//    XXXXXXXXXXXXX
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("임의의 숫자를 입력해주세요");
        int a = scanner.nextInt(); // 1 // 2

        System.out.println("임의의 숫자를 입력해주세요");
        int b = scanner.nextInt(); // 2 // 1

        int max; int min;
        if(a > b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }

        while(max+1 > min){
            for (int k = 1; k<= 9; k++){
                System.out.println(min + "*"+k +"="+min*k+"      ");
            }
            min = min + 1;
        }
    }
}

