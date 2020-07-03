package epam.dedik.day5.service;

import by.epam.dedik.day5.service.impl.ArrayDeleteService;
import epam.dedik.day5.data.DataTransfer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayDeleteServiceTest {
    private ArrayDeleteService arrayDeleteService;

    @BeforeClass
    public void setArrayDeleteService() {
        arrayDeleteService = new ArrayDeleteService();
    }

    @Test(dataProvider = "getData", dataProviderClass = DataTransfer.class)
    public void deleteSymbolsExceptLetters_stringText_TextWithoutSymbols(String text) {
        String actual = arrayDeleteService.deleteSymbolsExceptLetters(text);
        System.out.println(actual);
    }
}
