public class Teste {
    public static void main(String[] args) {
        TicTac tt = new TicTac();

        ThreadTicTac tique = new ThreadTicTac("Tique", tt);
        ThreadTicTac taque = new ThreadTicTac("Taque", tt);

        try {
            tique.t.join();
            taque.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
