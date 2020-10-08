package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {21, 5, 8, 4, 5, 12, 8, 35, 11, 11, 12};
        long expected = 35;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}