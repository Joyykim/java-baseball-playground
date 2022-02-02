package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split1() {
        String[] splited = "1,2".split(",");
        assertThat(splited).hasSize(2);
        assertThat(splited[0]).isEqualTo("1");
        assertThat(splited[1]).isEqualTo("2");
    }

    @Test
    void split2() {
        // "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
        String[] splited = "1".split(",");
        assertThat(splited).containsExactly("1");
    }
}
