package cba533.exercicecours1;

public class CompareNumbers {

    public enum numbers{NUMBER1, NUMBER2, NONE};

    public numbers compareNumbers(int number1, int number2){
        if(number1 > number2){
            return numbers.NUMBER1;
        }else if(number2 > number1){
            return numbers.NUMBER2;
        }else{
            return numbers.NONE;
        }
    }
}
