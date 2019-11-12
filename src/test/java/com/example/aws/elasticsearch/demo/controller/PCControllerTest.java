package com.example.aws.elasticsearch.demo.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.example.aws.elasticsearch.demo.service.PCService;
import com.example.aws.elasticsearch.demo.service.PCServiceTest;

@RunWith(MockitoJUnitRunner.class)
public class PCControllerTest {

  @InjectMocks
  private PCController controller;
  private MockMvc mockMvc;

  @Mock
  private PCService service;

  @Before
  public void init() {
    MockitoAnnotations.initMocks(this);
    mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
  }

  @Test
  public void testController() throws Exception {
    mockMvc.perform(get("/test").contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  @Test
  public void testSearchByPlanName() throws Exception {
    mockMvc
        .perform(
            get("/search/plan").param("plan", "Kaiser").contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
    verify(service, times(1)).searchByPlanName(Mockito.anyString());
  }

  @Test
  public void failSearchByPlanName() throws Exception {
    mockMvc
        .perform(get("/search/plan").param("plans", "CA").contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void testSearchBySponsName() throws Exception {
    mockMvc.perform(get("/search/sponsorName").param("sponsorName", "ABC")
        .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    verify(service, times(1)).searchBySponsorName(Mockito.anyString());
  }

  @Test
  public void failSearchBySponsName() throws Exception {
    mockMvc.perform(
        get("/search/sponsorName").param("sponse", "CA").contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void testSearchBySponsState() throws Exception {
    mockMvc.perform(get("/search/sponsorState").param("sponsorState", "CA")
        .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    verify(service, times(1)).searchBySponsorState(Mockito.anyString());
  }

  @Test
  public void failSearchBySponsState() throws Exception {
    mockMvc.perform(
        get("/search/sponsorState").param("sponse", "CA").contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isBadRequest());
  }


}
