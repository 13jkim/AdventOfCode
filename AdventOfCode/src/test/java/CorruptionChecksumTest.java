import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorruptionChecksumTest {

    @Test
    public void testCheckSum() {
        int[][] corruptionArr = new int[3][];
        corruptionArr[0] = new int[]{5,1,9,5};
        corruptionArr[1] = new int[]{7,5,3};
        corruptionArr[2] = new int[]{2,4,6,8};
        int expectedSum = 18;
        assertEquals(expectedSum, CorruptionChecksum.checkSum(corruptionArr));
    }
}