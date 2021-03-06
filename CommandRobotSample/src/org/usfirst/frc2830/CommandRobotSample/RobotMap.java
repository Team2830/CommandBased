// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2830.CommandRobotSample;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainSpeedController1;
    public static SpeedController driveTrainSpeedController2;
    public static SpeedController driveTrainSpeedController3;
    public static SpeedController driveTrainSpeedController4;
    public static RobotDrive driveTrainRobotDrive;
    public static Gyro driveTrainGyro1;
    public static Encoder driveTrainQuadratureEncoder1;
    public static Encoder driveTrainQuadratureEncoder2;
    public static Encoder driveTrainQuadratureEncoder3;
    public static Encoder driveTrainQuadratureEncoder4;
    public static Solenoid chuckSolenoid;
    public static SpeedController elevatormotorController1;
    public static DigitalInput elevatorUpperLimitSwitch;
    public static DigitalInput elevatorLowerLimitSwitch;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainSpeedController1 = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 1", (Talon) driveTrainSpeedController1);
        
        driveTrainSpeedController2 = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 2", (Talon) driveTrainSpeedController2);
        
        driveTrainSpeedController3 = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 3", (Talon) driveTrainSpeedController3);
        
        driveTrainSpeedController4 = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 4", (Talon) driveTrainSpeedController4);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainSpeedController1, driveTrainSpeedController2,
              driveTrainSpeedController3, driveTrainSpeedController4);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);

        driveTrainGyro1 = new Gyro(0);
        LiveWindow.addSensor("DriveTrain", "Gyro 1", driveTrainGyro1);
        driveTrainGyro1.setSensitivity(0.007);
        driveTrainQuadratureEncoder1 = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "Quadrature Encoder 1", driveTrainQuadratureEncoder1);
        driveTrainQuadratureEncoder1.setDistancePerPulse(1.0);
        driveTrainQuadratureEncoder1.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainQuadratureEncoder2 = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "Quadrature Encoder 2", driveTrainQuadratureEncoder2);
        driveTrainQuadratureEncoder2.setDistancePerPulse(1.0);
        driveTrainQuadratureEncoder2.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainQuadratureEncoder3 = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "Quadrature Encoder 3", driveTrainQuadratureEncoder3);
        driveTrainQuadratureEncoder3.setDistancePerPulse(1.0);
        driveTrainQuadratureEncoder3.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainQuadratureEncoder4 = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "Quadrature Encoder 4", driveTrainQuadratureEncoder4);
        driveTrainQuadratureEncoder4.setDistancePerPulse(1.0);
        driveTrainQuadratureEncoder4.setPIDSourceParameter(PIDSourceParameter.kRate);
        chuckSolenoid = new Solenoid(0, 0);
        LiveWindow.addActuator("Chuck", "Solenoid", chuckSolenoid);
        
        elevatormotorController1 = new Talon(4);
        LiveWindow.addActuator("Elevator", "motorController1", (Talon) elevatormotorController1);
        
        elevatorUpperLimitSwitch = new DigitalInput(8);
        LiveWindow.addSensor("Elevator", "Upper Limit Switch", elevatorUpperLimitSwitch);
        
        elevatorLowerLimitSwitch = new DigitalInput(9);
        LiveWindow.addSensor("Elevator", "Lower Limit Switch", elevatorLowerLimitSwitch);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
