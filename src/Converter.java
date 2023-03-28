public class Converter {

   int STEP_LENGTH_CM = 75; // сантиметров в одном шаге
   int CM_TO_METRE = 100; // сантиметров в одном метре
   int METRE_TO_KM = 1000; // метров в одном километре
   int STEP_TO_CALORIES = 50; // Калорий в одном шаге
   int CALORIES_TO_KILOCALORIES = 1000; // Калории в Килокалории


    int convertToKm(int steps){ // Конвертация в километры
        int km = ((steps * STEP_LENGTH_CM) / CM_TO_METRE) / METRE_TO_KM;
        return km;
    }


    int convertStepsToKilocalories(int steps){ // Конвертация в килокалории
        int kilocalories = (steps * STEP_TO_CALORIES) / CALORIES_TO_KILOCALORIES;
        return kilocalories;
    }
}
