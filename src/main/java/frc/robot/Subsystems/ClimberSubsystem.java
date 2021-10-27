package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimberSubsystem extends SubsystemBase{ 
  PWMVictorSPX climberMotor = new PWMVictorSPX(3);
  public ClimberSubsystem() {
  }

  public void climberMove(){
    climberMotor.set(0.5);
  }
  
  public void climberStop(){
    climberMotor.set(0);
  }
  public void climberReverse(){
    climberMotor.set(-0.5);
  }

}
