package FoundationsForDiscreteMathematicsandDSA.week_8;

import java.math.BigInteger;

public class ExperimentToBinary {
    public static void main(String[] args) {
        BigInteger result = new BigInteger(String.valueOf(toBinary(284)));
        System.out.println(result);
    }

    public static StringBuilder toBinary(long number) {
        if (number == 0){
            return new StringBuilder();
        }

        StringBuilder result = toBinary(number/2);
        result.append(number % 2);

        return result;
    }

    //    public static StringBuilder toBinary(long number) {
//        StringBuilder result = new StringBuilder();
//        if (number == 0){
//            return result;
//        }
//
//        result.append(number % 2);
//
//        StringBuilder recursiveResult = toBinary(number/2);
//        recursiveResult.append(result);
//
//        return recursiveResult;
//    }

//    public static StringBuilder toBinary(long number){
//        StringBuilder result = new StringBuilder();
//        if (number == 0){
//            return result;
//        }
//
//        StringBuilder stepResult = new StringBuilder();
//        stepResult.append(number % 2);
//        result.append(stepResult);
//
//        return toBinary(number / 2);
//    }
}
