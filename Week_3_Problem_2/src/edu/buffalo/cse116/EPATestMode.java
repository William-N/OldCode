package edu.buffalo.cse116;

/**
 * Instances of this class represent the subsystem used by a certain car manufacturer. The code within this method was
 * used to analyze and report on the performance of the car in terms of the number of miles per gallon of gasoline.
 *
 * @author Matthew Hertz
 */
public class EPATestMode {
  /**
   * Special value used when the gas consumption does not allow us to calculate MPG
   */
  public static final int INVALID_MPG = -1; // -1 is used since this is an impossible result for MPG.
  /**
   * Number of miles the car had driven the last time the MPG reading was reset.
   */
  private int odometerAtReset;

  /**
   * Creates a car that has not yet been driven. For purposes of clarity (and to create lines for WebCAT's coverage
   * tool) this explicitly sets the miles driven to 0.
   */
  public EPATestMode() {
    odometerAtReset = 0;
  }

  /**
   * Resets the instance so that it can begin a new round of mileage calculations.
   *
   * @param milesDriven Number of miles the car has driven when this method was called.
   */
  public void resetReadings(int milesDriven) {
    // Use the current mileage as the new baseline
    odometerAtReset = milesDriven;
  }

  /**
   * Compute the miles per gallon the car has achieved since the last reset. If this cannot be calculated, then an error
   * value is returned instead.
   *
   * @param currentOdometer Current reading on the car odometer.
   * @param gallonsBurnt The whole number of gallons that the car has used since the last reset.
   * @return The car's MPG since the reading was last reset or {@link #INVALID_MPG} if this cannot be calculated.
   */
  public double mpg(int currentOdometer, int gallonsBurnt) {	  
    if (gallonsBurnt <= 0) {
      return INVALID_MPG;
    } else {
      // Calculate how many miles have been driven since the last reset
      double milesDriven = currentOdometer - odometerAtReset;
      // MPG is (REALLY!) calculated as miles driven divided by gallons consumed.
      return milesDriven / gallonsBurnt;
    }
  }
}