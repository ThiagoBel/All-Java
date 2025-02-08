public class ProcessBuilder_bash {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("cmd", "/c", "echo ola").inheritIO().start();
    }
}