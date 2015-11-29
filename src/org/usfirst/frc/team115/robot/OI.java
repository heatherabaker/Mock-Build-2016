package org.usfirst.frc.team115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;

/**
 * @author Rithvik
 */
public class OI {
	Joystick joystick;
	public OI()
	{
		joystick = new Joystick (RobotMap.JOYSTICK);
	}
	public double getYAxis ()
	{
		return joystick.getAxis(AxisType.kY);
	}
	
	public double getXAxis ()
	{
		return joystick.getAxis(AxisType.kX);
	}
}

