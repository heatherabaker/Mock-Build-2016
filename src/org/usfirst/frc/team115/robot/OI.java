package org.usfirst.frc.team115.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * 
 * @author Ben Cuan
 */
public class OI {
	
	Joystick joystick;
	
	public OI() {
		joystick = new Joystick(RobotMap.JOYSTICK_PORT);
	
	}
	
	public Joystick getJoystick() {
		return joystick;
	}
}



