package com.acme.servermgr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Manage all servers (service providers) being tracked by the Acme server tracking system
 * For now just some simple static methods for use in school project
 */
@Component
public class ServerManager {

    /**
     * A framework will inject what we are to use for monitoring servers
     */
    @Autowired
    private MonitorableServer monitor;


    /**
     * Get the status of this server
     * @return a descriptive string about the servers status
     */
     public String getCurrentServerStatus() {

        String status = monitor.determineServerStatus();

        return status;
    }

    /**
     * Find out if this server is operating normally
     * @return Boolean indicating if server is operating normally
     */
     public Boolean isOperatingNormally()
    {
        return true;
    }    //TODO should use the monitor interface
}
