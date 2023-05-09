package ru.netology;

public class Radio {

    public int currentVolume;
    public int currentRadioStation;

    //Сеттер ручного выбора станции
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }

        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    //Увеличение громкости звука на 1
    public void increaseVolume() {
        if (currentVolume < 100) {

        }
        if (currentVolume >= 100) {
            return;
        }
        currentVolume = currentVolume + 1;
    }

    //Уменьшение громкости звука на 1
    public void decreaseVolume() {
        if (currentVolume >= 100) {

        }
        if (currentVolume <= 0) {
            return;
        }
        currentVolume = currentVolume - 1;
    }
    //Переключение на следующую станцию
    public void nextRadioStation() {
        int target = currentRadioStation + 1;
        setCurrentRadioStation(target);

        if (target > 9) {
            currentRadioStation = 0;
        }
    }

    //Переключение на предыдущую станцию
    public void prevRadioStation() {
        int target = currentRadioStation - 1;
        setCurrentRadioStation(target);

        if (target < 0) {
            currentRadioStation = 9;
        }
    }


}
