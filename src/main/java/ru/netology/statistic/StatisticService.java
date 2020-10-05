
package ru.netology.statistic;

public class StatisticService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
       int maxIndex = 0;
       for (int i = 1; i < incomes.length; i++) {
           if (incomes[maxIndex] < incomes[i]);
       }
        return maxIndex +1;
    }
}

