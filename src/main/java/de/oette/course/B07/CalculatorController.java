package de.oette.course.B07;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/calculate")
public class CalculatorController {

    @GetMapping(value = "/sum")
    public Integer sum(int x, int y) {
        return x + y;
    }

    @GetMapping(value = "/multiply")
    public Integer multiply(int x, int y) {
        return x * y;
    }
}
