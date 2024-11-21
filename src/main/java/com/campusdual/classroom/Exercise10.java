package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int ctr = 0;
        while (true) {
            String color = getBall();
            System.out.println("Bola: " + color);
            if (color.equals("azul")) {
                ++ctr;
            }
            if(ctr == 2) {
                break;
            }
        }
    }

    public static String getBall() {
        switch (randomWithRange(1, 4)) {
            case 1:
                return "rojo";
            case 2:
                return "azul";
            case 3:
                return "verde";
            default:
                return "";
        }
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}