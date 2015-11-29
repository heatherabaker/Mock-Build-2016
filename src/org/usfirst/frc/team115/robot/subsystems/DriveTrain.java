package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/*
 * @author Rithvik
 */
public class DriveTrain extends Subsystem {
	private CANTalon turnMotor, driveMotor;
	public DriveTrain () 
	{
		turnMotor = new CANTalon (RobotMap.TURNMOTOR);
		driveMotor = new CANTalon (RobotMap.DRIVEMOTOR);
		
	}
	
	public void drive(double drive, double turn)
	{
		turnMotor.set(turn);
		driveMotor.set(drive);
	}
	
	public void stop ()
	{
		turnMotor.set(0);
		driveMotor.set(0);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}

