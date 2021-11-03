package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Commands.ArcadeDriveCommand;
import frc.robot.Commands.ClimberCommand;
import frc.robot.Commands.TankDriveCommand;
import frc.robot.Subsystems.ClimberSubsystem;
import frc.robot.Subsystems.DrivetrainSubsystem;
import frc.robot.Subsystems.IndexerSubsystem;
import frc.robot.Subsystems.IntakeSubsystem;

public class RobotContainer {
   ClimberSubsystem climber = new ClimberSubsystem();
   IndexerSubsystem index = new IndexerSubsystem();
   IntakeSubsystem intake = new IntakeSubsystem();
   DrivetrainSubsystem Drivetrain = new DrivetrainSubsystem();
   private Joystick driverJoystick = new Joystick(1);
   private Joystick operatorJoystick = new Joystick(2);
   private JoystickButton climberUpButton = new JoystickButton(driverJoystick, 1);
   private JoystickButton climberDownButton = new JoystickButton(driverJoystick, 2);
   private JoystickButton intakeUpButton = new JoystickButton(operatorJoystick, 1);
   private JoystickButton intakeDownButton = new JoystickButton(operatorJoystick, 2);
   private JoystickButton indexerForwardButton = new JoystickButton(operatorJoystick, 3);
   private JoystickButton indexerBackwardsButton = new JoystickButton(operatorJoystick, 4);

   public RobotContainer() {
      configureButtonBindings();   
   }

   private void configureButtonBindings() {
      
//    <<<<<DRIVER CONTROLLER>>>>>
     
      climberUpButton.whileHeld(new ClimberCommand(climber));
      Drivetrain.setDefaultCommand(getTankDrive());
      Drivetrain.setDefaultCommand(getArcadeDrive());
      climberUpButton.whileHeld(new ClimberCommand(climber));
   }

   private Command getTankDrive() {
      return new TankDriveCommand(Drivetrain, () -> driverJoystick.getRawAxis(5), () -> driverJoystick.getRawAxis(0));
   }

   private Command getArcadeDrive() {
      return new ArcadeDriveCommand(Drivetrain, () -> driverJoystick.getRawAxis(5), () -> driverJoystick.getRawAxis(0));
   }
}

