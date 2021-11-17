package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClimberSubsystem extends SubsystemBase{ 
  WPI_VictorSPX climberMotor = new WPI_VictorSPX(Constants.climberMotorId);
  public ClimberSubsystem() {
  }

  public void climberDown(){
    climberMotor.set(Constants.Climber_Speed);
  }
  
  public void climberStop(){
    climberMotor.set(0);
  }
  public void climberUp(){
    climberMotor.set(-Constants.Climber_Speed);
  }

}
