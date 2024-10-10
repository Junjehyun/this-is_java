package part01.chapter03.section01;

public class SignOperatorExplain {
    public static void main(String[] args) {
        /**
         * 부호 연산자는 변수의 부호를 유지하거나 변경한다.
         * 
         * + : 피연산자 : 피연산자의 부호 유지 
         * - : 피연산자 : 피연산자의 부호 변경
         * 
         * + 연산자는 잘 사용되지 않고, - 연산자는 변수값의 부호를 변경할 때 사용된다. 주의할 점은 부호 변경 후의 타입이다.
         * 다음 코드는 컴파일 에러가 발생한다.
         * 
         */
        byte b = 100;
        // byte result = -b; // 컴파일 에러

        /**
         * 정수 타입(byte, short, int) 연산의 결과는 int 타입이다. 부호를 변경하는 것도 연산이므로 다음과 같이 
         * int 타입 변수에 대입해야 한다.
         * 
         */
        byte c = 100;
        // int result = -c; 

        /**
         * SignOperatorExample.java 참조
         */
    }
}
