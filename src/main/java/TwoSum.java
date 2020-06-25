import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] solution(int[] givenNums, int target) {
//        return new int[] {0, 1};

        int[] results = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < givenNums.length ; i++) {
            if(map.containsKey(target - givenNums[i])){
                results[1] = i;
                results[0] = map.get(target - givenNums[i]);
            }
            map.put(givenNums[i], i);
        }
        return results;
    }
}
