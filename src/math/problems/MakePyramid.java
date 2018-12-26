package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int size = 50;
        for (int a = 0; a < size; a++){
            for (int b = 1; b < size - a; b++){
                System.out.print(" ");
            }
            for (int c = 0; c <= a; c++){
                System.out.print("* ");
            }
            System.out.println("");
        }



        }
  }
