
package za.co.telkom;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.4
 * 2019-04-05T10:54:36.784+05:30
 * Generated source version: 3.0.4
 */

@WebFault(name = "rechargeCancelResponse", targetNamespace = "http://www.telkom.co.za")
public class RechargeCancelSoapOut extends Exception {
    
    private za.co.telkom.RechargeCancelResponse rechargeCancelResponse;

    public RechargeCancelSoapOut() {
        super();
    }
    
    public RechargeCancelSoapOut(String message) {
        super(message);
    }
    
    public RechargeCancelSoapOut(String message, Throwable cause) {
        super(message, cause);
    }

    public RechargeCancelSoapOut(String message, za.co.telkom.RechargeCancelResponse rechargeCancelResponse) {
        super(message);
        this.rechargeCancelResponse = rechargeCancelResponse;
    }

    public RechargeCancelSoapOut(String message, za.co.telkom.RechargeCancelResponse rechargeCancelResponse, Throwable cause) {
        super(message, cause);
        this.rechargeCancelResponse = rechargeCancelResponse;
    }

    public za.co.telkom.RechargeCancelResponse getFaultInfo() {
        return this.rechargeCancelResponse;
    }
}
