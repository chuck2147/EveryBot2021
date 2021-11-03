package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Subsystems.ClimberSubsystem;


public class ClimberCommand extends CommandBase{
    private final ClimberSubsystem climber; 

    public ClimberCommand(ClimberSubsystem climber){
        this.climber = climber; 
        addRequirements(climber);

    }
    @Override
    public void execute(){
        climber.climberMove();
    }
    @Override
    public void end(boolean interrupted){
        climber.climberStop();
    }
    @Override
    public boolean isFinished() {
      return false;
    }
    
}