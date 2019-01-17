package lexer;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SLexer {
    private static Lexer lexer;

    public static void init(InputStream is) throws IOException {
        lexer = new Lexer(is);
    }
    public static Token getToken() throws IOException, UnexpectedCharacter {
        try {
            return  lexer.getToken();
        } catch ( IOException e) {
            throw e;
        }
    }
}
