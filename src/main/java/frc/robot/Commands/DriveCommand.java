package frc.robot.Commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.DrivetrainSubsystem;

public class DriveCommand extends CommandBase{
    DrivetrainSubsystem drivetrain;
    Joystick driverJoystick;
    
  public DriveCommand(Drivetrain drivetrain, Controller controller) {
    this.drivetrain = drivetrain;
    addRequirements(drivetrain);

    this.controller = controller;
  }
}
