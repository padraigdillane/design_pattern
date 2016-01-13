package singleton;

public class Singleton {
    private static Singleton singletonInstance;

    private Singleton(){
        System.out.println("Creating Singleton");
    }

    public static Singleton getInstance(){
        if (singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    public void print(Singleton name ,Singleton object){
        System.out.println(String.format("OBJ %s, Hashcode %d" , name ,object.hashCode()));
    }
}
