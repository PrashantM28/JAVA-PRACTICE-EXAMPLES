//Java Program to Add Two Matrices

public class Array2 {
    public static void main(String args[]) {
            int a[][] = {
                {2 , 3},
                {4 , 5}
        };
         int b[][] = {
                 {1 , 2},
                 {3 , 4}

         };
        int c = a[0][0] +b[0][0];
        int d = a[0][1] +b[0][1];
        int e = a[1][0] +b[1][0];
        int f = a[1][1]+ b[1][1];


        System.out.print(c + " " +d + "\n" + e + " "+ f);


    }
}