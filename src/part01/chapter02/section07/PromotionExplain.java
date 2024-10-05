package part01.chapter02.section07;

public class PromotionExplain {
    /**
     * 2.7 자동 타입 변환 
     * 
     * 자동 타입 변환(promotion)은 말 그대로 자동으로 타입 변환이 일어나는 것을 말한다. 
     * 자동 타입 변환은 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 발생한다. 
     * 
     * 기본 타입을 허용 범위 순으로 나열하면 다음과 같다. 
     * byte < short, char < int < long < float < double
     * 
     * int 타입이 byte 타입보다 허용 범위가 더 크기 때문에 다음 코드는 자동 타입 변환이 일어난다. 
     * byte byteValue = 10;
     * int intValue = byteValue; // 자동 타입 변환됨
     * 
     * byte 타입은 1byte, int 타입은 4byte 메모리 크기를 가진다.
     * 
     * 정수 타입이 실수 타입으로 대입될 경우에는 무조건 자동 타입이 변환이 된다. 
     * 실수 타입은 정수 타입보다 허용 범위가 크기 때문이다.
     * 
     */
    long longValue = 50000000000L;
    float floatValue = longValue; // 자동 타입 변환됨 5.0E10
    double doubleValue = longValue; // 자동 타입 변환됨 5.0E10

    /**
     * char 타입의 경우 int 타입으로 자동 변환되면 유니코드 값이 int 타입에 대입된다. 
     */
    char charValue = 'A';
    int intValue = charValue; // 자동 타입 변환됨 65

    /**
     * 다음은 자동 타입 변환이 생기는 다양한 코드들이다. 
     * PromotionExample.java 참고
     */
}
