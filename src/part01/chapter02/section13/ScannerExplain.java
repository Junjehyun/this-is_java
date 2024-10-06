package part01.chapter02.section13;

public class ScannerExplain {
    /**
     * 2.13 키보드 입력 데이터를 변수에 저장 
     * 
     * 키보드로부터 입력된 데이터를 읽는 방법은 여러 가지가 있지만, 이것은 17장에서 자세히 다루기로 하고,
     * 여기서는 기업체 코딩 테스트 문제에서 주로 사용하는 방법을 소개한다. 
     * 앞으로 예제나 확인문제에서 키보드로부터 데이터를 입력받을 때 사용 할 수 있다.
     * 
     * 키보드로부터 입력된 데이터를 읽고 변수에 저장하는 가장 쉬운 방법은 SCanner 클래스를 사용하는 것이다.
     * 다음과 같이 Scanner 타입 변수를 선언하고, 대입 연산자 =를 사용해서 new 연산자로 생성한 Scanner
     * 객체를 변수에 대입한다. new 연산자는 6장에서 자세히 설명한다. 
     * 
     * Scanner scanner = new Scanner(System.in);
     * Scanner 변수 선언 = Scanner 객체 생성 
     * 
     * 그리고 다음과 같이 scanner.nextLine()을 실행하면 입력된 내용을 문자열로 읽고
     * 좌측 String 변수에 저장할 수 있다.  
     * 
     * String inputData = scanner.nextLine();
     * String 변수 = (엔터키를 누르면 입력된 문자열을 읽음)scanner.nextLine();
     * 
     * scanner.nextLine()은 엔터키가 입력되기 전까지 블로킹(대기) 상태가 되며, 엔터키가 입력되면
     * 지금까지 입력된 모든 내용을 문자열로 읽는다.
     * 
     * ScannerExample.java 참조
     */
}
