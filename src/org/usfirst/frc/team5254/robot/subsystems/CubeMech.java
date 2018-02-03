package org.usfirst.frc.team5254.robot.subsystems;

import org.usfirst.frc.team5254.robot.commands.CubeMechStopFlywheels;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CubeMech extends Subsystem {

	public static VictorSP cubeMechLeftFlywheels = new VictorSP(Robotmap.CUBE_MECH_Left);
	public static VictorSP cubeMechRightFlywheels = new VictorSP(RobotMap.Cube_MECH_RIGHT);
	
	public static Solenoid cubeMechArms = new Solenoid(RobotMap.Cube_Mech_Arms);
	public static DoubleSolenoid CubeMechHinge = new DoubleSolenoid(Robot.Map.Cube_Mech_Hinge_Up, Robot.Map.Cube.Mech.Hinge.Down);
	
	public CubeMech () {
	}
	
	public void ArmsDown() {
		cubeMechHinge.set(DoubleSolenoid.Value.kReverse);
	}
	public void ArmsUp() {
		cubeMechHinge.set(DoubleSolenoid.Value.kForward);
	}
	public void Intake() {
		cubeMechLeftFlywheels.set(1);
		cubeMechRightFlywheels.set(1);
	}
	public void Outake() {
		cubeMechLeftFlywheels.set(-1);
		cubeMechRightFlywheels.set(-1);
	}
	public void StopFlywheels() {
		cubeMechLeftFlywheels.set(0);
		cubeMechRightFlywheels.set(0);
	}
    public void initDefaultCommand() {
    	setDefaultCommand(new CubeMechStopFlywheels());
    }
}

