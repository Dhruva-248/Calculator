class Calculator{
    float addition(float operand_1,float operand_2){
        return(operand_1+operand_2);
    }

    float substraction(float operand_1,float operand_2){
        return(operand_1-operand_2);
    }

    float multiplication(float operand_1,float operand_2){
        return(operand_1*operand_2);
    }

    float division(float operand_1,float operand_2){
        return(operand_1/operand_2);
    }


    float square(float operand_1) {
        return (operand_1 * operand_1);
    }

    float cube(float operand_1) {
        return (operand_1 * operand_1* operand_1);
    }
    public static void main(String[] args) {
        float operand_1=10;
        float operand_2=5;
        Calculator calc = new Calculator();
        float add_result=calc.addition(operand_1, operand_2);
        System.out.println("Result of addition is: " + add_result);
        float sub_result=calc.addition(operand_1, operand_2);
        System.out.println("Result of substraction is: " + sub_result);
        float mul_result=calc.addition(operand_1, operand_2);
        System.out.println("Result of multiplication is: " + mul_result);
        float div_result=calc.addition(operand_1, operand_2);
        System.out.println("Result of division is: " + div_result);
        float square_result = calc.square(operand_1);
        System.out.println("Result of square is: " + square_result);
        float cube_result = calc.cube(operand_1);
        System.out.println("Result of cube is: " + cube_result);

    }
}