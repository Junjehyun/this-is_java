package part01.chapter02.section07;

public class PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue; // 자동 타입 변환됨
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue; // 유니코드 값이 int 타입에 대입됨
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue; // 자동 타입 변환됨
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue; // 자동 타입 변환됨
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue; // 자동 타입 변환됨
        System.out.println("doubleValue: " + doubleValue);
    }
    
}
