import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regEx_find {
    public static void main(String[] args) {
        Pattern palavra =  Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
        Matcher frase = palavra.matcher("Eu amo o Java!");

        boolean fraseAchar = frase.find();

        if (fraseAchar) {
            System.out.println("Encontramos a palavra Java!");
        } else {
            System.out.println("Não encotramos a palavra Java!");
        }
    }
}
