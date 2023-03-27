import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создание нового экземпляра
        StepTracker newStepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();

            int i = scanner.nextInt();
            if (i == 1) {
                newStepTracker.addNewNumberStepsPerDay();
            } else if (i == 2) {
                newStepTracker.changeStepGoal();
            } else if (i == 3) {
                newStepTracker.printStatistic();
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }


    static void printMenu() {
        System.out.println("1 - ввести количество шагов за определённый день.");
        System.out.println("2 - изменить цель по количеству шагов в день.");
        System.out.println("3 - напечатать статистику за определённый месяц.");
        System.out.println("4 - выйти из приложения.");
    }
}