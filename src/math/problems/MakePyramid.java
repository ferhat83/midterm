package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        int k, l, m;

        int n = 6;
        for(k=1; k<n; k++) {
            System.out.println();

            for (l=k; l<n; l++) {
                System.out.print(" ");
            }

            for (m=1 ; m<(k*2) ; m++) {
                System.out.print("*");

            }
        }

    }


    /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */


        }

