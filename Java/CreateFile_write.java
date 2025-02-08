import java.io.FileWriter;
import java.io.IOException;

public class CreateFile_write {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("MeuArquivo.txt");
            obj.write("Amo muito o Java!");
            obj.close();
            System.out.println("Sucesso!");
        } catch (IOException i) {
            System.out.println("Erro!");
            i.printStackTrace();
        }
    }
}