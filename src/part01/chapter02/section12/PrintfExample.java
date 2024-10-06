package part01.chapter02.section12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%6d원\n", value);
        System.out.printf("상품의 가격:%-6d원\n", value);
        System.out.printf("상품의 가격:%06d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 10인 원의 넓이:%10.2f\n", area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

        /**
         * 정수 
         * 
         * %d 정수 출력
         * %6d 6자리 정수 출력, 빈자리는 공백으로 채움
         * %-6d 6자리 정수 출력, 빈자리는 공백으로 채우고 왼쪽 정렬
         * %06d 6자리 정수 출력, 빈자리는 0으로 채움
         * 
         * 실수
         * 
         * %10.2f 정수 7자리 + 소수점 + 소수 2자리, 왼쪽 빈자리 공백
         * %-10.2f 정수 7자리 + 소수점 + 소수 2자리, 오른쪽 빈자리 공백
         * %010.2f 정수 7자리 + 소수점 + 소수 2자리, 왼쪽 빈자리 0 채움
         * 
         * 문자열
         * 
         * %s 문자열 출력
         * %6s 6자리 문자열 출력, 빈자리는 공백으로 채움
         * %-6s 6자리 문자열 출력, 빈자리는 공백으로 채우고 왼쪽 정렬
         * 
         * 특수 문자
         * 
         * \t 탭(tab)
         * \n 줄바꿈
         * \b 백스페이스
         * %% % 출력
         * 
         */
    }
}
