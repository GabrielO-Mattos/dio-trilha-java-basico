import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.ComportamentoOfensivo;
import one.digitalinnovation.gof.strategy.Robo;

public class Teste {
    public static void main(String[] args) throws Exception {

        // TESTE RELACIONADOS AO DESIGN PATTERN SINGLETON
        
        // Chamando o metodo para verificar se a instancia foi pega corretamente
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        // Chamando o metodo novamente para verificar se a mesma instancia foi atibuida
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);



        // Chamando o metodo para verificar se a instancia foi pega corretamente
        SingletonEager eager = SingletonEager.getSingletonEager();
        System.out.println(eager);
        
        // Chamando o metodo novamente para verificar se a mesma instancia foi atibuida
        eager = SingletonEager.getSingletonEager();
        System.out.println(eager);



        // Chamando o metodo para verificar se a instancia foi pega corretamente
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        // Chamando o metodo novamente para verificar se a mesma instancia foi atibuida
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        // TESTE RELACIONADOS AO DESIGN PATTERN STRATEGY
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento ofensivo = new ComportamentoOfensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(ofensivo);
        robo.mover();
        robo.mover();
        robo.mover();

    }
}
