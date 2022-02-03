package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

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

    @Test
    void substring() {
        String substring = "(1,2)".substring(1, 4);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    void charAt() {
        char c = "abc".charAt(0);
        assertThat(c).isEqualTo('a');
    }

    @Test
    void charAt_exception() {
        assertThatCode(() -> "aa".charAt(2))
            .isExactlyInstanceOf(StringIndexOutOfBoundsException.class)
            .hasMessage("String index out of range: 2");
    }
}
