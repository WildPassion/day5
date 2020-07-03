package epam.dedik.day5.service;

import by.epam.dedik.day5.service.impl.ArrayChangeService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayChangeServiceTest {
    public ArrayChangeService arrayChangeService;

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{{
                "ЗАМЕЧАНИЕ: неправильно сформулированный запрос может вернуть \"правильные\" данные на текущем " +
                        "состоянии базы данных. Поэтому не стоит удивляться, если результаты неверного запроса " +
                        "совпадут с правильными результатами, но при этом запрос будет оценен системой проверки " +
                        "как неверный."
        }};
    }

    @BeforeClass
    public void setArrayChangeService() {
        arrayChangeService = new ArrayChangeService();
    }

    @Test(dataProvider = "getData")
    public void changeSymbolByPosition_string_correctString(String data) {
        String expected = "З5МЕЧАНИЕ: н5правильно с5ормулированный з5прос м5жет в5рнуть \"п5авильные\" д5нные" +
                " н5 т5кущем с5стоянии б5зы д5нных. П5этому н5 с5оит у5ивляться, е5ли р5зультаты н5верного з5проса" +
                " с5впадут с5п5авильными р5зультатами, н5 п5и э5ом з5прос б5дет о5енен с5стемой п5оверки к5к н5верный.";
        String actual = arrayChangeService.changeSymbolByPosition(data, '5', 2);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "getData")
    public void changeLetterAfterLetter_string_correctString(String data) {
        String expected = "ЗАМЕЧАНИЕ: неправильно сфо5мулиро5анный запро5 мо5ет вернуть \"правильные\" данные" +
                " на текущем со5то5нии базы данных. По5то5у не сто5т удивляться, если результаты неверно5о запро5а " +
                "со5падут с правильными результатами, но при это5 запро5 будет о5енен системо5 про5ерки как неверный.";
        String actual = arrayChangeService.changeLetterAfterLetter(data, 'о', '5');
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "getData")
    public void changeWordByLength_string_correctString(String data) {
        String expected = "ЗАМЕЧАНИЕ: неправильно сформулированный запрос может вернуть \"правильные\" данные q " +
                "текущем состоянии базы данных. Поэтому q стоит удивляться, если результаты неверного запроса совпадут" +
                " с правильными результатами, q при этом запрос будет оценен системой проверки как неверный.";
        String actual = arrayChangeService.changeWordByLength(data, "q", 2);
        Assert.assertEquals(actual,expected);
    }
}
