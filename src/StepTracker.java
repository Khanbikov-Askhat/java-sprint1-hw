import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    Converter converter = new Converter();
    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }


    void addNewNumberStepsPerDay() { // Добавить новое количество шагов в определенный день

        System.out.println("Введите номер месяца");
        int monthNewNumber = scanner.nextInt();
        if (monthNewNumber < 1) {
            return;// ввод и проверка номера месяца
        } else if (monthNewNumber > 12){
            return;
        }


        System.out.println("Введите день от 1 до 30 (включительно)");// ввод и проверка дня
        int dayNewNumber = scanner.nextInt();
        if (dayNewNumber < 1) {
            return; // ввод и проверка номера месяца
        } else if (dayNewNumber > 30){
            return;
        }


        System.out.println("Введите количество шагов");
        int newCountSteps = scanner.nextInt();
        if (newCountSteps < 0) {
            return; // ввод и проверка количества шагов
        } else if (newCountSteps == 0) {
            return;
        }


        MonthData monthData = monthToData[(monthNewNumber - 1)];
        monthData.days[dayNewNumber - 1] = newCountSteps;
    }




    void changeStepGoal() { // Изменить целевое количество шагов
        int stepGoal = scanner.nextInt();
        if (stepGoal < 0) {
            goalByStepsPerDay = goalByStepsPerDay - stepGoal;
        } else if (stepGoal == 0) {
            System.out.println("Цель не изменилась");
        } else {
            goalByStepsPerDay = stepGoal;
        }

    }


    void printStatistic() { // Вывод статистики
        System.out.println("Введите число месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1) {
            return;
        } else if (monthNumber > 12){
            return;
        }


        MonthData monthData = monthToData[monthNumber - 1];// получение соответствующего месяца
        int sumSteps = monthData.sumStepsFromMonth();// получение суммы шагов за месяц
        monthData.printDaysAndStepsFromMonth();// вывод общей статистики по дням
        System.out.println("Шагов за месяц " + sumSteps);// вывод суммы шагов за месяц
        System.out.println("Максимальное количество пройденных шагов:" + monthData.maxSteps());// вывод максимального пройденного количества шагов за месяц
        System.out.println("Среднее количество шагов за месяц: " + (sumSteps / 30));        // вывод среднего пройденного количества шагов за месяц
        System.out.println("Дистанция в километрах: " + converter.convertToKm(sumSteps));// вывод пройденной за месяц дистанции в км
        System.out.println("Сожженых килокалорий: " + converter.convertStepsToKilocalories(sumSteps));        // вывод количества сожжённых килокалорий за месяц
        System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));        // вывод лучшей серии
        System.out.println(); //дополнительный перенос строки
    }

}