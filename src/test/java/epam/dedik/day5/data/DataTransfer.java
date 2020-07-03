package epam.dedik.day5.data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Guice;

@Guice
public class DataTransfer {

    @DataProvider(name = "getData")
    public Object[][] getData() {
        return new Object[][]{{
                "ЗАМЕЧАНИЕ: неправильно сформулированный запрос может вернуть \"правильные\" данные на текущем " +
                        "состоянии базы данных. Поэтому не стоит удивляться, если результаты неверного запроса " +
                        "совпадут с правильными результатами, но при этом запрос будет оценен системой проверки " +
                        "как неверный."
        }};
    }
}
