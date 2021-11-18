package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DrivetrainSubsystem extends SubsystemBase {
    WPI_VictorSPX frontLeftMotor = new WPI_VictorSPX(Constants.frontLeftMotorId);
    WPI_VictorSPX rearLeftMotor = new WPI_VictorSPX(Constants.rearLeftMotorId);

    SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(frontLeftMotor, rearLeftMotor);

    WPI_VictorSPX frontRightMotor = new WPI_VictorSPX(Constants.frontRightMotorId);
    WPI_VictorSPX rearRightMotor = new WPI_VictorSPX(Constants.rearRightMotorId);

    SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(frontRightMotor, rearRightMotor);

    private final DifferentialDrive diffDrive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);


    public DrivetrainSubsystem () {

    }

    public void tankDrive(double rightSpeed, double leftSpeed) {
        diffDrive.tankDrive(leftSpeed, rightSpeed);
    }

    public void arcadeDrive(double xSpeed, double zRotation) {
        diffDrive.arcadeDrive(xSpeed*Constants.driveSpeedScale, zRotation*Constants.driveSpeedScale);
    }

}
