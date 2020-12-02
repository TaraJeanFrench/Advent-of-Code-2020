package main.Day_1;
import main.Utility;
import java.util.List;

class Day_1 {
    public static void main(String[] args) throws Exception {
        // displays day 1
        Utility.log("Day 1");
        /*
        list of numbers named input, function that loads text file, that returns the input file
         */
        List<Integer> input = Utility.loadTextFileAsIntegerList("main/Day_1/input.txt");

        for (var i1 = 0; i1 < input.size(); i1++) {
            int number1 = input.get(i1);

            for (var i2 = i1+1; i2 < input.size(); i2++) {
                int number2 = input.get(i2);
                if (number1 + number2  == 2020) {
                    Utility.log("Solution part 1");
                    Utility.log("Number 1: " + number1);
                    Utility.log("Number 2: " + number2);

                    // multiply is number1 * number2
                    int number3= number1 * (number2);
                    Utility.logObject(number3);
                }
                //var i1 + var i2 = 2020
                for (var i3 = i2+1; i3 < input.size(); i3++) {
                    int number3 = input.get(i3);
                    if (number1 + number2 + number3 == 2020) {
                        Utility.log("Solution part 2");
                        Utility.log("Number 1: " + number1);
                        Utility.log("Number 2: " + number2);
                        Utility.log("Number 3: " + number3);

                        // multiply is number1 * number2
                        int number4 = number1 * number2 * number3;
                        Utility.logObject(number4);
                    }
                    //var i1 + var i2 = 2020
                }
            }
        }
    }
}