package part01.chapter02.section06;

public class TextBlockExample {
    public static void main(String[] args) {
        /**
         * Java 13부터 Text Block이라는 기능이 추가되었다.
         * 
         * String str = """
         * '''
         * """;
         * 
         * 큰 따옴표 3개로 감싸면 이스케이프 하거나, 라인피드를 할 필요가 없이 작성된 그대로 문자열로 저장된다. 
         * 다음 예제에서 str1과 str2는 동일한 문자열이 저장된다. 
         */
        String str1 = "" +
        "{\n" +
        "\t\"id\":\"winter\",\n" +
        "\t\"name\":\"눈송이\"\n" +
        "}";

        String str2 = """
            {
                "id":"winter",
                "name":"눈송이"
            }    
                """;

        System.out.println(str1);
        System.out.println("------------------------------------------");
        System.out.println(str2);
        System.out.println("------------------------------------------");
        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println(str);

        /**
         * 텍스트 블록에서 줄바꿈은 \n에 해당한다.
         * 만약 줄바꿈을 하지 않고 다음 줄에 이어서 작성하고 싶다면 33라인 처럼 맨 끝에 \를 붙여주면 된다. 
         * 이 기능은 Java 14부터 추가된 기능이다.
         */
    }
    
}
