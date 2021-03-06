import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {
    @Test
    void solution() {
        assertEquals(3,CountDiv.solution(6,11,2));

        assertEquals(2,CountDiv.solution(6,11,3));

        assertEquals(3,CountDiv.solution(30,100,30));

        assertEquals(6,CountDiv.solution(0,10,2));

        assertEquals(1,CountDiv.solution(0,2,3));
    }
}