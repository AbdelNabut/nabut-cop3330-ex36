package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticTest {

    @Test
    void average() {
        double sum = 0;
        double average = 0;
        ArrayList<Double> numbers = new ArrayList();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        average = sum/numbers.size();
        assertEquals(2, average);
    }

    @Test
    void min() {
        ArrayList<Double> numbers = new ArrayList();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        double minimum = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) < minimum)
                minimum = numbers.get(i);
        }
        assertEquals(1.0, minimum);
    }

    @Test
    void max() {
        ArrayList<Double> numbers = new ArrayList();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        double maximum = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > maximum)
                maximum = numbers.get(i);
        }
        assertEquals(3.0, maximum);
    }

    @Test
    void std() {
        ArrayList<Double> numbers = new ArrayList();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        double average = Statistic.average(numbers);
        double standardDeviation = 0.0;
        for(double num : numbers) {
            standardDeviation += Math.pow(num - average, 2);
        }
        standardDeviation = Math.sqrt(standardDeviation/numbers.size());
        assertEquals(0.816496580927726, standardDeviation);
    }
}