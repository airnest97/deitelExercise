package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringPracticeTest {

    @Test
    void longestSubStringTest(){
        SubString s = new SubString();
        int expected = s.lengthOfLongestSubstring("abcadeccdccd");
        assertEquals(5, expected);
    }
}
