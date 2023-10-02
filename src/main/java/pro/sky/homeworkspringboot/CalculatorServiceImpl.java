package pro.sky.homeworkspringboot;

import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello(){
        return "Привет!";
    }
    public String answerHello(String userName){
        return "И тебе привет " + userName + " !";
    }
}
