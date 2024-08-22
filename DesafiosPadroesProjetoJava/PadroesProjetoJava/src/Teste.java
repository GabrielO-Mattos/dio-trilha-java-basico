import one.digitalinnovation.gof.facade.Facade;
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
        

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getSingletonEager();
        System.out.println(eager);
        eager = SingletonEager.getSingletonEager();
        System.out.println(eager);


        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);




        // TESTE RELACIONADOS AO DESIGN PATTERN STRATEGY
        System.err.println();
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



        // TESTE RELACIONADOS AO DESIGN PATTERN FACADE
        System.err.println();
        Facade facade = new Facade();
        facade.migrarCliente("Gabriel", "12345-678");


    }
}
