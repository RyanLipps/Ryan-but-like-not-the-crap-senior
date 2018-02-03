

package org.usfirst.frc.team5254.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team5254.robot.subsystems.CubeMech;
import org.usfirst.frc.team5254.robot.subsystems.Drivetrain;
import org.usfirst.frc.team5254.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {

	static Timer timer = new Timer();
	
	Command autonomousCommands;
	
	public static OI oi;
	public static Drivetrain Drivetrain = new Drivetrain();
	public static CubeMech CubeMech = new CubeMech();
	public static Elevator Elevator = new Elevator();
	
	
	@Override
	public void robotInit() {
		
	}

	

	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	
	@Override
	public void autonomousInit() {
		
		}
	
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		
		}
	
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
	}
}
