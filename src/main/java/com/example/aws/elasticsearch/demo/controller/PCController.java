package com.example.aws.elasticsearch.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.aws.elasticsearch.demo.document.PersonalCapitalDoc;
import com.example.aws.elasticsearch.demo.service.PCService;

@RestController()
public class PCController {

  @Autowired
  private PCService service;


  @GetMapping("/test")
  public String test() {

    return "Success";
  }

  @GetMapping(value = "/")
  public List<PersonalCapitalDoc> findAll() throws Exception {
    return service.findAll();
  }

  @GetMapping(value = "/search/plan")
  public List<PersonalCapitalDoc> search(@RequestParam(value = "plan") String plan)
      throws Exception {
    return service.searchByPlanName(plan);
  }

  @GetMapping(value = "/search/sponsorName")
  public List<PersonalCapitalDoc> searchByName(@RequestParam(value = "sponsorName") String name)
      throws Exception {
    return service.searchBySponsorName(name);
  }

  @GetMapping(value = "/search/sponsorState")
  public List<PersonalCapitalDoc> searchByState(@RequestParam(value = "sponsorState") String state)
      throws Exception {
    return service.searchBySponsorState(state);
  }


}
