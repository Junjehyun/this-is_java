package part01.chapter02.section10;

public class PrimitiveAndStringConversionExplain {
    /**
     * 2.10 문자열을 기본 타입으로 변환
     * 
     * 프로그램에서 문자열을 숫자 타입으로 변환하는 경우가 매우 많다. 
     * 예를 들어 '12'와 '3.5'를 정수 및 실수 타입으로 변환해서 숫자 연산을 하는 경우이다.
     * 자바에서 문자열을 기본 타입으로 변환하는 방법은 다음과 같다.
     * 
     * 변환타입
     * 
     * Stiring -> byte
     * String str = "10";
     * byte value = Byte.parseByte(str);
     * 
     * String -> short
     * String str = "200";
     * short value = Short.parseShort(str);
     * 
     * String -> int
     * String str = "300000";
     * int value = Integer.parseInt(str);
     * 
     * String -> long
     * String str = "40000000000";
     * long value = Long.parseLong(str);
     * 
     * String -> float
     * String str = "12.345";
     * float value = Float.parseFloat(str);
     * 
     * String -> double
     * String str = "12.345";
     * double value = Double.parseDouble(str);
     * 
     * String -> boolean
     * String str = "true";
     * boolean value = Boolean.parseBoolean(str);
     * 
     * 반대로 기본 타입의 값을 문자열로 변경하는 경우도 있는데, 
     * 이 경우는 간단히 String.valueOf() 메서드를 사용하면 된다. 
     * 
     * String str = String.valueOf(기본타입값);
     * PrimitiveAndStringConversionExample.java 참조
     * 
     */
}
