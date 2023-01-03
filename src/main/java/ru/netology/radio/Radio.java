package ru.netology.radio;

public class Radio {

    private int currentNumber;
    private int minNumber = 0;
    private int maxNumber = 9;


    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;


    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < minNumber) {
            return;
        }
        if (newCurrentNumber > maxNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextNumber() {
        if (currentNumber < maxNumber) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = minNumber;
        }
    }

    public void previousNumber() {
        if (currentNumber > minNumber) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxNumber;
        }
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void previousVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}