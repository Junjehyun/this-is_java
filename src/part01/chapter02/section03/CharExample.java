package part01.chapter02.section03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A'; // 문자 저장
        char c2 = 65; // 유니코드 직접 저장

        char c3 = '가'; // 문자 저장
        char c4 = 44032; // 유니코드 직접 저장

        System.out.println(c1); // A
        System.out.println(c2); // A

        System.out.println(c3); // 가
        System.out.println(c4); // 가

        /**
         * char 타입의 변수에 어떤 문자도 대입하지 않고 단순히 초기화를 할 목적으로 
         * 다음과 같이 작은 따옴표('')를 사용하면 컴파일 오류가 발생한다.
         * 이 경우는 공백(유니코드:32) 하나를 포함해서 초기화하면 오류가 발생하지 않는다.
         *  
         */
        // char c5 = ''; // 컴파일 오류
        char c5 = ' '; // 공백 문자 저장 (공백 하나를 포함해서 초기화)

        /**
         * 정수와 실수 
         * 
         * FloatDouble.java 참조
         */

    }
}
