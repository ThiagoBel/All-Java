import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File obj = new File("MeuArquivo.txt");  

        try {
            if (obj.createNewFile()) {
                System.out.println("Sucesso!");
            } else {
                System.out.println("Erro!");
            }
        } catch (IOException i) {
            System.out.println("Erro!");
            i.printStackTrace();
        }
    }
}