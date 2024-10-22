package part01.chapter03.section03;

public class OverFlowUnderFlowExplain {
    /**
     * 3.3 오버플로우(Overflow)와 언더플로우(Underflow)
     * 
     * 오버플러우란 타입이 허용하는 최대값을 벗어나는 것을 말한다. 
     * 반대로 언더플로우는 타입이 허용하는 최소값을 벗어나는 것을 말한다. 
     * 정수 타입 연산에서 오버플로우 또는 언더플로우가 발생되면 실행 에러가 발생할 것 같지만, 
     * 그렇지는 않고 해당 정수 타입의 최소값 또는 최대값으로 되돌아간다.
     * 
     * 예를 들어 byte 타입일 경우 최대값 127에서 1을 더하면 128이 되어 오버플로우가 발생하여 연산 결과는 최소값인
     * -128이 된다. 
     * 
     * byte value = 127;
     * value++; // value값에 1을 더하면 128이 되어 오버플로우가 발생하여 -128이 된다.
     * System.out.println(value); // -128
     * 
     * 마찬가지로 -128에서 1을 빼면 -129가 되어 언더플로우가 발생하는데, 연산 결과는 최대값이 127이 된다.
     * 그리고 다시 1을 빼면 126이 된다.
     * 
     * byte value = -128;
     * value--; // value값에 1을 빼면 -129가 되어 언더플로우가 발생하여 127이 된다.
     * System.out.println(value); // 127
     * 
     * short, int, long 타입은 값의 범위만 다를 뿐 오버플로우 및 언더플로우가 발생했을 때 마찬가지로
     * 최소값 또는 최대값으로 되돌아간다.
     * 
     * OverflowUnderFlowExample.java 파일 참조
     */
}
