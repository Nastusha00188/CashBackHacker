package ru.netology.service;


import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;


public class CashbackHackServiceTest {

    @Test
    public void belowValues() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void higherValues() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);
        assertEquals(actual, expected);
    }

    @Test
    public void equalToValue() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
}