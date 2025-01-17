package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {
    @Test
    public void testLocaleRussia() {
        LocalizationService localizationService = new LocalizationServiceImpl();

        String actual = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLocaleOther() {
        LocalizationService localizationService = new LocalizationServiceImpl();

        String actual = localizationService.locale(Country.GERMANY);
        String expected = "Welcome";

        Assertions.assertEquals(expected, actual);
    }

}