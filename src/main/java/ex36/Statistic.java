package ex36;

import java.util.ArrayList;

public class Statistic {
    public static double average(ArrayList <Double> numbers) {
        double sum = 0;
        double average = 0;
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        average = sum/numbers.size();
        return average;
    }
    public static double min(ArrayList <Double> numbers) {
        double minimum = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) < minimum)
                minimum = numbers.get(i);
        }
        return minimum;
    }
    public static double max(ArrayList <Double> numbers) {
        double maximum = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > maximum)
                maximum = numbers.get(i);
        }
        return maximum;
    }
    public static double std(ArrayList <Double> numbers) {
        double average = Statistic.average(numbers);
        double standardDeviation = 0.0;
        for(double num : numbers) {
            standardDeviation += Math.pow(num - average, 2);
        }
        standardDeviation = Math.sqrt(standardDeviation/numbers.size());
        return standardDeviation;
    }
}
