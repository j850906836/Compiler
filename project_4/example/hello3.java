public class hello3{
    public static void func(int a) {
       a = 100;
       return;
    }

    public static void main(String[] args) {
        System.out.println("Hello! World!");
        func(10);
    }
}

