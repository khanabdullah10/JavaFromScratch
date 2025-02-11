public class Questions {


    static void pattern1(int n){
        /**

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <=row ; col++) {

                System.out.print("* ");
            }

            System.out.println();
        }

    }



    static void pattern2(int n){
        /**

         * * * *
         * * * *
         * * * *
         * * * *

         */
        for (int row = 1; row <=n; row++) {

            for (int col = 1; col <=n ; col++) {

                System.out.print  ("* ");

            }

            System.out.println();
        }

    }


    static void pattern3(int n){
        /**

         * * * * * *
         * * * * *
         * * * *
         * * *
         *

         */
        for (int row = n; row >= 1; row--) {

            for (int col = 1; col <=row ; col++) {

                System.out.print  ("* ");

            }

            System.out.println();
        }

    }


    static void pattern4(int n){

        /**

         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5

         */
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }


    static void pattern5(int n){
        /**

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        for (int row = 1; row <= 2 * n-1 ; row++) {

            int threshold = row > n ? 2 * n - row :row;

            for (int col = 1; col <= threshold ; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }


    static void pattern6(int n){
        /**

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        for (int row = 1; row <= 2 * n-1 ; row++) {

            int threshold = row > n ? 2 * n - row :row;
            int numberOfSpaces = n - threshold;

            for (int spaces = 1; spaces <= numberOfSpaces; spaces++) {
                System.out.print(" ");

            }
            for (int col = 1; col <= threshold ; col    ++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }




    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
        pattern6(5);


    }


}
