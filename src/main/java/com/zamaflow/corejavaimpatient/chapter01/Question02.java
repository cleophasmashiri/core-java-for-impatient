package com.zamaflow.corejavaimpatient.chapter01;

import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int angle = s.nextInt();
        System.out.printf("Normalised angle 60 is: %d%n modFloor(angle, 360) is: %d%n", angle % 360,
                Math.floorMod(angle, 360));
    }

}
