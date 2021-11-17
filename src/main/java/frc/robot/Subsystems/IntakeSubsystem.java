package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase{
  public enum ArmState {
    Up, Down
  }
  public enum IntakeState {
    Collecting, Ejecting, Stopped
  }
  WPI_VictorSPX intakeMotor = new WPI_VictorSPX(5);
  ArmState armState = ArmState.Down;
  IntakeState intakeState = IntakeState.Stopped;


  public void collect(){
    intakeState = IntakeState.Collecting;
  }
  public void stop(){
    intakeState = IntakeState.Stopped;
  }
  public void eject(){
    intakeState = IntakeState.Ejecting;
  }

  public void armUp(){
    armState = ArmState.Up;
  }
  public void armDown(){
    armState = ArmState.Down;
  }

}