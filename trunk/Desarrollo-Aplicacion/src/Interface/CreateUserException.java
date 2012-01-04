/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import java.lang.Throwable;

/**
 *
 * @author Patricia Figueira 
 */
public class CreateUserException extends Exception
{
    CreateUserException(String Nickname)
    {
        super("No es posible añadir el Usuario " + Nickname);
    }

}
