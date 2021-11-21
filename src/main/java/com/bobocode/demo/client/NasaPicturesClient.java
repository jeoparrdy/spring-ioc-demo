package com.bobocode.demo.client;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class NasaPicturesClient {
    @Autowired
    private RestTemplate restTemplate;

    public List<String> getAllPicturesUrl(){
        System.out.println("Calling NASA...");
        var json = restTemplate.getForObject("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=12&api_key=DEMO_KEY", JsonNode.class);
        return StreamSupport.stream(json.get("photos").spliterator(), false)
                .map(p->p.get("img_src"))
                .map(JsonNode::asText)
                .collect(Collectors.toList());
    }
}
