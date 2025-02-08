public class whileloop {
    public static void main(String[] args) {
        int inicial = 1;
        int limite = 5;
        String frase = "Amo Java!";

        while (inicial <= limite) {
            System.out.println(inicial + ". " + frase);
            inicial++;
        }
    }
}
