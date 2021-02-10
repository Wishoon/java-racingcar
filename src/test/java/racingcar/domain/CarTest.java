package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    @Test
    @DisplayName("자동차 생성 확인")
    void carCreate() {
        final Car car1 = new Car("샐리");
        assertThat(car1.getName()).isEqualTo("샐리");
        assertThat(car1.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 전진 구현")
    void carMove() {
        final Car car1 = new Car("샐리");
        car1.moveByNumber(5);
        assertThat(car1.getPosition()).isEqualTo(1);
    }
}
