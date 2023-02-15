package ru.netology.stats.stata.services.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    @Test
    public void shouldAllSum() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAllSum = 180;
        int actualAllSum = service.allSum(arr);
        Assertions.assertEquals(expectedAllSum, actualAllSum);
    }

    @Test
    public void shouldMidSum() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMidSum = 15;
        int actualMidSum = service.midSum(arr);
        Assertions.assertEquals(expectedMidSum, actualMidSum);
    }

    @Test
    public void shouldNumberMonthMaxSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.numberMonthMaxSales(arr);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldNumberMonthMinSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.numberMonthMinSales(arr);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldNumberMonthWhenSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverage = 5;
        int actualBelowAverage = service.numberMonthWhenSalesBelowAverage(arr);
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void shouldNumberMonthWhenSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverage = 5;
        int actualAboveAverage = service.numberMonthWhenSalesAboveAverage(arr);
        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }

}
