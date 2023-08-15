package ru.netology.stats;

public class StatsService {

    //1-й метод : сумма всех продаж
    public long sum(long[] sales) {
        long allSale = 0;
        for (int i = 0; i < sales.length; i++) {
            allSale += sales[i];
        }
        return allSale;
    }

    //2-й метод : средняя от всех продаж
    public long average(long[] sales) {
        long averageSale = sum(sales) / 12;
        return averageSale;
    }

    //3-й метод : номер месяца максимальных продаж
    public int monthMax(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;

    }

    //4-й метод : номер месяца минимальных продаж
    public int monthMinSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1; //
    }

    //5-й метод : количество месяцев когдa продажи ниже среднего
    public int monthBelowAverage(long[] sales) {
        int counterMonth = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counterMonth++;
            }

        }
        return counterMonth;
    }

    //6-й метод : количество месяцев когдa продажи выше среднего
    public int monthHigherAverage(long[] sales) {
        int counterMonth = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counterMonth++;
            }

        }
        return counterMonth;
    }
}