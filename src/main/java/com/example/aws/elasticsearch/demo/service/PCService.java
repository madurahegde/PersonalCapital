package com.example.aws.elasticsearch.demo.service;

import static com.example.aws.elasticsearch.demo.util.Constant.INDEX;
import static com.example.aws.elasticsearch.demo.util.Constant.TYPE;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.aws.elasticsearch.demo.document.PersonalCapitalDoc;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PCService {


  private RestHighLevelClient client;

  private int size_max = 100;
  
  private ObjectMapper objectMapper;

  @Autowired
  public PCService(RestHighLevelClient client, ObjectMapper objectMapper) {
    this.client = client;
    this.objectMapper = objectMapper;
  }


  public List<PersonalCapitalDoc> findAll() throws Exception {


    SearchRequest searchRequest = buildSearchRequest(INDEX, TYPE);
    SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
    searchSourceBuilder.query(QueryBuilders.matchAllQuery());
    searchSourceBuilder.size(size_max);
    searchRequest.source(searchSourceBuilder);

    SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);

    return getSearchResult(searchResponse);
  }


  public List<PersonalCapitalDoc> searchBySponsorState(String sponsState) throws Exception {
    return buildQuery("SPONS_DFE_LOC_US_STATE", sponsState);

  }

  public List<PersonalCapitalDoc> searchBySponsorName(String sponsName)
      throws JsonParseException, JsonMappingException, IOException {
    return buildQuery("SPONSOR_DFE_NAME", sponsName);
  }

  public List<PersonalCapitalDoc> searchByPlanName(String planName) throws Exception {

    return buildQuery("PLAN_NAME", planName);
  }


  private List<PersonalCapitalDoc> buildQuery(String attributeName, String value)
      throws IOException, JsonParseException, JsonMappingException {
    SearchRequest searchRequest = buildSearchRequest(INDEX, TYPE);
    SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

    QueryBuilder queryBuilder =
        QueryBuilders.boolQuery().must(QueryBuilders.matchQuery(attributeName, value));

    searchSourceBuilder.query(queryBuilder);
    searchSourceBuilder.size(size_max);
    searchRequest.source(searchSourceBuilder);

    SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);

    return getSearchResult(response);
  }

  private List<PersonalCapitalDoc> getSearchResult(SearchResponse response)
      throws JsonParseException, JsonMappingException, IOException {

    SearchHit[] searchHit = response.getHits().getHits();

    List<PersonalCapitalDoc> profileDocuments = new ArrayList<>();

    for (SearchHit hit : searchHit) {
      String sourceStr = hit.getSourceAsString();
      profileDocuments.add(objectMapper.readValue(sourceStr, PersonalCapitalDoc.class));
    }

    return profileDocuments;
  }

  private SearchRequest buildSearchRequest(String index, String type) {

    SearchRequest searchRequest = new SearchRequest();
    searchRequest.indices(index);
    searchRequest.types(type);

    return searchRequest;
  }

}
