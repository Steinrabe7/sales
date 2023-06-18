package ru.netology.stats;

    public class StatisticService {
        public int minSales(int[] sales) {
            int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

            for (int i = 0; i < sales.length; i++) {
                if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-месяце продаж меньше
                    minMonth = i; // запомним его как минимальный

                }
            }
            return minMonth + 1; // месяцы нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

        }

        public int salesValue(int[] sales) {
            int value = 0;
            for (int i = 0; i < sales.length; i++) {
                value += sales[i];
            }
            return value;

        }

        public int maxSales(int[] sales) {
            int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

            for (int i = 0; i < sales.length; i++) {
                if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-месяце продаж больше
                    maxMonth = i; // запомним его как максимальный

                }
            }
            return maxMonth + 1; // месяцы нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

        }

        public int averageSales(int[] sales) {
            int averageQuantity = salesValue(sales) / 12;
            return averageQuantity;
        }

        public int monthsNumberWithSalesAboveAverage(int[] sales) {
            int aboveAverage = 0;
            int middle = averageSales(sales);
            for (int salesForMonth : sales) {
                if (salesForMonth > middle) {
                    aboveAverage = aboveAverage + 1;
                }
            }
            return aboveAverage;

        }

        public int monthsNumberWithSalesBelowAverage(int[] sales) {
            int belowAverage = 0;
            int middle = averageSales(sales);
            for (int salesForMonth : sales) {
                if (salesForMonth < middle) {
                    belowAverage = belowAverage + 1;
                }
            }
            return belowAverage;

        }

    }




