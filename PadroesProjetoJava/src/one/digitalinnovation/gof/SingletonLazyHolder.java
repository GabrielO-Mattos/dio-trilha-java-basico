package one.digitalinnovation.gof;

public class SingletonLazyHolder {

    private static class InstaceHolder{
        public static SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstaceHolder.INSTANCE;
    }

}
