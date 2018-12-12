package com.lnu.social.mashup;


import com.lnu.social.mashup.model.Item;
import com.lnu.social.mashup.model.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"*"})
public class Controller {

    @Autowired
    private RestTemplate template;

    @Autowired
    private WebGenomicsClient webGenomicsClient;

    @CrossOrigin(origins = {"http://localhost:4200", "https://social-media-ecosystem-mashup.herokuapp.com", "*"})
    @GetMapping("/search")
    public Collection<Analysis> getGenomicsAnalyses(@RequestParam("query") String query) {
        Collection<Analysis> analyses = new ArrayList<Analysis>();
        try {
            SearchResponse forObject = template.getForObject("https://www.googleapis.com/customsearch/v1?key=AIzaSyANNKdsj57oxTNR3LWExatX-l-t26OrhwI&cx=014793772949123529930:qdflpscf6y8&q=" + query, SearchResponse.class);
            for (Item item : forObject.getItems()) {
                try {
                    analyses.add(webGenomicsClient.getGenomics(item.getLink()));
                } catch (IOException e) {
                }
            }
        } catch (Exception e) {
        }
        return analyses;
    }
}
