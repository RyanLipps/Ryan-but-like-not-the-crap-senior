package org.us.first.frc.team5254.robot.autos;

import org.usfirst.frc.team5254.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CrossAutoLine extends CommandGroup {

    public CrossAutoLine() {
        requires(Robot.Drivetrain);
        requires(Robot.CubeMech);
        
        addSequential(new LowerArms());
        addParalell(new DriveToDistance(1.0, 108));
    }
}