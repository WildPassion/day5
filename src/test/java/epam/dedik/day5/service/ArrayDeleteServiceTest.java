package epam.dedik.day5.service;

import by.epam.dedik.day5.service.impl.ArrayDeleteService;
import epam.dedik.day5.data.DataTransfer;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayDeleteServiceTest {
    private ArrayDeleteService arrayDeleteService;

    @BeforeClass
    public void setArrayDeleteService() {
        arrayDeleteService = new ArrayDeleteService();
    }

    @Test(dataProvider = "getData", dataProviderClass = DataTransfer.class)
    public void deleteSymbolsExceptLetters_stringText_textWithoutSymbols(String text) {
        String expected = "ЗАМЕЧАНИЕ  неправильно сформулированный запрос может вернуть  правильные  " +
                "данные на текущем состоянии базы данных  Поэтому не стоит удивляться  если результаты неверного " +
                "запроса совпадут с правильными результатами  но при этом запрос будет оценен системой проверки " +
                "как неверный ";
        String actual = arrayDeleteService.deleteSymbolsExceptLetters(text);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "getData", dataProviderClass = DataTransfer.class)
    public void deleteVowelWordsByLength_stringText_textWithoutVowelWords(String text) {
        String expected = "ЗАМЕЧАНИЕ: неправильно сформулированный запрос может вернуть \"правильные\" данные на " +
                "текущем состоянии базы данных. Поэтому не стоит, результаты неверного запроса совпадут с правильными" +
                " результатами, но при запрос будет системой проверки как неверный.    ";
        String actual = arrayDeleteService.deleteVowelWordsByLength(text, 3);
        Assert.assertEquals(actual, expected);
    }
}
