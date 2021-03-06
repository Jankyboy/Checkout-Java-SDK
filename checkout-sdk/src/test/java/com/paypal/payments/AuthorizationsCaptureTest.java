package com.paypal.payments;

import com.paypal.http.HttpResponse;
import com.paypal.http.HttpClient;
import com.paypal.http.serializer.Json;
import com.paypal.TestHarness;
import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

public class AuthorizationsCaptureTest extends TestHarness {

    @Test(enabled=false)
    public void testAuthorizationsCaptureRequest() throws IOException {
        AuthorizationsCaptureRequest request = new AuthorizationsCaptureRequest("AUTHORIZATION-ID");

        HttpResponse<Capture> response = client().execute(request);
        assertEquals(response.statusCode(), 201);
        assertNotNull(response.result());
    }
}
