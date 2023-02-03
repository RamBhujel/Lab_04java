public class Main {
    public static void main(String[] args)
    {

        //intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo
        int intOperandA = 3;
        int intOperandB = 5;

        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
        System.out.println( "The Sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intDifference = intOperandA - intOperandB;
        System.out.println( "The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of "+ intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println(" The Quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);


        //doubleOperandA, doubleOperandB, doubleSum, doubleProduct, doubleDifference,doubleQuotient
        double doubleOperandA = 5.5;
        double doubleOperandB = 10.5;

        double doubleSum = 0.0;
        double doubleProduct = 0.0;
        double doubleDifference = 0.0;
        double doubleQuotient = 0.0;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println( "The Sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println( "The Difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);


        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println( "The Product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA % doubleOperandB;
        System.out.println( "The Quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);



    }
}