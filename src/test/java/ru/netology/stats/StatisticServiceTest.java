package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatisticServiceTest {
    @Test
    public void minSalesMonth() {


        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void allSales() {


        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.salesValue(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesMonth() {


        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesSum() {

        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsWithSalesAboveAverage() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsNumberWithSalesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfMonthsWithSalesBelowAverage() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsNumberWithSalesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);


    }

}
