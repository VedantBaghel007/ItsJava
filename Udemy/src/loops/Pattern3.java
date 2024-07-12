package loops;

public class Pattern3 {
    public static void main(String[] args){
        /*
         * * * * *
           * * * *
             * * *
               * *
                 *
         */
        /*
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>=i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }*/

/*
                 *
               * *
             * * *
           * * * *
         * * * * *
 */
       /* for(int i=1;i<=5;i++){
            for(int j=5;j>=1;j--){
                if(i>=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
*/

        /*
         *
           *
             *
               *
                 *
         */

        /*
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j>=i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

/*
                 *
               * *
             * * *
           * * * *
         * * * * *
 */
        /*
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j>5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }*/

        /*
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
         */
/*        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j>5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int k=1;k<=4;k++){
                if(i>k) {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
*/


        /*
                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *
           * * * * * * *
             * * * * *
               * * *
                 *

         */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j>5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int k=1;k<=4;k++){
                if(i>k) {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int k=4;k>=1;k--){
                if(k>i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

    }
}
