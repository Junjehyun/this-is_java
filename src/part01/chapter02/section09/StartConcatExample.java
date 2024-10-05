package part01.chapter02.section09;

public class StartConcatExample {
    public static void main(String[] args) {
        // 숫자 연산
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1);

        // 결합 연산 
        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2);
        // 10 + 2 = 12, 12 + "8" = "128" 이렇게 연산이 되기 때문이다.

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);
        // 10 + "2" = "102", "102" + 8 = "1028" 이렇게 연산이 되기 때문이다.

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);
        // "10" + 2 = "102", "102" + 8 = "1028" 이렇게 연산이 되기 때문이다.

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5);
        // "10" + (2 + 8) = "10" + 10 = "1010" 이렇게 연산이 되기 때문이다.

    }
}
