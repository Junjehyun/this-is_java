package part01.chapter02.section09;

public class OperationPromotionExplain {
    public static void main(String[] args) {
        /**
         * 2.9 연산식에서의 자동 타입 변환
         * 
         * 자바는 실행 성능을 향상시키기 위해 컴파일 단계에서 연산을 수행한다.
         * 정수 리터럴 10과 20을 덧셈 계산해서 결과를 byte 타입 변수 result에 저장하는 코드를 작성한다고 가정하자.
         */
        byte result = 10 + 20; // 컴파일: byte result = 30

        /**
         * 자바 컴파일러는 컴파일 단계에서 10+20을 미리 연산해서 30을 만들고 result 변수에 30을 저장하도록
         * 바이트코드를 생성한다. 따라서 실행 시 덧셈  연산이 없으므로 실행 성능이 향상된다.
         * 
         * 하지만 정수 리터럴이 아니라, 변수가 피 연산자로 사용되면 실행 시 연산을 수행한다. 
         * 정수 타입 변수가 산술 연산식에서 피연산자로 사용되면 int타입보다 작은 byte,short 타입의 변수는 
         * int 타입으로 자동 타입 변환되어 연산을 수행한다.
         */
        byte x = 10;
        byte y = 20;
        // byte result2 = x + y; // 컴파일 에러 발생
        int x1 = 10;
        int y2 = 20;
        byte result2 = (byte) (x1 + y2); // 컴파일: byte result2 = (byte) 30

        /**
         * 특별한 이유가 없다면 정수 연산에서 변수가 사용될 경우에는 표의 오른쪽과 같이 int 타입으로 변수를
         * 선언하는 것이 좋다. 정수 연산식에서 모든 변수가 int 타입으로 변환되는 것은 아니다.
         * int 타입보다 허용 범위가 더 큰 long 타입이 피연산자로 사용되면 다른 피연산자는 long 타입으로
         * 변환되어 연산을 수행한다. 따라서 연산 결과는 long 타입 변수에 저장해야 한다.
         */

        /**
         * 이번에는 실수 연산을 알아본다. 피연산자가 동일한 실수 타입이라면 해당 타입으로 연산된다.
         * 아래 예시는 피연산자에 모두 f가 붙어있기 때문에 float 타입으로 연산한다. 
         * 따라서 결과도 당연히 float 타입이 된다.
         */
        float result3 = 1.2f + 3.4f; // 컴파일: float result = 4.6f

        /**
         * 하지만 피연산자 중 하나가 double 타입이면 다른 피연산자도 double 타입으로 변환되어 연산되고, 
         * 결과도 double 타입이 된다.
         * 
         * int 타입과 double 타입을 연산하는 경우에도 int 타입 피연산자가 double 타입으로 자동 변환되고 
         * 연산을 수행한다. 
         */
        int intValue = 10;
        double doubleValue = 5.5;
        double result4 = intValue + doubleValue; // 컴파일: double result = 15.5
        System.out.println(result4);

        /**
         * 만약 int 타입으로 연산을 해야 한다면 
         * double 타입을 int 타입으로 강제 변환하고 덧셈 연산을 수행하면 된다.
         */
        int intValue2 = 10;
        double doubleValue2 = 5.5;
        int result5 = intValue2 + (int) doubleValue2; // 컴파일: int result = 15

        /**
         * 수학에서 1을 2로 나누면 0.5가 나온다. 
         * 이것을 코드로 옮기면 다음과 같다.
         */
        int a = 1;
        int b = 2;
        double result6 = a / b; // 컴파일: double result = 0.0
        System.out.println(result6); // 과연 0.5가 나올까?

        /**
         * 결과는 0.0이 나온다. 이유는 a와 b가 모두 int 타입이기 때문에 정수 나눗셈을 수행한다.
         * 정수 나눗셈의 결과는 정수이므로 0이 된다. 따라서 0.0이 된다.
         * 위 코드의 결과가 0.5가 되기 위해서는, a와 b 중 하나가 double 타입이어야 한다.
         * 
         * 즉 정수 연산이 아니라 실수 연산으로 변경해야 한다.
         * x와 y 둘 중 하나 또는 둘 모두를 double 타입으로 변환하는 것이다. 
         * 이렇게 하면 정수 나눗셈이 아니라 실수 나눗셈을 수행하게 된다.
         */
        double result7 = (double) a / b; // 컴파일: double result = 0.5
        System.out.println(result7);

        /**
         * OperationPromotionExample.java에서 자세히 보자.
         */

    }
}