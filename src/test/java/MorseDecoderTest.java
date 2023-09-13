import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class MorseDecoderTest {
    @Test
    void given_text_is_dot_x3_dash_x3_dot_x3_we_decode_SOS() {
        // Given
        var morseSOS = "... --- ...";
        var morseDecoder = new MorseDecoder();

        // When
        var result = morseDecoder.decode(morseSOS);

        // Then
        assertThat(result).isEqualTo("SOS");
    }

    @Test
    void given_text_is_two_dash_two_spaces_three_dash_two_dash_we_decode_M_space_OM() {
        // Given
        var morseMOM = "--  --- --";
        var morseDecoder = new MorseDecoder();

        // When
        var result = morseDecoder.decode(morseMOM);

        // Then
        assertThat(result).isEqualTo("M OM");
    }
}
