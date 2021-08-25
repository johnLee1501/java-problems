package advanced;

public class JavaSingletonPattern {
    private volatile static JavaSingletonPattern instance;
    public static String str;

    private JavaSingletonPattern() {
    }

    static JavaSingletonPattern getSingleInstance() {
        if (instance == null) {
            synchronized (JavaSingletonPattern.class) {
                if (instance == null) {
                    instance = new JavaSingletonPattern();
                }
            }
        }
        return instance;
    }

}

/*
class Singleton{
	static Singleton instance = new Singleton();
	private Singleton() {}
	public String str;
	static Singleton getSingleInstance() {
		return instance;
	}
}*/

/*class Singleton{
    public String str;
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getSingleInstance () {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}*/

/*class Singleton{
    private volatile static Singleton instance;
    public static String str;
    private Singleton() {}

    static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}*/