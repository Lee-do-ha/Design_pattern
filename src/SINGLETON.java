class singleton {
    private static class singleInstanceHolder{
        private static final singleton INSTANCE = new singleton();
    }

    public static singleton getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}

public class SINGLETON{
    public static void main(String[] args){

        singleton a = singleton.getInstance();
        singleton b = singleton.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a==b);
    }
}

/*
668386784
668386784
true
 */
