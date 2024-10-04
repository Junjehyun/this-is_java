package part01.chapter02.section05;

public class Boolean {
    /**
     * 논리 타입
     * 참과 거짓을 의미하는 논리 리터럴은 true와 false이다.
     * 논리 리터럴은 boolean 타입 변수에 다음과 같이 대입할 수 있다.
     * 
     */
    public static void main(String[] args) {
        boolean stop = true;
        boolean stop1 = false;
        /**
         * Boolean 타입 변수는 주로 두 가지 상태값을 저장할 필요가 있을 경우에 사용되며,
         * 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는 데 사용된다.
         * 
         * 연산식 중에서 비교 및 논리 연산의 산출값은 true 또는 false이므로,
         * boolean 타입 변수에 다음과 같이 대입할 수 있다. 연산 기호는 나중에 자세히 배움 
         *  
         */
        int x = 10;
        boolean result = (x == 20); // 변수 x의 값이 20인가? -> false
        boolean result1 = (x != 20); // 변수 x의 값이 20이 아닌가? -> true
        boolean result2 = (x > 20); // 변수 x의 값이 20보다 큰가? -> false
        boolean result3 = ( 0 < x && x < 20); // 변수 x의 값이 0보다 크고 20보다 작은가? -> true
        boolean result4 = ( x < 0 || x > 200); // 변수 x의 값이 0보다 작거나 200보다 큰가? -> false

        /**
         * 다음 예제는 stop 변수값에 따라 if 블록과 else 블록 중 하나를 실행하고, 연산식의 결과를
         * boolean 변수에 저장해서 출력한다. 
         * 
         * BooleanExample.java 참조
         */

    }
}
