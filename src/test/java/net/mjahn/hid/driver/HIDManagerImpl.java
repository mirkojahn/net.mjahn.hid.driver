package net.mjahn.hid.driver;

import com.codeminders.hidapi.HIDDeviceInfo;
import com.codeminders.hidapi.HIDManager;
import java.io.IOException;

public class HIDManagerImpl extends HIDManager {
    
    /**
     * Creates a new <code>HIDManagerTest</code> object.
     */
    public HIDManagerImpl() throws IOException
    {
       super();
    }
    
    /**
     * Callback method which will be called when HID device is
     * connected.
     *
     * @param dev Reference to the <code>HIDDeviceInfo</code> object.
     * @throws IOException
     */
    public void deviceAdded( HIDDeviceInfo dev )
    {
       System.out.print("Added:" + "\n" + dev + "\n");
    }
    
    /**
     * Callback method which will be called when HID device is
     * disconnected.
     *
     * @param dev Reference to the <code>HIDDeviceInfo</code> object.
     * @throws IOException
     */
    public void deviceRemoved( HIDDeviceInfo dev)
    {
        System.out.print("Removal:" + "\n" + dev + "\n");
    }
}
