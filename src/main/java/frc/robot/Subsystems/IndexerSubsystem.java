package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;

public class IndexerSubsystem {
  PWMVictorSPX indexerMotor = new PWMVictorSPX(5);
  
  public void indexerOn(){
      indexerMotor.set(0.5);
  }
  public void indexeroff(){
    indexerMotor.set(0);
  }
  public void indexerReverse(){
      indexerMotor.set(-0.5);
  }
}

