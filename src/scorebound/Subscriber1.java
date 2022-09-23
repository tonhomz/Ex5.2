/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorebound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Prueksa
 */
public class Subscriber1 implements PropertyChangeListener {
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Live Result : " + evt.getNewValue());
   }
}
