package Testing;


import MediaWiki.HttpCallActions;
import com.google.gson.Gson;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        HttpCallActions message = new HttpCallActions();
        var json = message.get("https://api.wikimedia.org/feed/v1/wikipedia/en/onthisday/all/05/02");
        var gson = new Gson();
    }
}
