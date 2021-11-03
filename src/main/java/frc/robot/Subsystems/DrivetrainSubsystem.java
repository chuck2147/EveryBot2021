package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.PWMVenom;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivetrainSubsystem extends SubsystemBase {
    PWMVictorSPX leftMotor = new PWMVictorSPX(6);
    PWMVictorSPX rightMotor = new PWMVictorSPX(7);

    private final DifferentialDrive diffDrive = new DifferentialDrive(leftMotor, rightMotor);


    public DrivetrainSubsystem () {

    }

    public void tankDrive(double rightSpeed, double leftSpeed) {
        diffDrive.tankDrive(leftSpeed, rightSpeed);
    }

    public void arcadeDrive(double xSpeed, double zRotation) {
        diffDrive.arcadeDrive(xSpeed, zRotation);
    }

}
