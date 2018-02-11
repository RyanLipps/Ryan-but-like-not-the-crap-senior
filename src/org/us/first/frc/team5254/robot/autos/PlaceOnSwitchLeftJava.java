package org.us.first.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.autocommands.DriveToDistance;
import org.usfirst.frc.team5254.robot.autocommands.ElevatorSetToPoint;
import org.usfirst.frc.team5254.robot.autocommands.LowerArms;
import org.usfirst.frc.team5254.robot.autocommands.PIDTurn;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class PlaceOnSwitchLeftJava extends CommandGroup {
	
	private static Timer timer = new Timer();
	
    public PlaceOnSwitchLeftJava() {
    	timer.reset();
    	timer.start();
    	
    	addSequential(new LowerArms());
    	addParallel(new ElevatorSetToPoint(1.0, 0.8));
    	addSequential(new DriveToDistance(1.0, 17));
    	addSequential(new PIDTurn(-25));
        
    }
}
