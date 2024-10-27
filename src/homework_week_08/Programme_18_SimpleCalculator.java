package homework_week_08;

/**Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 names firstNumber and secondNumber both of type double.
 Write the following methods (instance methods):
 ● Method named getFirstNumber without any parameters, it needs to return the value of the
 firstNumber field.
 ● Method named getSecondNumber without any parameters, it needs to return the value of
 the secondNumber field.
 ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 of the firstNumber field.
 ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 value of the secondNumber field.
 ● Method named getAdditionResult without any parameters, it needs to return the result of
 adding the field values of firstNumber and secondNumber.
 ● Method named getSubtractionResult without any parameters, it needs to return the result of
 subtracting the field values of the secondNumber from the firstNumber.
 ● Method named getMultiplicationResult without any parameters, it needs to return the result
 of multiplying the field values of firstNumber and secondNumber.
 ● Method named getDivisionResult without any parameters, it needs to return the result of
 dividing the field values of firstNumber by the secondNumber. In case the value of
 secondNumber is 0 then return 0.
 TEST EXAMPLE
 TEST CODE: Write the bellow code into main method
 SimpleCalculator calculator = new SimpleCalculator();
 calculator.setFirstNumber(5.0);
 calculator.setSecondNumber(4);
 System.out.println("add= " + calculator.getAdditionResult());
 System.out.println("subtract= " + calculator.getSubtractionResult());
 calculator.setFirstNumber(5.25);
 calculator.setSecondNumber(0);
 System.out.println("multiply= " + calculator.getMultiplicationResult());
 System.out.println("divide= " + calculator.getDivisionResult());

 OUTPUT
 add= 9.0
 subtract= 1.0
 multiply= 0.0
 divide= 0.0
 TIPS:
 ● add= 9.0 is printed because 5.0 + 4 is 9.0
 ● subtract= 1.0 is printed because 5.0 - 4 is 1.0
 ● multiply= 0.0 is printed because 5.25 * 0 is 0.0
 ● divide= 0.0 is printed because secondNumber is set to 0
 NOTE: All methods should be defined as public NOT public static.
 NOTE: In total, you have to write 8 methods.
 *
 */

public class Programme_18_SimpleCalculator {

    public static void main(String[] args) {
        // test code
        Programme_18_SimpleCalculator programme18SimpleCalculator=new Programme_18_SimpleCalculator();
        programme18SimpleCalculator.setFirstNumber(5.0);
        programme18SimpleCalculator.setSecondNumber(4);
        System.out.println("add="+programme18SimpleCalculator.getAdditionResult());
        System.out.println("subs"+programme18SimpleCalculator.getSubtractionResult());
        programme18SimpleCalculator.setFirstNumber(5.25);
        programme18SimpleCalculator.setSecondNumber(0);
        System.out.println("multi"+ programme18SimpleCalculator.getMultiplicationResult());
        System.out.println("divi"+programme18SimpleCalculator.getSubtractionResult());
    }

    // Instance variable
    private  double firstNumber;
    private  double secondNumber;

    // method to get
    public double getFirstNumber(){
        return firstNumber;


    }

    public double getSecondNumber() {
        return secondNumber;
    }
    // method to set first and second
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;

    }
    public  void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    // method to get addition
    public double getAdditionResult(){
        return firstNumber+secondNumber;


    }
    // get subtraction
    public double getSubtractionResult(){
        return firstNumber-secondNumber;

    }
    // get multiplication
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    // get division

    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }else {
            return firstNumber/secondNumber;
        }
    }

}
