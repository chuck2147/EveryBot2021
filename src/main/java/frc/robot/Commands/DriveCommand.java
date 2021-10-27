package frc.robot.Commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.DrivetrainSubsystem;

public class DriveCommand extends CommandBase{
    private final DrivetrainSubsystem drivetrain;
    private final Supplier<Double> rightSpeedSupplier;
    private final Supplier<Double> leftSpeedSupplier;
    

  public DriveCommand(
        DrivetrainSubsystem drivetrain, 
        Supplier<Double> rightSpeedSupplier, Supplier<Double> leftSpeedSupplier) {
    this.drivetrain = drivetrain;
    this.rightSpeedSupplier = rightSpeedSupplier;
    this.leftSpeedSupplier = leftSpeedSupplier;
    addRequirements(drivetrain);
  }

  @Override
  public void execute() {
      this.drivetrain.tankDrive(this.rightSpeedSupplier.get(), this.leftSpeedSupplier.get());

  }
}
