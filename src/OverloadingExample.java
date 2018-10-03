public class OverloadingExample {
    public static void main(String[] args) {
        OverloadingExample oe = new OverloadingExample();
        short b = 5;
        short c = 5;
        oe.method(b,c);
        oe.method(b);

    }
    static void method(long i) {
        System.out.println("long");
    }
    static void method(int i) {
        System.out.println("int");
    }
    static void method(double i) {
        System.out.println("double");
    }
    static void method(short... i) {
        System.out.println("byte");
    }
    static void method(Short i) {
        System.out.println("Short");
    }
    static void method(Object i) {
        System.out.println("Object");
    }
    static void method(Object... i) {
        System.out.println("Object...");
    }
    static void method(Byte i) {
        System.out.println("Byte");
    }
    static void method(Integer i) {
        System.out.println("Integer");
    }

    static void method(long i,long c) {
        System.out.println("long");
    }
    static void method(Short i,Short c) {
        System.out.println("Short");
    }



}
