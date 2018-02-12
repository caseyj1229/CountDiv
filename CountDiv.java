public class CountDiv {
    public static int solution(int A, int B, int K){
        if(A%K==0){
            return (B/K) - (A/K) + 1;
        }
        return (B/K) - (A/K);
    }
}
