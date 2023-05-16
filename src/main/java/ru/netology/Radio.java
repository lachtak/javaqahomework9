package ru.netology;

public class Radio {

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    private int maxRadioStation;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;

    public Radio() {
        maxRadioStation = 9;
    }

    public Radio(int size) {
        maxRadioStation = (minRadioStation + size) - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    //Сеттер ручного выбора уровня громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }

        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    //Сеттер ручного выбора станции
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }

        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    //Увеличение громкости звука на 1
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    //Уменьшение громкости звука на 1
    public void decreaseVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = currentVolume - 1;
        }

    }

    //Переключение на следующую станцию
    public void nextRadioStation() {
        int target = currentRadioStation + 1;
        setCurrentRadioStation(target);

        if (target > maxRadioStation) {
            currentRadioStation = 0;
        }
    }

    //Переключение на предыдущую станцию
    public void prevRadioStation() {
        int target = currentRadioStation - 1;
        setCurrentRadioStation(target);

        if (target < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
    }


}
