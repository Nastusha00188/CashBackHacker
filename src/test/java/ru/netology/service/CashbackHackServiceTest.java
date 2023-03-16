package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CashbackHackServiceTest {

    @Test
    void belowValues() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void higherValues() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void equalToValue() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(actual, expected);
    }
}