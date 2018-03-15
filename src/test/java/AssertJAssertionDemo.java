import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJAssertionDemo {

    @Test
    public void simpleAssertion() {
        assertThat("some text").contains("x");
    }

    @Test
    public void listAssertion() {
        List<String> actual = Arrays.asList("a", "b", "c");
        assertThat(actual).contains("a", "b", "c");
    }
}


