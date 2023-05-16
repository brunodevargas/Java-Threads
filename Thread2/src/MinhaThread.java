public class MinhaThread extends Thread {
    private String nome;
    private int tempo;
    private String mensagem;

    public MinhaThread(String nome, int tempo, String mensagem){
        this.nome = nome;
        this.tempo = tempo;
        this.mensagem = mensagem;
        start();
    }

    public void run(){
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(tempo);
                System.out.println(nome + " segundo: " + i + ".  " + mensagem);
            }
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println(nome + " terminou a execução.");
        }
    }

