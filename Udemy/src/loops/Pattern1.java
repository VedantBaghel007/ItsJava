package loops;

public class Pattern1 {
    public static void main(String[] args){
        /*
        (1,1) (1,2) (1,3) (1,4) (1,5)
        (2,1) (2,2) (2,3) (2,4) (2,5)
        (3,1) (3,2) (3,3) (3,4) (3,5)  
        (4,1) (4,2) (4,3) (4,4) (4,5)
        (5,1) (5,2) (5,3) (5,4) (5,5)  */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.format("("+i+","+j+") ");
            }
            System.out.println(" ");
        }
        /*
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5  */

        /*for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        */

        /*1 1 1 1 1
          2 2 2 2 2
          3 3 3 3 3
          4 4 4 4 4
          5 5 5 5 5  */
        /*for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }*/


        /*2 3 4 5 6
          3 4 5 6 7
          4 5 6 7 8
          5 6 7 8 9
          6 7 8 9 10 */
        /*for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+j+" ");
            }
            System.out.println(" ");
        }*/

        /* 1  2  3  4  5
           6  7  8  9 10
          11 12 13 14 15
          16 17 18 19 20
          21 22 23 24 25  */
        /*int count=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                count++;
                System.out.format("%2d ",count);
            }
            System.out.println(" ");
        }*/
    }
}
