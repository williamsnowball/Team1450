package Robot.Commands.Drive;

import Robot.Commands.CommandBase;
import Robot.Devices.DriveEncoders;
import RobotMain.Constants;
/**
 */
public class DriveWithJoystick extends CommandBase {

    public DriveEncoders Encoders = new DriveEncoders();

    public DriveWithJoystick() {
        requires(driveTrain);
        //Encoders.LeftEncoder.setDistancePerPulse(Constants.Drives.distancePerPulse);
        Encoders.start();
    }

    protected void initialize() {
    }

    protected void execute() {
        driveTrain.arcadeDrive(oi.getDriveThrottle()*-1, oi.getDriveRotation());
        
       // System.out.println(Encoders.LeftEncoder.getDistance() + ":" + Encoders.RightEncoder.getDistance());
        System.out.println(Encoders.LeftEncoder.getRaw() + ":" + Encoders.RightEncoder.getRaw());
        //System.out.println(LeftDriveEncoderA.get());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
