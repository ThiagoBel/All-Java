import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File obj = new File("Arquivo.txt");

        if (obj.delete()) {
            System.out.println("Sucesso!");
        } else {
            System.out.println("Erro!");
        }
    }
}
