public class Converter {
    int convertToKm(int steps){ // Конвертация в километры
        int km = ((steps * 75) / 100) /1000;
        return km;
    }


    int convertStepsToKilocalories(int steps){ // Конвертация в килокалории
        int kilocalories = (steps * 50) / 1000;
        return kilocalories;
    }
}
