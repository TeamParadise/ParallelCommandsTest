package org.usfirst.frc.team1165.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RunAutonomous extends CommandGroup
{

	public RunAutonomous()
	{
		addSequential(new StartAutonomous());
		addSequential(new DoSomething("1", 1));
		addSequential(new DoSomething("2", 2));
		addParallel(new DoSomething("3", 3));
		addSequential(new DoSomething("4", 4));
		addParallel(new DoSomething("5", 5));
		addParallel(new DoSomething("6", 6));
		addSequential(new DoSomething("7", 7));
		addSequential(new DoSomething("8", 8));
		addSequential(new StopAutonomous());
	}
}
