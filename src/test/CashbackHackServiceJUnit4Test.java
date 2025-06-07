package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceJUnit4Test {
    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100WhenAmount900() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals("Неверный расчет остатка для суммы 900", expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals("Неверный расчет остатка для суммы 1000", expected, actual);
    }

    @Test
    public void shouldReturn900WhenAmount1100() {
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);

        assertEquals("Неверный расчет остатка для суммы 1100", expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount2000() {
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals("Неверный расчет остатка для суммы 2000", expected, actual);
    }
}