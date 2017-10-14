package org.usfirst.frc.team4400.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4400.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
/**
 *
 */
public class chac extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Talon brazo = new Talon(0);
	RobotDrive manejo = new RobotDrive(2,3);
	public void maxima() {
		brazo.setSpeed(1);
	}
	public void runchasis() {
		manejo.arcadeDrive(Robot.oi.stick.getRawAxis(0), Robot.oi.stick.getRawAxis(1));
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

