package sky.pro.calculator2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.calculator2.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение";
        }
        return num1 + "+" + num2 + "=" + calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение";
        }
        return num1 + "-" + num2 + "=" + calculatorService.minus(num1, num2);

    }

    @GetMapping("/multiply")
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение";
        }
        return num1 + "*" + num2 + "=" + calculatorService.multiply(num1, num2);

    }

    @GetMapping("/divide")
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение";
        }
        /*if (num2 == 0) {
            return "Делить на ноль нельзя";
        }*/
        return num1 + "/" + num2 + "=" + calculatorService.divide(num1, num2);

    }
}
