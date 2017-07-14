public class RecursionPractice {
    
    public static void main(String[] args) {
        //recursiveCountdown(10);
        // System.out.println(recursiveSum(100));
        // int sum = 0;
        // recursiveSum2(100,sum);
        // System.out.println(sum); //sum the numbers between 1 to num

        System.out.println(tworeccalls(10));

        System.out.println(multiply(8,9));
    }

    public static void recursiveCountdown(int num) {
        //exit
        if (num == 0) {
            System.out.println("Blastoff!");
            return;
        }
        //breakdown
        System.out.println(num);
        recursiveCountdown(num - 1); //consider the order
        System.out.println(num);
        
    }

    public static int recursiveSum(int num) {
        if (num == 0) {
            return 0;
        }

        return num + recursiveSum(num - 1);
    }

    public static void recursiveSum2(int num, int sum) {
        //exit
        if (num == 0) {
            return;
        }
        //break
        //System.out.println(sum);
        recursiveSum2(num - 1, sum + num);
    }

    // two recursive calls  Fibonacci Number
    public static int tworeccalls(int num) {
        if (num < 5) {
            System.out.println(num);
            return num;
        }

        return tworeccalls(num - 1) + tworeccalls(num - 3);
  //            10
  //         9      7 
  //       8   6  6   4
  //     7  5 5 3 5 3  
  //   6 4 42 42  42
  //  5 3
  // 42
  // 
/**
*  t..(4) -->print out 4 and return 4
*  t..(5) -->return 4 + 2(printout 2) = 6
*  t..(6) --> 6 + 3()
*  t..(7) --> 9 + 4()
** t..(5)
*  t..(8) --> 13 + t..(5)
*  t..(9)
*  t..(10) 
*/

    }

    //write a function that multiplies two numbers without using multiplication
    // and division, the parameters are all integers
    //multiply(3, 5);

    public static int multiply(int a, int b) {
        if (a == 0) {
            return 0;
        }
        return b + multiply(a - 1, b);
    }


}