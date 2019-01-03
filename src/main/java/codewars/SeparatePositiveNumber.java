package codewars;

public class SeparatePositiveNumber {
    public static long[] wheatFromChaff(long[] values) {
        long[] answer = values.clone();
        int j = answer.length;
        for (int i = 0; i < answer.length; i++){
            if(answer[i] > 0) {
                while(j > i){
                    j--;
                    if(answer[j] < 0) {
                        long tmp = answer[i];
                        answer[i] = answer[j];
                        answer[j] = tmp;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
