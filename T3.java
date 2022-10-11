public class T3{
    static int myMethod(int num){
        System.out.println("The entered number is: "+num);
        return num+num;
    }
    public static void main(String[] args){
        System.out.println("The number is: " + myMethod(15));
    }
}