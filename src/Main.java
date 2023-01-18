public class Main {
    public static void main(String[] args) {

        // overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = methods signature

        int z = add(7,19, 4);
        System.out.println(z);

    }
    static int add(int a, int b){
        System.out.println("This overloaded method #1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This overloaded method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This overloaded method #3");
        return a + b + c + d;
    }
}