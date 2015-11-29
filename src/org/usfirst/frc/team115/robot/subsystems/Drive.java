package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *@author Ben Cuan
 */
public class Drive extends Subsystem {
	private final int LEFT_MOTOR = 0;
	private final int RIGHT_MOTOR = 1;
	private CANTalon leftMotor;
	private CANTalon rightMotor;
	private CANTalon[] motorArray = new CANTalon[2];
	private RobotDrive drive;
	
	public Drive() {
		leftMotor = new CANTalon(RobotMap.LEFT_MOTOR_ID);
		rightMotor = new CANTalon(RobotMap.RIGHT_MOTOR_ID);
		motorArray[LEFT_MOTOR] = leftMotor;
		motorArray[RIGHT_MOTOR] = rightMotor;
		drive = new RobotDrive(motorArray[LEFT_MOTOR], motorArray[RIGHT_MOTOR]);
	}
	
	public void drive(Joystick joystick) {
		drive.arcadeDrive(joystick);
	}
	
	public void drive(double move, double rotate) {
		drive.arcadeDrive(move, rotate);
	}
	
	public void stop() {
		drive(0,0);
	}
	
	public double getLeftCurrent() {
		return leftMotor.getOutputCurrent();
	}
	
	public double getRightCurrent() {
		return rightMotor.getOutputCurrent();
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


