package part01.chapter03.section01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x=" + x);

        byte b = 100;
        int y = -b;
        System.out.println("y=" + y);
    }

    /**
     * 증감 연산자(++,--)는 변수의 값을 1 증가시키거나 1 감소시키는 연산자이다.
     * 
     * ++피연산자 : 피연산자의 값을 1 증가시킨다.
     * --피연산자 : 피연산자의 값을 1 감소시킨다.
     * 
     * 피연산자++ : 다른 연산을 수행한 후에 피연산자의 값을 1 증가시킴.
     * 피연산자-- : 다른 연산을 수행한 후에 피연산자의 값을 1 감소시킴.
     * 
     * 변수 단독으로 증감 연산자가 사용될 경우에는 변수의 앞뒤 어디에든 붙어도 결과는 같다.
     * 
     * ++i;
     * i++;
     * 모두 i = i + 1; 과 같은 의미이다.
     * 
     * --i;
     * i--;
     * 모두 i = i - 1; 과 같은 의미이다.
     * 
     * 하지만 여러 개의 연산자가 포함되어 있는 연산식에서는 증감 연산자의 위치에 따라 결과가 달라진다. 
     * 증감 연산자가 변수 앞에 있으면 우선 변수를 1 증가 또는 1 감소시킨 후에 다른 연산을 수행한다. (선순위)
     * 증감 연산자가 변수 뒤에 있으면 다른 연산을 수행한 후에 변수를 1 증가 또는 1 감소시킨다. (후순위)
     * 
     * int x = 1;
     * int y = 1;
     * int result1 = ++x + 10; // x를 1 증가 -> int result1 = 2 + 10;
     * int result2 = y++ + 10; // int result2 = 1 + 10; -> y를 1 증가 (연산이 우선)
     * 
     * 위 코드에서 result1은 12, result2는 11이 된다. 그리고 최종 x와 y의 값은 2가 된다.
     * 
     * IncreaseDecreaseOperatorExample.java 참조
     */
}
