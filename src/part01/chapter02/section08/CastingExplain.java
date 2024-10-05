package part01.chapter02.section08;

public class CastingExplain {
    public static void main(String[] args) {
    
        /**
         * 2.8 강제 타입 변환
         * 
         * 큰 허용 범위 타입은 작은 허용 범위 타입으로 자동 타입 변환될 수 없다.
         * 마치 큰 그릇을 작은 그릇안에 넣을 수 없는 것과 동일한 이치이다.
         * 하지만 큰 그릇을 작은 그릇 단위로 쪼개어서 한 조각만 작은 그릇에 넣는 것은 가능하다.
         * 
         * 큰 허용 범위 타입을 작은 허용 범위 타입으로 쪼개어서 저장하는 것을 강제 타입 변환(Casting)이라고 한다.
         * 강제 타입 변환은 캐스팅 연산자로 괄호 ()를 사용하는데, 괄호 안에 들어가는 타입은 쪼개는 단위이다.
         * 
         * int -> byte 
         * int 타입은 4byte, byte 타입은 1byte 메모리 크기를 가진다. 
         * 따라서 int타입이 byte타입보다 더 큰 허용범위를 가진다. 
         * int 타입은 byte 타입으로 자동 변환 되지 않고, (byte) 캐스팅을 해서 byte 타입으로 강제 변환 시켜야한다.
         * 
         * 10진수 10은 2진수 1010으로 1byte만 있으면 저장할 수 있다. int 타입은 4byte 크기를 가지므로, 
         * 10은 끝 1byte 안에 저장된다. byte 타입으로 강제 타입 변환하면 앞 3byte는 삭제되고 끝 1byte만 저장된다.
         * 따라서 강제 타입 변환을 하더라도 원래 값 10은 보존 된다. 
         * 
         * 강제 타입의 목적은 원래 값이 유지되면서 타입만 바꾸는 것이다. 그렇기 때문에 작은 허용 범위 타입에 저장될 수 있는
         * 값을 가지고 강제 타입 변환을 해야 한다. byte 타입으로 변환한다면 -128 ~ 127인 int값만 원래 값을 보존할 수 있다.
         * 
         * long -> int 
         * long 타입은 int 타입보다 큰 허용 범위를 가진다. 따라서 long 타입은 int 타입으로 자동 변환 되지 않고,
         * (int) 캐스팅을 해서 int 타입으로 강제 변환 시켜야한다. 예를 들어 300을 갖는 long 타입 변수는 8byte
         * 중에 끝 4byte로 300을 표현할 수 있다. int 타입으로 강제 변환하면 앞 4byte는 버려지고 끝 4byte만 int타입
         * 변수에 저장되므로 300이 유지된다. 
         * 
         */
        long longValue = 300;
        int intValue = (int) longValue; // 강제 타입 변환 후에 300이 그대로 유지 

        /**
         * int -> char
         * int 타입은 char 타입보다 큰 허용 범위를 가진다. 따라서 int 타입은 char 타입으로 자동 변환 되지 않고,
         * (char) 캐스팅을 해서 char 타입으로 강제 변환 시켜야한다. 
         * 주의할 점은 char 타입의 허용 범위인 0~65535 사이의 값만 원래 값을 유지한다. 
         * 
         */
        int intValue2 = 65;
        char charValue = (char) intValue2; // 강제 타입 변환 후에 65가 'A'로 변환
        System.out.println(charValue); // A

        /**
         * 실수 -> 정수
         * 
         * 실수 타입(float,double)은 정수 타입(byte,short,int,long)보다 큰 허용 범위를 가진다.
         * 따라서 대상 정수 타입으로 캐스팅해서 강제 변환 시켜야 한다. 이 경우 소수점 이하 부분은 버려지고, 
         * 정수 부분만 저장된다. 
         */
        double doubleValue = 3.14;
        int intValue3 = (int) doubleValue; // 강제 타입 변환 후에 3.14가 3으로 변환 .14 버려지고 3만 저장.

        /**
         * 자세한건 CastingExample.java 참고
         */
    
    }
}
