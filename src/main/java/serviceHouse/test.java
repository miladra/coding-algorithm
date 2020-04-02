package serviceHouse;

public class test {

    public static void main(String[] arg){

        int[] A = {1, 2, 3} ;

        int cnt = 0;

        for(int i=1 ; i<= 2 ; i++){
            for(int j=0 ; j<A.length ; j++){
                cnt++;
                if(A[j] > 0 && A[j] <= A.length && A[j]-1 != j ){
                   int temp = A[A[j] - 1];
                   A[A[j] - 1 ] = A[j];
                   A[j] = temp;
                }
            }
        }

        int m = A.length +1;
        for(int i= 0 ; i<A.length ; i++){
            if(A[i] -1 != i){
                m = i +1;
                break;
            }
        }

        System.out.println(m);
    }
}
