package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Commands.ArcadeDriveCommand;
import frc.robot.Commands.ClimberCommand;
import frc.robot.Commands.TankDriveCommand;
import frc.robot.Constants.ClimberState;
import frc.robot.Subsystems.ClimberSubsystem;
import frc.robot.Subsystems.DrivetrainSubsystem;
import frc.robot.Subsystems.IntakeSubsystem;

public class RobotContainer {
   ClimberSubsystem climber = new ClimberSubsystem();
   IntakeSubsystem intake = new IntakeSubsystem();
   DrivetrainSubsystem Drivetrain = new DrivetrainSubsystem();
   private Joystick driverJoystick = new Joystick(0);
   private Joystick operatorJoystick = new Joystick(1);
   private JoystickButton climberUpButton = new JoystickButton(driverJoystick, 4);
   private JoystickButton climberDownButton = new JoystickButton(driverJoystick, 1);
   private JoystickButton intakeUpButton = new JoystickButton(operatorJoystick, 1);
   private JoystickButton intakeDownButton = new JoystickButton(operatorJoystick, 2);
   private JoystickButton indexerForwardButton = new JoystickButton(operatorJoystick, 3);
   private JoystickButton indexerBackwardsButton = new JoystickButton(operatorJoystick, 4);

   public RobotContainer() {
      configureButtonBindings();   
   }

   private void configureButtonBindings() {
      
//    <<<<<DRIVER CONTROLLER>>>>>
     
      climberUpButton.whileHeld(new ClimberCommand(climber, ClimberState.Up));
      climberUpButton.whenReleased(climber::climberStop, climber);

      climberDownButton.whileHeld(new ClimberCommand(climber, ClimberState.Down));
      climberDownButton.whenReleased(climber::climberStop, climber);
      Drivetrain.setDefaultCommand(getArcadeDrive());
   }

   private Command getTankDrive() {
      return new TankDriveCommand(Drivetrain, () -> driverJoystick.getRawAxis(5), () -> driverJoystick.getRawAxis(0));
   }

   private Command getArcadeDrive() {
      return new ArcadeDriveCommand(Drivetrain, () -> -driverJoystick.getRawAxis(1), () -> driverJoystick.getRawAxis(4));
   }
}

