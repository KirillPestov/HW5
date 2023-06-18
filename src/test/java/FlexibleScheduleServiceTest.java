import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.FlexibleScheduleService;

public class FlexibleScheduleServiceTest {

    @ParameterizedTest
    @CsvSource( {
            "10000, 3000, 20000",
            "100000, 60000, 150000"
    }
    )
    void FlexibleScheduleServiceTest1 (int income, int expenses, int threshold) {

        FlexibleScheduleService service = new FlexibleScheduleService();
        int count = service.calculate(income,expenses,threshold);
        System.out.println(count);
    }

}
