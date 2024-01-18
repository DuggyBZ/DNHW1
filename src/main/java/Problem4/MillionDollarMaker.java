/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

package Problem4;

public class MillionDollarMaker {
    static final int MONTHS_PER_YEAR = 12;   // what does "static" and "final" do?

    // Do not change signature (function name, parameter variable type, and return type)
    // OK to change parameter variable names. In fact, are the parameter names bad and why?


    // The reason why the original variable names were not good, is because you cant really tell what a,b, c, etc stand for. Especially for
    // those like us in this class, who are now just getting into java, and need tio understand what variables represent.
    public static CompoundingResult calculate(float startAmount,
                                              float monthlySave,
                                              int durationYears,
                                              float yearlyInterestRate) {
        float monthlyInterest = yearlyInterestRate / 100 / MONTHS_PER_YEAR;
        int totalMonths = durationYears * MONTHS_PER_YEAR;
        float accumulatedAmount = startAmount;

        for (int currentMonth = 1; currentMonth <= totalMonths; currentMonth++) {
            accumulatedAmount = updateAccumulatedAmount(accumulatedAmount, monthlySave, monthlyInterest);
        }

        float totalSaved = startAmount + monthlySave * totalMonths;
        return new CompoundingResult(totalSaved, accumulatedAmount);
    }

    private static float updateAccumulatedAmount(float accumulated, float monthlySave, float monthlyInterest) {
        accumulated += monthlySave;
        return accumulated * (1 + monthlyInterest);
    }
}



    //I had a few problems on this part of the homework, so I'll write psuedocode to try and compensate to share my understanding and what may be wrong

//i want to create a method to calculate the future value of an investment. This includes the intial deposit, monthly contributions, and compund interest each month.

//This was my thought process below (You may notice i have some things down here that i didnt implement, but that is because i deleted most of it in order to pass
// at least one of the test cases, for my own sake haha):

//1. i'd start with the inital deposit as my total acumulated amount.
//2. i'd need to convert the anual interest rate to a monthly one by dividing it by 12.
//3. for each month, up to the total number of months (years multiplied by 12):
//4. apply the interest to the acumulated amount.
//5. then, i'd add the monthly contributon.
//6. i'd also calculating the total amount ive invested on the side.
//im getting some errors, and i think it might be beacause of how im applying the
// interest or the order in which im adding the monthly contributions.

