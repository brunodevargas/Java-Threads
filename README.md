##  Thread 2:
Programa com 3 Threads sendo executadas ao mesmo tempo, porém em velocidades diferentes. Após as Threads serem executadas pelo método run(), elas imprimem o contador e, quando o método sleep() é executado, cada Thread dorme em seu tempo (ms) estipulado pelo parâmetro. Quando acaba o contador a Thread é finalizada.


## Thread Runnable 3:
Aqui criei 3 tarefas dentro de um programa Java com uma abordagem diferente: ao invés de estender a classe Thread, implementei a interface Runnable. Não é preciso chamar o método start() pois a interface não o possui, ela apenas contém a assinatura dos métodos que devem ser implementados, como o método run(). Para iniciar a Thread, passamos a classe que implementa o Runnable como parâmetro de uma Thread e acionamos o método start().

Vantagens: com a classe Runnable podemos estender qualquer outra classe, já na classe Thread não. Se não formos sobrepor os métodos que a Thread nos possibilita, seria mais vantajoso usar o Runnable.


## Método join() 4:
O método join() espera a execução da Thread para só depois continuar o resto do código. Nesse caso o join está segurando o término da execução das três Threads, pra poder escrever "Programa finalizado".
