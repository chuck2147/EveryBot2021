package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.PWMVenom;
import edu.wpi.first.wpilibj.PWMVictorSPX;

public class DrivetrainSubsystem {
    PWMVictorSPX leftMoter = new PWMVictorSPX(6);
    PWMVictorSPX rightMoter = new PWMVictorSPX(7);

    public void driveFoward(){
        leftMoter.set(0.5);
        rightMoter.set(0.5);
    }
    public void driveBackward(){
        leftMoter.set(-0.5);
        rightMoter.set(-0.5);
    }
    public void stop(){
        leftMoter.set(0);
        rightMoter.set(0);
    }
    public void rotateLeft(){
        leftMoter.set(-0.5);
        rightMoter.set(0.5);
    }
    public void rotateRight(){
        leftMoter.set(0.5);
        rightMoter.set(-0.5);
    }

}
