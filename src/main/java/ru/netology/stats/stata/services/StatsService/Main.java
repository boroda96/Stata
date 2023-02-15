package ru.netology.stats.stata.services.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        System.out.println(Arrays.toString(arr));
        System.out.println(service.allSum(arr));
        System.out.println(service.midSum(arr));
        System.out.println(service.numberMonthMaxSales(arr));
        System.out.println(service.numberMonthMinSales(arr));
        System.out.println(service.numberMonthWhenSalesBelowAverage(arr));
        System.out.println(service.numberMonthWhenSalesAboveAverage(arr));
    }
}