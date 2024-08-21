import one.digitalinnovation.gof.SingletonEager;
import one.digitalinnovation.gof.SingletonLazy;
import one.digitalinnovation.gof.SingletonLazyHolder;

public class Teste {
    public static void main(String[] args) throws Exception {

        /* Chamando o metodo para verificar se a instancia foi pega corretamente */
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        /* Chamando o metodo novamente para verificar se a mesma instancia foi atibuida */
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);



        /* Chamando o metodo para verificar se a instancia foi pega corretamente */
        SingletonEager eager = SingletonEager.getSingletonEager();
        System.out.println(eager);
        
        /* Chamando o metodo novamente para verificar se a mesma instancia foi atibuida */
        eager = SingletonEager.getSingletonEager();
        System.out.println(eager);



        /* Chamando o metodo para verificar se a instancia foi pega corretamente */
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        /* Chamando o metodo novamente para verificar se a mesma instancia foi atibuida */
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

    }
}
