package ru.netology.stats.stata.services.StatsService;

public class StatsService {
    public int allSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public int midSum(int[] arr) {
        int mid = allSum(arr) / arr.length;
        return mid;

        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = (sum + arr[i]) / 2;
        //}
        // return sum;
    }

    public int numberMonthMaxSales(int[] arr) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : arr) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= arr[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int numberMonthMinSales(int[] arr) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : arr) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= arr[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int numberMonthWhenSalesBelowAverage(int[] arr) {
        int sum = midSum(arr);
        int number = 0;
        for (int t : arr) {
            if (t < sum) {
                t = number & number++;
            }

        }
        return number;
    }

    public int numberMonthWhenSalesAboveAverage(int[] arr) {
        int sum = midSum(arr);
        int number = 0;
        for (int t : arr) {
            if (t > sum) {
                t = number & number++;
            }

        }
        return number;
    }
}