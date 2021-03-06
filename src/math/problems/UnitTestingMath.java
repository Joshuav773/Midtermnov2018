package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        Assert.assertEquals(1, FindLowestDifference.findLowestDifference(array1, array2, array1.length, array2.length));

        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        Assert.assertEquals(9, FindMissingNumber.findMissingNum(array, FindMissingNumber.expectation(10)));

        Assert.assertEquals(PrimeNumber.isPrime(7), PrimeNumber.isPrime(7));

    }
}
