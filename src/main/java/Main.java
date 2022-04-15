import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        var converer = new Converter();
        var message = new HttpCallActions();
        String json = message.get("https://f876e36a-72e3-4646-a427-c7ed84f7688a.mock.pstmn.io/users");
        System.out.println(json);
    }
}
