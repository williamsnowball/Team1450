/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RobotMain;

/**
 *
 * @author chad
 */
public class Constants {

    public class Drives {
        // Private constants
        private static final double inchesPerWheelRotation = 18.85;
        private static final double encoderTicksPerRev = 250.0;
        

        // Public constants
        public static final double distancePerPulse = (inchesPerWheelRotation /
                encoderTicksPerRev) ;
        public static final double distancePerPulse_DEBUG_BOT = (inchesPerWheelRotation /
                encoderTicksPerRev);

        public static final long loopTime = 50;

        public static final double kFilter = 0.3;
    }

    public class Solenoid {
        public static final long loopTime = 50;
    }

    public class LimitSwitches
    {
        public static final long loopTime = 50;
    }

    public class MiniBotDeployment
    {
        public static final long loopTime = 50;
        public static final double speed = 0.5;
        public static final long enableAfterTime = 105000;
    }

}

