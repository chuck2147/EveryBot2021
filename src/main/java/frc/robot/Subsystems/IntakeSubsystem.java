package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase{
  public enum ArmState {
    Up, Down, Stop
  }
  public enum IntakeState {
    Collecting, Ejecting, Stopped
  }
  WPI_VictorSPX armMotor = new WPI_VictorSPX(Constants.armMotorId);
  WPI_VictorSPX intakeMotor = new  WPI_VictorSPX(Constants.intakeMotorId);
  ArmState armState = ArmState.Down;
  IntakeState intakeState = IntakeState.Stopped;


  public void collect(){
    intakeMotor.set(.5);
  }
  public void stop(){
    intakeMotor.set(0.0);
  }
  public void eject(){
    intakeMotor.set(-.5);
  }

  public void armUp(){
    armMotor.set(.5);
  }

  public void armDown(){
    armMotor.set(-.5);
  }

  public void armStop(){
    armMotor.set(0.0);
  }
}