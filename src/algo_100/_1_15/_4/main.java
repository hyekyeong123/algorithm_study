package algo_100._1_15._4;

public class main {
    public static void main(String[] args) {

        // 함수 사용한 경우
        int num = 19;
        String result;
        result = Integer.toBinaryString(num);
        System.out.println(result);

        // 실제 계산해서
        int bin[] = new int[100];

        int i = 0;
        int mok = num;
        while(mok>0){
            bin[i] = mok % 2;
            mok = mok / 2;
            i++;
        }
        i--;
        for (; i>=0; i--){
            System.out.print(bin[i]);
        }
    }
}
