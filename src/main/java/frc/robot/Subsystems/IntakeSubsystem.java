package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase{
  PWMVictorSPX intakeMotor = new PWMVictorSPX(5); 

  public void intakeMove(){
    intakeMotor.set(Constants.Intake_Speed);
  }
  public void intakeStop(){
    intakeMotor.set(0);
  }
  public void intakeReverse(){
    intakeMotor.set(-Constants.Intake_Speed);
  }

}