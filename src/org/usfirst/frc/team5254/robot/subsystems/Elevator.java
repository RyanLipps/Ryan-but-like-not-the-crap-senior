package org.usfirst.frc.team5254.robot.subsystems;

import org.usfirst.frc.team5254.robot.RobotMap;
import org.usfirst.frc.team5254.robot.commands.ElevatorOn;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
public static Talon elevator = new Talon(RobotMap.ELEVATOR);
    
	public void SlideLadder(double speed) {
		if(speed >= 0.10) {
			elevator.set(speed);
		}
		if(speed <= -0.10) {
			elevator.set(speed);
		} else {
			elevator.set(0.0);
		}
	}
	public void ElevatorStop() {
		elevator.set(0.0);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new ElevatorOn());
    }
}

