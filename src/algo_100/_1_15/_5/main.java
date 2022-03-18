package algo_100._1_15._5;

public class main {
    public static void main(String[] args) {

        // 아스키코드 대문자와 소문자(32 더 많음)는 32('a' - 'A' = 32)의 차이가 남
        // 아스키 코드 A-65  Z-90  a-97  z-122

        String inputString = "helloWorlD";

        // 먼저 배열로 변환
        char[] arr = new char[inputString.length()];

        for (int i= 0; i<inputString.length(); i++){

            int a = inputString.charAt(i);

            // 사실 toCharArray()를 사용하면 편함

           // 소문자이면 대문자로 전환
            if(a > 96){
                a = a - 32;
            }else{
                a = a + 32;
            }

            // 숫자가 기억 안 날경우
            // if(a >= 'a' && a <= 'z') // 소문자인 경우

            arr[i] = (char) a;
        }
        System.out.println(arr);
    }



}
