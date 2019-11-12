package com.example.aws.elasticsearch.demo.controller;

import static org.hamcrest.CoreMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.util.NestedServletException;
import com.example.aws.elasticsearch.demo.service.PCService;

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
    mockMvc.perform(get("/search/plan", "Kaiser").contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
    verify(service, times(1)).searchByPlanName(Mockito.anyString());
  }

  @Test
  public void testSearchBySponsName() throws Exception {
    mockMvc
        .perform(get("/search/sponsorName").contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
  
  @Test
  public void testSearchBySponsState() throws Exception {
    mockMvc
        .perform(get("/search/sponsorState").contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
  
//  @Autowired
//  public PCController(PCService service) {
//
//    this.service = service;
//  }
//
//  @GetMapping("/test")
//  public String test() {
//
//    return "Success";
//  }
//
//  @GetMapping
//  public List<PersonalCapitalDoc> findAll() throws Exception {
//
//    return service.findAll();
//  }
//
//  @GetMapping(value = "/search/plan")
//  public List<PersonalCapitalDoc> search(@RequestParam(value = "technology") String technology)
//      throws Exception {
//    return service.searchByPlanName(technology);
//  }
//
//  @GetMapping(value = "/search/sponsorName")
//  public List<PersonalCapitalDoc> searchByName(@RequestParam(value = "sponsorName") String name)
//      throws Exception {
//    return service.searchBySponsorName(name);
//  }
//
//  @GetMapping(value = "/search/sponsorState")
//  public List<PersonalCapitalDoc> searchByState(@RequestParam(value = "sponsorState") String state)
//      throws Exception {
//    return service.searchBySponsorState(state);
//  }
//

}
