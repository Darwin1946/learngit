public class Java2cpp {
    public static int add(int a,int b)
    {
        int res = 0;
        res = a+b;
        return res;
    }
    public native int DLL_ADD(int a, int b);
    public native int DLL_SUB(int a, int b);
    public native int DLL_MUL(int a, int b);
    public native int DLL_DIV(int a,int b);
    public static void main(String[] args) {
        System.loadLibrary("javaCallcpp");
        int sum = 0;
        Java2cpp test = new Java2cpp();
        long startTime = System.currentTimeMillis();
        int loopTime = 100000000;
        for(int i=0;i<loopTime;i++){
        sum += test.DLL_ADD(i, i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("jni time used:"+(endTime-startTime));

        long startTime2 = System.currentTimeMillis();
        for(int i=0;i<loopTime;i++){
        sum += add(i,i+1);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("java time used:"+(endTime2-startTime2));
        // System.out.println("Java call cpp dll result:" + sum);
    }
    }
