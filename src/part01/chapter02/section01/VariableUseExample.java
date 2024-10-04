package part01.chapter02.section01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");

        int totalMinute = (hour * 60) + minute;
        System.out.println("총 " + totalMinute + "분");

        /**
        * 변수는 다른 변수에 대입되어 메모리 간에 값을 복사할 수 있다. 
        * 다음 코드는 변수 x를 변수 y값으로 복사한다.
        */ 
        int x = 10; // 변수 x에 10을 대입
        int y = x; // 변수 y에 변수 x값을 대입

        /**
         * 다음 예제는 두 변수의 값을 교환하는 방법을 보여준다. 두 변수의 값을 교환하기 위해서
         * 새로운 변수 temp를 선언한 것에 주목하길
         * 
         * VariableExchangeExample.java 참조
         */

    }
}
