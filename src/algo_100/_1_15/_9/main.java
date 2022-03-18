package algo_100._1_15._9;

public class main {
    public static void main(String[] args) {
        int input = 1242;
        System.out.println(stringMethod(input));
    }

    // 문자열로 만들어서 charAt을 이용하여 하나씩 뽑기(내 방법)
    public static Integer stringMethod(int input){
        String a = ""+input;
        int result = 0;
        for (int i = 0; i<a.length(); i++){
            result = result + Character.getNumericValue(a.charAt(i));
            // Character.getNumericValue() 없이 더해버리면 아스키코드를 더해버린다.
        }
        return result;
    }

    // 10으로 나눈 나머지들을 추출
    public static Integer intMethod(int input){
        int result = 0;
        while (input > 0){
            result += (input % 0); // 2
            input = input / 10; // 123
        }
        return result;
    }
}
