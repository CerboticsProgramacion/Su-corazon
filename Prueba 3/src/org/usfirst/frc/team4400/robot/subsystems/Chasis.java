package org.usfirst.frc.team4400.robot.subsystems;

import org.usfirst.frc.team4400.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chasis extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	RobotDrive arcade = new RobotDrive(0,1);

	public void mover () {
		arcade.arcadeDrive(Robot.oi.stick.getRawAxis(0), Robot.oi.stick.getRawAxis(1));
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

