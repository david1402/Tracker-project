package de.telran;


import de.telran.config.TestConfig;
import de.telran.controller.CustomerController;
import de.telran.entity.Customer;
import de.telran.entity.Tracking;
import de.telran.service.TrackingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
@Import(TestConfig.class)
public class TrackingControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private TrackingService service;



  /*  @Test
    public void testAddTracking() throws Exception {
        Tracking trackingEntity = new Tracking(null, "delivered",2L);
        Tracking savedTrackingEntity = new Tracking(1L, "delivered",2L);
        when(service.addTracking(trackingEntity)).thenReturn(savedTrackingEntity);

        mvc.perform(post("/api/shipments/2/trackings")
                .content("{\"status\": \"delivered\",\"shipmentId\":\"2\"}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.trackingId").value("1"))
                .andExpect(jsonPath("$.status").value("delivered"))
                .andExpect(jsonPath("$.shipmentId").value("2"));

        verify(service, times(1)).addTracking(trackingEntity);
    }*/
}

