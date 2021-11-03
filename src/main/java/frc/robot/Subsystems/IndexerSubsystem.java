package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IndexerSubsystem extends SubsystemBase{
  PWMVictorSPX indexerMotor = new PWMVictorSPX(6);
  
  public void indexerOn(){
      indexerMotor.set(Constants.Indexer_Speed);
  }
  public void indexeroff(){
    indexerMotor.set(0);
  }
  public void indexerReverse(){
      indexerMotor.set(-Constants.Indexer_Speed);
  }
}

