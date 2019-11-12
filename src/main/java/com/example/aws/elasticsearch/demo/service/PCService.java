package com.example.aws.elasticsearch.demo.service;

import com.example.aws.elasticsearch.demo.document.PersonalCapitalDoc;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.lucene.search.join.ScoreMode;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.Operator;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.*;
import static com.example.aws.elasticsearch.demo.util.Constant.INDEX;
import static com.example.aws.elasticsearch.demo.util.Constant.TYPE;

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


    SearchRequest searchRequest = new SearchRequest();
    searchRequest.indices(INDEX);
    searchRequest.types(TYPE);

    SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

    MatchQueryBuilder matchQueryBuilder =
        QueryBuilders.matchQuery("name", sponsState).operator(Operator.AND);

    searchSourceBuilder.query(matchQueryBuilder);
    searchSourceBuilder.size(size_max);
    searchRequest.source(searchSourceBuilder);

    SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);

    return getSearchResult(searchResponse);

  }


  public List<PersonalCapitalDoc> searchBySponsorName(String sponsName) throws JsonParseException, JsonMappingException, IOException {


    SearchRequest searchRequest = new SearchRequest();
    searchRequest.indices(INDEX);
    searchRequest.types(TYPE);

    SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
    QueryBuilder queryBuilder =
        QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("PLAN_NAME", sponsName));

    searchSourceBuilder.query(queryBuilder);
    searchSourceBuilder.size(size_max);
    searchRequest.source(searchSourceBuilder);

    SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);

    return getSearchResult(response);
  }

  public List<PersonalCapitalDoc> searchByPlanName(String planName) throws Exception {

    SearchRequest searchRequest = buildSearchRequest(INDEX, TYPE);
    SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

    QueryBuilder queryBuilder =
        QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("PLAN_NAME", planName));

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
