public class Java2cpp {
    public native int DLL_ADD(int a, int b);
    public native int DLL_SUB(int a, int b);
    public native int DLL_MUL(int a, int b);
    public native int DLL_DIV(int a,int b);
    public static void main(String[] args) {
        System.loadLibrary("javaCallcpp");
        int sum = 0;
        Java2cpp test = new Java2cpp();
        sum = test.DLL_ADD(2, 4);
        System.out.println("Java call cpp dll result:" + sum);}
    }
