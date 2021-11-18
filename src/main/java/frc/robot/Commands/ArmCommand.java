// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.IntakeSubsystem;
import frc.robot.Subsystems.IntakeSubsystem.ArmState;

public class ArmCommand extends CommandBase {
  private final IntakeSubsystem intake;
  private final IntakeSubsystem.ArmState armState;

  public ArmCommand(IntakeSubsystem intake, IntakeSubsystem.ArmState armState) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.intake = intake; 
    this.armState = armState; 
    addRequirements(intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (armState == ArmState.Up) {
      intake.armUp();
    }else if (armState == ArmState.Down){
      intake.armDown();
    } else if (armState == ArmState.Stop){
      intake.armStop();
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.armStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
