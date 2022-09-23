package scorebound;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Prueksa
 */
public class LiveScoreBeans implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "scoreLine";
    
    private String scoreLine;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBeans() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getscoreLine() {
        return scoreLine;
    }
    
    public void setscoreLine(String value) {
        String oldValue = scoreLine;
        scoreLine = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
