package part01.chapter02.section04;

public class FloatDouble {
    public static void main(String[] args) {
        /**
         * 실수 타입
         * 
         * 실수 타입은 소수점이 있는 숫자를 저장하는 데 사용된다.
         * 실수 타입에는 float과 double이 있다. 다음과 같이 메모리 할당 크기와 저장되는 값의 범위를 가지고있다.
         * 
         * float : 4byte, 32bit, 1.4E-45 ~ 3.4E38
         * double : 8byte, 64bit, 4.9E-324 ~ 1.8E308
         * 
         * double타입이 float타입보다 큰 실수를 저장할 수 있고 정밀도 또한 높다.
         * 그렇기 때문에 자바에서는 double타입을 주로 사용하고, float타입은 특별한 경우에만 사용한다.
         * 
         * 컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석하기 때문에 double 타입 변수에 대입해야한다.
         * float 타입 변수에 대입하려면 리터럴 뒤에 f 또는 F를 붙여야 한다.
         * 그래야 float 타입임을 알 수 있다.
         * 
         */
        double var = 3.14;
        double var1 = 314e-2; // 314 * 10^-2 = 3.14

        float var2 = 3.14f; // float 타입 리터럴
        float var3 = 3E6F; // 3 * 10^6 = 3000000.0

        /**
         * 다음 예제
         * 
         * FloatDoubleExample.java 참조
         */
    }
}
