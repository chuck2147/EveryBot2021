package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClimberSubsystem extends SubsystemBase{ 
  PWMVictorSPX climberMotor = new PWMVictorSPX(3);
  public ClimberSubsystem() {
  }

  public void climberMove(){
    climberMotor.set(Constants.Climber_Speed);
  }
  
  public void climberStop(){
    climberMotor.set(0);
  }
  public void climberReverse(){
    climberMotor.set(-Constants.Climber_Speed);
  }

}
