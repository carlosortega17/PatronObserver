import java.util.Vector;
import java.util.Enumeration;

public class SistemaSensor {
    private Vector<AlarmListener> listeners = new Vector<AlarmListener>();
    
    public void registro(AlarmListener al)
    {
        listeners.addElement(al);
    }

    public void suenaAlarma()
    {
        for(Enumeration e=listeners.elements(); e.hasMoreElements();)
        {
            ((AlarmListener) e.nextElement()).alarm();
        }
    }
}
