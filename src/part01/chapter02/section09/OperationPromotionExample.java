package part01.chapter02.section09;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20; // 컴파일 단계에서 연산
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2; // int 타입으로 변환 후 연산
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5; // long 타입으로 변환 후 연산
        System.out.println("result3: " + result3);

        char v6 = 'A';
        int v7 = 1;
        int result4 = v6 + v7; // int 타입으로 변환 후 연산
        System.out.println("result4: " + result4);
        System.out.println("result4 char: " + (char) result4);

        int v8 = 10;
        int result5 = v8 / 4; // 정수 연산의 결과는 정수 
        System.out.println("result5: " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0; // double 타입으로 변환 후 연산 
        System.out.println("result6: " + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10 / v11; // double 타입으로 변환 후 연산
        System.out.println("result7: " + result7);

        /**
         * 자바에서 + 연산자는 두 가지 기능을 가지고 있다. 피연산자가 모두 숫자일 경우에는 덧셈 연산을 수행하고,
         * 피연산자 중 하나라도 문자열일 경우에는 문자열 연결 연산을 수행한다.
         * 
         * int value = 3 + 7; -> int value = 10;
         * String str = "3" + 7; -> String str = "3" + "7" -> String str = "37";
         * String str = 3 + "7"; -> String str = "3" + "7" -> String str = "37";
         * 
         * 연산식에서 + 연산자가 연이어 나오면 앞에서부터 순차적으로 + 연산을 수행한다. 먼저 수행된 연산이 덧셈 연산이라면,
         * 덧셈 결과를 가지고 그 다음 + 연산을 수행한다. 만약 먼저 수행된 연산이 결합 여산이라면 이후 + 연산은 모두 결합 연산이 된다.
         */
        int value = 1 + 2 + 3; // -> int value = 3 + 3 -> int value = 6;
        String str = 1 + 2 + "3"; // -> String str = 3 + "3" -> String str = "33";
        String str1 = 1 + "2" + 3; // -> String str1 = "12" + 3 -> String str1 = "123";
        String str2 = "1" + 2 + 3; // -> String str2 = "1" + 2 -> String str2 = "12" + 3 -> String str2 = "123";

        // 앞에서 순차적으로 + 연산을 수행하지 않고 특정 부분을 우선 연산하고 싶다면 해당 부분을 괄호()로 감싸면 된다.
        // 괄호는 항상 최우선으로 연산을 수행한다.
        String str3 = "1" + (2 + 3); // -> String str3 = "1" + 5 -> String str3 = "15";

        /**
         * StartConcatExample.java 참조
         */
    }
}
