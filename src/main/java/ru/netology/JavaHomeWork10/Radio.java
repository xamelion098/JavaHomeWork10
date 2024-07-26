package ru.netology.JavaHomeWork10;

public class Radio {

    private int radioStationNumber;
    private int soundVolume;
    private int numberRadioStation = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = numberRadioStation - 1;
    private int minVolume = 0;
    private int maxVolume = 100;
public Radio(int numberRadioStation ){
    this.maxRadioStation = numberRadioStation -1;
}
public Radio(){

}
    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > maxRadioStation) {
            return;
        }
        if (newRadioStationNumber < minRadioStation) {
            return;
        }

        radioStationNumber = newRadioStationNumber;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume >= maxVolume) {
            newSoundVolume = maxVolume;
        }
        if (newSoundVolume < minVolume) {
            newSoundVolume = minVolume;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseRadioStation() {
        if (radioStationNumber < maxRadioStation) {
            radioStationNumber = radioStationNumber + 1;

        } else {
            radioStationNumber = minRadioStation;
        }
    }

    public void decreaseRadioStation() {
        if (radioStationNumber > minRadioStation) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = maxRadioStation;
        }
    }

    public void upVolume() {
        if (soundVolume < maxVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void downVolume() {
        if (soundVolume > minVolume) {
            soundVolume = soundVolume - 1;
        }
    }
}