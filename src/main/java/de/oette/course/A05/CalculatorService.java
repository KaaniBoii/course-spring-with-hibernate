package de.oette.course.A05;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements Calculator {

    @Override
    public int sum(int value1, int value2) {
        return value1 + value2;
    }
}
