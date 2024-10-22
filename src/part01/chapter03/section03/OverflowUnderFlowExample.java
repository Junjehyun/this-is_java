package part01.chapter03.section03;

public class OverflowUnderFlowExample {
    public static void main(String[] args) {
        
        byte var1 = 125;

        for(int i=0; i<5; i++) { //{}를 5번 반복 실행
            var1++; // ++연산은 var1의 값을 1 증가시킨다. 
            System.out.println("var1: " + var1);
        }

        System.out.println("---------------------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) { //{}를 5번 반복 실행
            var2--; // --연산은 var2의 값을 1 감소시킨다.
            System.out.println("var2: " + var2);
        }
    /**
     * 연산 과정 중에 발생하는 오버플로우와 언더플로우는 우리가 기대하는 값이 아니므로, 항상 해당 타입의 범위 내에서
     * 연산이 수행되도록 코딩에 신경써야 한다. 만약 연산 과정에서 int 타입 오버플로우 또는 언더플로우가 발생될 가능성이
     * 있다면 long타입 연산으로 하도록 하여야한다.
     */
    int x = 1000000;
    int y = 1000000;
    int z = x * y; // z: -727379968; int 타입의 범위를 초과하여 오버플로우 발생

    /**
     * 위 코드는 1000000 * 1000000 = 1000000000000 이라는 결과를 기대하지만, int 타입의 범위를 초과하여
     * 오버플로우가 발생하여 -727379968 이라는 값이 출력된다. 
     * 따라서 이러한 경우에는 long 타입으로 연산을 수행해야 한다.
     * 
     * long z = x * y; // z: 1000000000000
     */
    }
}
