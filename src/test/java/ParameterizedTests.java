import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ParameterizedTests {

    public boolean isPalindrome(String s){
        return s != null && new StringBuilder(s).reverse().toString().equals(s);
    }
    @ParameterizedTest(name = "{index} - {0} это палиндром")
    @ValueSource(strings = { "12321", "pop", "tenet", "топот" })
    void testPalindrome(String word) {
        Assertions.assertTrue(isPalindrome(word));
    }
}
