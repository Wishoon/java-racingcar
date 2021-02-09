package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CarsTest {
    @Test
    @DisplayName("이름 리스트 생성 확인")
    void carNames() {
        final Cars cars = new Cars("1,2,3");
        assertThat(cars.getCars().get(0).getName().getName()).isEqualTo("1");
        assertThat(cars.getCars().get(1).getName().getName()).isEqualTo("2");
        assertThat(cars.getCars().get(2).getName().getName()).isEqualTo("3");
    }

    @Test
    @DisplayName("이름이 중복되는 경우")
    void carNames_duplicated() {
        assertThatThrownBy(() -> new Cars("1,,2,3")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Cars("1,,,,2,3")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("양 끝에 쉼표가 있는 경우")
    void carNames_both_end() {
        assertThatThrownBy(() -> new Cars(",샐리")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Cars("샐리,df,")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Cars(",샐리,")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("총합테스트")
    void carNames_comma_blank() {
        assertThatThrownBy(() -> new Cars(",")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Cars(" ")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Cars(" , ")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Cars(", ,  ,")).isInstanceOf(IllegalArgumentException.class);
    }
}