package frc.robot;

public class Constants {
   //MOTOR SPEEDS 
    public static final double Climber_Speed = 0.5; 
    public static final double Indexer_Speed = 0.5;
    public static final double Intake_Speed = 0.5;

    public enum ClimberState {
        Up, Down
    }

    //Drive train motor IDs
    public static final int frontLeftMotorId = 5;
    public static final int rearLeftMotorId = 6;
    public static final int frontRightMotorId = 7;
    public static final int rearRightMotorId = 8;
}