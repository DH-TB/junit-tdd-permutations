import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class AnagramsTest {
    @Test
    public void should_return_empty_given_empty_string() {
        List<String> result = Anagrams.game("");
        assertThat(result).contains("");
    }

    @Test
    public void should_return_a_given_a() {
        List<String> result = Anagrams.game("a");
        assertThat(result).contains("a");
    }

    @Test
    public void should_return_ab_and_ba_given_ab() {
        List<String> result = Anagrams.game("ab");
        assertThat(result).contains("ab", "ba");
    }


    @Test
    public void should_return_contains_abc_and_acb_or_more_given_abc() {
        List<String> result = Anagrams.game("abc");
        List<String> actual = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");

        assertEquals(actual, result);
        assertThat(result).contains("abc", "acb", "bac", "bca", "cab", "cba");
    }

    @Test
    public void should_return_contains_abcd_and_abdc_or_more_given_abcd() {
        List<String> result = Anagrams.game("abcd");
        List<String> actual = Arrays.asList(
                "abcd", "abdc","acbd","acdb","adbc","adcb",
                "bacd","badc","bcad","bcda","bdac","bdca",
                "cabd","cadb","cbad","cbda","cdab","cdba",
                "dabc","dacb","dbac","dbca","dcab","dcba"
                );

        assertEquals(actual, result);
        assertThat(result).contains("abcd", "abdc","acbd","acdb","adbc","adcb");
    }


    @Test
    public void should_return_contains_abcde_and_abced_or_more_given_abcde() {
        List<String> result = Anagrams.game("abcde");
        assertThat(result).contains("abcde", "abced");
    }
}
