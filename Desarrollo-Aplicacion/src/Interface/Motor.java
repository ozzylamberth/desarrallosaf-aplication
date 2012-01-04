
package Interface;
import Motor.*;

/**
 *
 * @author Patricia Figueira
 */
public class Motor
{
    public static MotorImplementacion getMotorImplementacion()
    {
        MotorImplementacion elMotor = new MotorImplementacion();
        return elMotor;
    }

}
