//Java Program to Find the Largest Element in an Array

public class Array1 {
    public static void main(String args[]) {

        int a[] = {2015, 95, 20, 50, 168};
        int smallest = a[0];

        for (int i = 0; i < 5; i++) {

            if(a[i] < smallest) {

                smallest = a[i];
            }


        }
        System.out.println("smallest element in the array is " + smallest);

    }}



