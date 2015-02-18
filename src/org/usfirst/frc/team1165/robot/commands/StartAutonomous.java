package org.usfirst.frc.team1165.robot.commands;

import java.io.File;
import java.io.PrintWriter;

import org.usfirst.frc.team1165.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StartAutonomous extends Command
{

	public StartAutonomous()
	{
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		Robot.timer = new Timer();
		Robot.timer.start();
		
		try
		{
			new File("/home/lvuser/data").mkdirs();
			Robot.printWriter = new PrintWriter("/home/lvuser/data/ParallelCommandsTest.txt");
			Robot.printWriter.printf("%f: Start Autonomous\r\n" , Robot.timer.get());
		}
		catch (Exception ex)
		{
		}
		
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return true;
	}

	// Called once after isFinished returns true
	protected void end()
	{
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
	}
}
