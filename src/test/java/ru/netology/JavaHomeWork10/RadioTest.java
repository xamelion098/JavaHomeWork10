package ru.netology.JavaHomeWork10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldSetToMaxRadioStationNumber() {                  // Максимальная станция
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void maxIcreaseRadioStationTest() {   //  Переход станции c 9 на 0 (MAX)
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minDecreaseRadioStationTest() {   // переход станции с 0 на 9 (MIN)
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);
        radio.decreaseRadioStation();
        int expected = 9;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upRadioStationTest() {   //  Переключение выше станции если текущая <9 (+1)
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);
        radio.increaseRadioStation();
        int expected = 2;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downDecreaseRadioStationTest() {   // Переключение ниже станции если текущая > 0 (-1)
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        radio.decreaseRadioStation();
        int expected = 8;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {        // >10 станции
        Radio radio = new Radio();

        radio.setRadioStationNumber(11);

        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMin() {        // <10 станции
        Radio radio = new Radio();

        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    ////////////////////////////////////////////////////////////////////////////////
    @Test
    public void shouldSetToMaxSoundVolume() {                  // Максимальная громкость
        Radio radio = new Radio();

        radio.setTheSoundVolume(65);

        int expected = 65;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeMaxTest() {                            //прибавить громкость выше Max
        Radio radio = new Radio();
        radio.setTheSoundVolume(111);
        radio.upVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeMinTest() {                       //убавить громкость ниже Min
        Radio radio = new Radio();
        radio.setTheSoundVolume(-1);
        radio.downVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {                            //убавить громкость/
        Radio radio = new Radio();
        radio.setTheSoundVolume(5);
        radio.downVolume();

        int expected = 4;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {                              //прибавить громкость
        Radio radio = new Radio();
        radio.setTheSoundVolume(5);
        radio.upVolume();

        int expected = 6;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}