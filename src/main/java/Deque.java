import java.util.Collections;
import java.util.PriorityQueue;

public class Deque {

    public static int dequeCollection(int actualArray[], int intNumber, int subArraySize) {

        int output = 0;

        int i =0;
        while (i < intNumber - subArraySize){
            int actualInput = 0;

            PriorityQueue<Integer> map = new PriorityQueue<Integer>();

            int j =i;
            while (j<i+subArraySize){
                if (!map.contains (actualArray[j])) {
                    map.addAll ( Collections.singleton ( actualArray[i] ) );
                    actualInput++;
                }
                j++;
            }
            if (actualInput> output){
                output =actualInput;
            }
            i++;
        }
        return output;
    }
}
