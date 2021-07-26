public class OverloadMethods {
    int add(int a,int b){
        System.out.println("Add method with 2 int parameters is called ...");
        return a+b;
    }

    int add(int a,int b,int c){
        System.out.println("Add method with 3 int parameters is called ...");
        return (a+b+c);
    }

    int add(int... num){
        System.out.println("Add method with variable length int parameters is called ...");
        int res=0;
        for (int n:num) {
            res+=n;
        }

        return res;
    }

    float add(float a,float b){
        System.out.println("Add method with 2 float parameters is called ...");
        return a+b;
    }

    double multiply(double a,double b){
        return a*b;
    }
    void test(){
        int n1=5,n2=10,n3=15,n4=20,n5=25;
        float f1=5.5f,f2=4.5f;
        double d1=3.9, d2=9.3;

        System.out.format("Addition of %d and %d is %d\n",n1,n2,add(n1,n2));
        System.out.format("Addition of %d, %d and %d is %d\n",n1,n2,n3,add(n1,n2,n3));
        System.out.format("Addition of %d, %d, %d ,%d and %d is %d\n",n1,n2,n3,n4,n5,add(n1,n2,n3,n4,n5));
        System.out.format("Addition of %f and %f is %f\n",f1,f2,add(f1,f2));

        System.out.format("Multiplication of %d and %d is %f\n",n1,n2,multiply(n1,n2));
        System.out.format("Multiplication of %f and %f is %f\n",f1,f2,multiply(f1,f2));
        System.out.format("Multiplication of %f and %f is %.3f\n",d1,d2,multiply(d1,d2));
    }
}
