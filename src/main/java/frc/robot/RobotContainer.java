package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
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
   private JoystickButton climberButton = new JoystickButton(driverJoystick, 1);
   private JoystickButton climberDownButton = new JoystickButton(driverJoystick, 2);
   private JoystickButton intakeUpButton = new JoystickButton(operatorJoystick, 1);
   private JoystickButton intakeDownButton = new JoystickButton(operatorJoystick, 2);
   private JoystickButton indexerForwardButton = new JoystickButton(operatorJoystick, 3);
   private JoystickButton indexerBackwardsButton = new JoystickButton(operatorJoystick, 4);

   public RobotContainer() {
      
   }
}

