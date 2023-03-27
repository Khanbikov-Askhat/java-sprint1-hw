class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() { // Вывод статистики день: количество шагов
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1)  + " день: " + days[i]);// Вывод элементов массива в необходимом формате
        }
    }


    int sumStepsFromMonth() { // Сумма шагов за определенный месяц
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
        }
        return sumSteps;
    }


    int maxSteps() { // Максимальное количество шагов
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps){
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }


    int bestSeries(int goalByStepsPerDay) { // Лучшая серия шагов
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay){
                currentSeries = currentSeries + 1;
                if (currentSeries > finalSeries){
                    finalSeries = currentSeries;
                }
            } else if (days[i] < goalByStepsPerDay) {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }
}
