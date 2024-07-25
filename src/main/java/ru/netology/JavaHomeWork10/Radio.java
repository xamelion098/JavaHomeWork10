package ru.netology.JavaHomeWork10;

public class Radio {

    private int radioStationNumber;
    private int soundVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > 9) {
            return;
        }
        if (newRadioStationNumber < 0) {
            return;
        }

        radioStationNumber = newRadioStationNumber;
    }

    public void setTheSoundVolume(int newSoundVolume) {
        if (newSoundVolume >= 100) {
            newSoundVolume = 100;
        }
        if (newSoundVolume < 0) {
            newSoundVolume = 0;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseRadioStation() {
        if (radioStationNumber < 9) {
            radioStationNumber = +radioStationNumber + 1;

        } else {
            radioStationNumber = 0;
        }
    }

    public void decreaseRadioStation() {
        if (radioStationNumber > 0) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = 9;
        }
    }

    public void upVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void downVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }
}