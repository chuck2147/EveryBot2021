// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.IntakeSubsystem;
import frc.robot.Subsystems.IntakeSubsystem.IntakeState;

public class IntakeCommand extends CommandBase {
  private final IntakeSubsystem intake;
  private final IntakeSubsystem.IntakeState intakeState;

  public IntakeCommand(IntakeSubsystem intake, IntakeSubsystem.IntakeState intakeState) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.intake = intake;
    this.intakeState = intakeState;
    addRequirements(intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (intakeState == IntakeState.Collecting){
      intake.collect(); 
    } else if (intakeState ==IntakeState.Ejecting){
      intake.eject();
    } else if (intakeState == IntakeState.Stopped){
      intake.stop();
    }
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
