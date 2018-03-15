import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class MocktioDemo {

    @Test
    public void randomMockDemo() {
        Random mockRandom = mock(Random.class);

        Mockito.when(mockRandom.nextInt()).thenReturn(20);

        assertThat(mockRandom.nextInt()).isEqualTo(20);
    }
}
