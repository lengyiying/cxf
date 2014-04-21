package com.nly.one.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.nly.one.client.Client;
import com.nly.one.service.Server;

/**
 * 
 */
public class TestSample {
    @BeforeClass
    public static void startServer() throws Exception {
        Server.startServer();
    }
    
    @Test
    public void testClient() throws Exception {
        Client.main(null);
    }

}
