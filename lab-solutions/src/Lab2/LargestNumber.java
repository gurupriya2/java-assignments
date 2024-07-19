package Lab2;

public class LargestNumber {
    public static int FindLargest(int num1,int num2,int num3) {
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        return largest;
    }
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        int c = 30;

        int largest = FindLargest(a,b,c);
        System.out.println("The Largest Number is :" + largest);

    }
}
