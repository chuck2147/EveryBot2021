// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.DrivetrainSubsystem;

public class ArcadeDriveCommand extends CommandBase {
  private final DrivetrainSubsystem drivetrain;
  private final Supplier<Double> xSpeedSupplier;
  private final Supplier<Double> zRotationSupplier;
  
  /** Creates a new ArcadeDriveCommand. */
  public ArcadeDriveCommand(
    DrivetrainSubsystem drivetrain, 
    Supplier<Double> xSpeedSupplier, Supplier<Double> zRotationSupplier) {
    this.drivetrain = drivetrain;
    this.xSpeedSupplier = xSpeedSupplier;
    this.zRotationSupplier = zRotationSupplier;
    addRequirements(drivetrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    this.drivetrain.arcadeDrive(this.xSpeedSupplier.get(), this.zRotationSupplier.get());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
