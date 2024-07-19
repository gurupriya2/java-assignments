package EXERCISE;

public class ExceptionHandling {
        public static void main(String args[])
        {
            try
            {
                int i, sum;
                sum = 10;
                for (i = -1; i < 3 ;++i)
                    sum = (sum / i);
                System.out.print(sum);
            }
            catch(ArithmeticException e)
            {
                System.out.println("0");
            }
            finally {
                System.out.println("Hey There");
            }
        }
    }

