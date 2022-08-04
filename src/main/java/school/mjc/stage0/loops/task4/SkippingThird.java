package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int counterOne;
        int counterTwo = 1;
        for (counterOne = 1; counterOne <= lastPrinted; counterOne++){
            if (counterTwo == 3) {
                counterTwo = 1;
                continue;
            }
            counterTwo += 1;
            System.out.println(counterOne);
        }
    }
}

