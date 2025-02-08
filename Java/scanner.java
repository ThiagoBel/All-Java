import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = obj.nextLine();

        System.out.println("Qual sua idade?");
        int idade = obj.nextInt();

        System.out.printf("Nome: %s\n", nome);
        System.out.printf("idade: %d", idade);

        obj.close();

        // nextInt = int
        // nextDouble = double
        // nextLine = String
        // nextByte = Byte
        // nextBoolean = Boolean
        // nextFloat = Float
        // nextLong = Long
        // ...
    }
}