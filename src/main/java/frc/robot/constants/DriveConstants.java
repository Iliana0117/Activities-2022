package frc.robot.constants;

public class DriveConstants {

  public final int kRightMotor = 13;
  // TODO 1.1: Add the other motor port, kLeftMotor, and if you have them, kRightMotor2, kLeftMotor2, the same as above.
  // All of the ports should be public (so they can be accessed anywhere) and final (so they don't change)
  // find the ID through the motor label, electrical spreadsheet, or phoenix tuner (ask us for help)
  public final int kLeftMotor = 12;

  // TODO 4.1: Add three constants for P, I, and D values. A good starting point is zero for I and D, and a very small value for 
  public double kP = 0.1;
  public double kI = 0;
  public double kD = 0;
  // If you are using your own subsystem then do not make the constants here, make them in a new constants file! Then, go to constants.java and make a public static final instance of your constants file
}
