package net.mjahn.hid.driver;

import java.net.URL;
import java.util.Enumeration;
import junit.framework.TestCase;
import java.io.IOException;
import com.codeminders.hidapi.HIDManager;
import com.codeminders.hidapi.HIDDeviceInfo;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import com.codeminders.hidapi.NarSystem; // generated class, editor might show error

public class HIDDriverTest extends TestCase {

    static {
        NarSystem.loadLibrary();
    }

    @Test
    public void testHIDDriverGeneral() throws IOException {
        listDevices();
        
    }

    // VID(Vendor ID) = 0x0FC5, PID(Product ID) = 0xB080, TID(Family Type ID). 4D1E55B2-F16F-11CF-88CB-001111000030
//    public void testHIDDriver() throws IOException {
//        System.out.println("Loading JNI library.");
//        HIDDeviceInfo[] devs = HIDManager.listDevices();
//        //HIDManager.openById(0x0FC5, 0xB080, null);
//    }
    
    
    private static void listDevices() {
        String property = System.getProperty("java.library.path");
        System.err.println(property);
        try {
            HIDDeviceInfo[] devs = HIDManager.listDevices();
            assertTrue("No USB device found, connect at least one device for verification!",devs != null);
            assertTrue("No USB device found, connect at least one device for verification!",devs.length != 0);
            System.err.println("\nConnected HID Devices:\n\n");
            for (int i = 0; i < devs.length; i++) {
                System.err.println("" + i + ".\t" + devs[i]);
                System.err.println("---------------------------------------------\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    
}
