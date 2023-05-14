package sky.pro.calculator2.service;

import org.springframework.stereotype.Service;
import sky.pro.calculator2.exception.DivZeroException;

@Service
public class CalculatorService {


    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(int num1,int num2) {
      return num1+num2;
    }

    public int minus(int num1, int num2) {
        return num1-num2;
    }

    public int multiply(int num1, int num2) {
        return num1*num2;
    }

    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivZeroException("Делить на ноль нельзя");
        }
        return (num1/(double)num2);
    }
}
