package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Constants;
import frc.robot.Constants.ClimberState;
import frc.robot.Subsystems.ClimberSubsystem;

public class ClimberCommand extends CommandBase {
    private final ClimberSubsystem climber;
    private final Constants.ClimberState climberState;

    public ClimberCommand(ClimberSubsystem climber, Constants.ClimberState climberState) {
        this.climber = climber;
        this.climberState = climberState;
        addRequirements(climber);

    }

    @Override
    public void execute() {
        if (climberState == ClimberState.Down) {
            climber.climberDown();
        } else if (climberState == ClimberState.Up) {
            climber.climberUp();
        }
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