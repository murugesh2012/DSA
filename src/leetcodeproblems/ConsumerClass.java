package leetcodeproblems;

public class ConsumerClass {
    public static void main(String[] args) {
        DataClass student1 = new DataClass(127, "Murugesh", "CSE");
        BusinessLogic product1=new BusinessLogic();
        System.out.println(product1.getSellingPrice(350,19));
        BusinessLogic prodct2=product1;
        System.out.println(prodct2.getSellingPrice(340,21));


        int a=10,b=20,c;
        swapNumber(a,b);
        System.out.println("A value:"+a+"\n"+" B Value:"+b);

    }

    private static void swapNumber(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("A value:"+a+"\n"+" B Value:"+b+"\n");
    }
}
