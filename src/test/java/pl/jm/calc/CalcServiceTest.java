package pl.jm.calc;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcServiceTest {

    CalcService calcService;

    @Before
    public void setUp() {
        calcService = new CalcService();
    }

    @Test
    public void calculate_returnsRating() {
        //when
        int rating = calcService.calcRating(23);

        //then
        assertThat(rating).isEqualTo(46);
    }

}
