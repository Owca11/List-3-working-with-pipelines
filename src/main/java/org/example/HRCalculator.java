package org.example;

public class HRCalculator {
    public static int calculateMaxHR(int age){
        if(age>120 || age<0){
            throw new IllegalArgumentException(
                    "Age out of bounds"
            );
        }
        return 220 - age;
    }
    public static String getWorkoutZone(int age, int bpm) {
        int maxHR = calculateMaxHR(age);
        double percentage = (double) bpm / maxHR * 100;

        if (percentage < 50) return "Resting";
        if (percentage < 60) return "Very Light";
        if (percentage < 70) return "Light";
        if (percentage < 80) return "Moderate";
        if (percentage < 90) return "Hard";
        return "Maximum";
    }
}