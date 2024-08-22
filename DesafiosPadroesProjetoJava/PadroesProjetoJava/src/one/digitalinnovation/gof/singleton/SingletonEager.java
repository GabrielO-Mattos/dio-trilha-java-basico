package one.digitalinnovation.gof.singleton;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getSingletonEager(){
        return instancia;
    }

}
