/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

package Problem4;

public class MillionDollarMaker {
    static final int MONTHS_PER_YEAR = 12;   // what does "static" and "final" do?

    // Do not change signature (function name, parameter variable type, and return type)
    // OK to change parameter variable names. In fact, are the parameter names bad and why?

        public static CompoundingResult calculate(float initialDeposit,
                                                  float monthlyContribution,
                                                  int years,
                                                  float annualRatePercentage) {
            // Convert annual rate percentage to a decimal
            float monthlyRateDecimal = annualRatePercentage / 100 / MONTHS_PER_YEAR;
            int totalMonths = years * MONTHS_PER_YEAR;
            float totalAccumulated = initialDeposit;

            for (int month = 1; month <= totalMonths; month++) {
                totalAccumulated += monthlyContribution;
                totalAccumulated *= (1 + monthlyRateDecimal);
            }

            // Calculate the total amount invested
            float totalInvested = initialDeposit + monthlyContribution * totalMonths;
            CompoundingResult result = new CompoundingResult(totalInvested, totalAccumulated);
            return result;
        }
    }



