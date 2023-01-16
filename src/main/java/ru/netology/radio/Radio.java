package ru.netology.radio;
public class Radio {

    private int stationsQuantity = 10;
    private int currentStation;
    private int currentVolume;

    public Radio(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }

    public Radio() {
    }

    public int getStationsQuantity() {
        return stationsQuantity;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setStationsQuantity(int stationsQuantity) {
        if (stationsQuantity < 0) {
            return;
        }
        this.stationsQuantity = stationsQuantity;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > (stationsQuantity - 1)) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation == (stationsQuantity - 1)) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = (stationsQuantity - 1);
            return;
        }
        currentStation--;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}