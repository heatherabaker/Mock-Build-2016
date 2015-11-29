package org.usfirst.frc.team115.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team115.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/*
 * @author Dohyun Kim
 */
public class Drive extends Subsystem {
	private final int BACK_LEFT = 0;
	private final int BACK_RIGHT = 1;
	private final int FRONT_LEFT = 2;
	private final int FRONT_RIGHT = 3;

	private CANTalon[] motors = new CANTalon[4];

	private RobotDrive drive;

	public Drive() {
		motors[BACK_LEFT] = new CANTalon(RobotMap.DRIVE_MOTOR_BACKLEFT);
		motors[BACK_RIGHT] = new CANTalon(RobotMap.DRIVE_MOTOR_BACKRIGHT);
		motors[FRONT_LEFT] = new CANTalon(RobotMap.DRIVE_MOTOR_FRONTLEFT);
		motors[FRONT_RIGHT] = new CANTalon(RobotMap.DRIVE_MOTOR_FRONTRIGHT);
		
		drive = new RobotDrive (motors[BACK_LEFT], motors[BACK_RIGHT], motors[FRONT_LEFT], motors[FRONT_RIGHT]);
	}
	
	public void drive (Joystick joystick) {
		drive.arcadeDrive(joystick);
	}
	
	public void drive(double move, double rotate) {
		drive.arcadeDrive(move, rotate);
	}
	
	public void stop () {
		drive(0,0);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
