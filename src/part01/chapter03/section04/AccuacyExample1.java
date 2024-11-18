package part01.chapter03.section04;

public class AccuacyExample1 {
    public static void main(String[] args) {
        /**
         * 사과 1개를 0.1 단위의 10조각으로 보고, 
         * 그 중 7조각(0.7)을 뺀 3조각(0.3)을 result 변수에 저장한다.
         * 
         */
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);

        /**
         * 출력된 결과를 보면 result 변수의 값은 정확히 0.3이 되지 않는다. 
         * 이것은 부동 소수점 방식을 사용하는 실수 타입에서 흔히 일어난다.
         * 그렇기 때문에 정확한 계산이 필요하다면 정수 연산으로 변경해서 다음과 같이 계산하는게 좋다.
         * 
         * AccuacyExample2.java 참조
         */

    }
}
