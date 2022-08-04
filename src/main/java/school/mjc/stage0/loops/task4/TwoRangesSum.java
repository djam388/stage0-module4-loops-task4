package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sumSkippedNumber = 0;
        int sumIteratedNumber = 0;
        if (numberToSkip <= lastInRow && lastInRow > 0) {
            for (int counter = 1; counter <= lastInRow; counter++) {
                if (counter <= numberToSkip) {
                    sumSkippedNumber += counter;
                    continue;
                }
                sumIteratedNumber += counter;
            }
            System.out.println("skipped sum is " + sumSkippedNumber);
            System.out.println("counted sum is " + sumIteratedNumber);
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        }


    }
}
