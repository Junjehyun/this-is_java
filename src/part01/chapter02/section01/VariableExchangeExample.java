package part01.chapter02.section01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x: " + x + ", y: " + y);

        int temp = x; // 변수 x값 3을 temp에 대입
        x = y; // 변수 x에 변수 y값 5를 대입
        y = temp; // 변수 y에 temp값 3을 대입
        System.out.println("x: " + x + ", y: " + y);
    }
}
