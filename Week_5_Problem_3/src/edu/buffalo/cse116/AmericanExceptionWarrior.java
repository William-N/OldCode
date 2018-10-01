package edu.buffalo.cse116;

/**
 * This class was inspired by the TV show "American Ninja Warrior". Actually, it was based upon the show's name (I have
 * never seen the show), but from what I learned of through Wikipedia it seems like some people find this form of torture to be fun.
 * At the least, it provides structure for a coding with Exceptions.
 *
 * @author Matthew Hertz
 */
public class AmericanExceptionWarrior {

  /**
   * AEWCompetitor includes a single method whose signature is:<br/>
   * {@code public void runCourse() throws RopeClimbException, TimeException}. // RopeClimbException is checked; TimeException is unchecked.<br/>
   * This method calls {@code athlete.runCourse();} and return true when {@code runCourse()} completes normally (this is the city finals winner).
   * The rope climb is the first obstacle and the producers need to know about the athletes who fail at this.
   * If a {@code RopeClimbException} gets raised by {@code runCourse()}, allow the exception to continue to the calling method WITHOUT handling it.
   * The {@code TimeException} is raised by {@code runCourse()} when the athlete is not the fastest. When this happens, handle the exception and 
   * return false.
   *
   * @param athlete Instance whose runCourse() method is used to see if they advance from the city finals.
   * @return True, if the athlete wins the city finals; false otherwise.
   * @throws RopeClimbException Exception that gets passed on from those athletes unable to complete the first obstacle.
   */
  public boolean cityFinals(AEWCompetitor athlete) throws RopeClimbException
  {
	  try
	  {
		  athlete.runCourse();
		  return true; 
	  }
	  
	  catch(TimeException exception)
	  {
		  return false;
	  }
	  
  }

  /**
   * AEWCompetitor includes a single method whose signature is:<br/>
   * {@code public void runCourse() throws RopeClimbException, TimeException}. // RopeClimbException is checked; TimeException is unchecked.<br/>
   * This method calls {@code athlete.runCourse();} and return true when {@code runCourse()} completes normally (this will be the overall champion).
   * On this year's Mount Midoriyama, the rope climb is the LAST obstacle and so does not require the producers attention.
   * If a {@code RopeClimbException} gets raised by {@code runCourse()}, handle the exception and return false.
   * Losing athletes may get invited back for a future season. If a {@code TimeException} is raised by {@code runCourse()}, allow the exception to continue to the calling method WITHOUT handling it.
   *
   * @param athlete Instance whose runCourse() method is used to see if they are grand champion.
   * @return True, if the athlete wins the grand championship; false otherwise.
 * @throws RopeClimbException 
   * @throws TimeException Exception that gets passed on from losing athletes who complete the course.
   */
  public boolean mountMidoriyama(AEWCompetitor athlete)  
  {
	  try
	  {
		  athlete.runCourse();
		  return true;
	  }
	  
	  catch(RopeClimbException exception)
	  {
		  return false;
	  }
  }
}
