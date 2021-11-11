package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.PWMVenom;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DrivetrainSubsystem extends SubsystemBase {
    PWMVictorSPX frontLeftMotor = new PWMVictorSPX(Constants.frontLeftMotorId);
    PWMVictorSPX rearLeftMotor = new PWMVictorSPX(Constants.rearLeftMotorId);

    SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(frontLeftMotor, rearLeftMotor);

    PWMVictorSPX frontRightMotor = new PWMVictorSPX(Constants.frontRightMotorId);
    PWMVictorSPX rearRightMotor = new PWMVictorSPX(Constants.rearRightMotorId);

    SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(frontRightMotor, rearRightMotor);

    private final DifferentialDrive diffDrive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);


    public DrivetrainSubsystem () {

    }

    public void tankDrive(double rightSpeed, double leftSpeed) {
        diffDrive.tankDrive(leftSpeed, rightSpeed);
    }

    public void arcadeDrive(double xSpeed, double zRotation) {
        diffDrive.arcadeDrive(xSpeed, zRotation);
    }

}
