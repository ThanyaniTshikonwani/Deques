import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeTest {

    @Test
    void dequeCollection() {
        int [] setArray = new int[]{6,2,6,8,3,7,1,4,4};
        assertEquals(3,Deque.dequeCollection(setArray,9,3));
    }
}