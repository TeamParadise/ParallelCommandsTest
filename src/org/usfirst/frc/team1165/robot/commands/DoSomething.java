package org.usfirst.frc.team1165.robot.commands;

import org.usfirst.frc.team1165.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DoSomething extends Command
{
	private String name;
	
	public DoSomething(String name, double timeout)
	{
		this.name = name;
		setTimeout(timeout);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		if (Robot.printWriter != null)
		{
			Robot.printWriter.printf("%f: Start %s\r\n", Robot.timer.get(), name);
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return isTimedOut();
	}

	// Called once after isFinished returns true
	protected void end()
	{
		if (Robot.printWriter != null)
		{
			Robot.printWriter.printf("%f: Stop %s\r\n", Robot.timer.get(), name);
		}
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
