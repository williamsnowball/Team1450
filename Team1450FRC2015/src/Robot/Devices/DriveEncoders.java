/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Devices;

import RobotMain.Constants;
import edu.wpi.first.wpilibj.Encoder;
import RobotMain.IODefines;
/**
 *
 * @author keenan
 */
public class DriveEncoders {
    
    public Encoder LeftEncoder;
    public Encoder RightEncoder;
    
    public DriveEncoders(){
        LeftEncoder = new Encoder(IODefines.LEFT_DRIVE_ENCODER_A,IODefines.LEFT_DRIVE_ENCODER_B);
        RightEncoder = new Encoder(IODefines.RIGHT_DRIVE_ENCODER_A,IODefines.RIGHT_DRIVE_ENCODER_B);
        //LeftEncoder.setDistancePerPulse(Constants.Drives.distancePerPulse);
        //RightEncoder.setDistancePerPulse(Constants.Drives.distancePerPulse);
        //LeftEncoder.setSamplesToAverage(10);
        //RightEncoder.setSamplesToAverage(10);
        
    }
    
    public void start(){
        LeftEncoder.start();
        RightEncoder.start();
        System.out.println("Encoders Started");
    }
    
    public void stop(){
        LeftEncoder.stop();
        RightEncoder.stop();
    }
}
