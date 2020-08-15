package com.dbs.cmsautomation.testresultimagecomparision.rest;

import com.dbs.cmsautomation.testresultimagecomparision.repo.CompositeId;
import com.dbs.cmsautomation.testresultimagecomparision.repo.TestresultimagecomparisionRepo;
import com.dbs.cmsautomation.testresultimagecomparision.repo.Testresultimagecomparison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/imagecomparision")
@CrossOrigin(origins = "http://localhost:4200")
public class ImageComparisionController {

    @Autowired
    TestresultimagecomparisionRepo repo;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Testresultimagecomparison> getData(){

        return repo.findAll();

    }

    @GetMapping(path="/countries")

    public @ResponseBody List<String> getDistinctCountries(){

        return repo.getDistinctCountries();

    }

    @GetMapping(path="/statusList/{country}/{segment}")

    public @ResponseBody List<String> getDistinctStatusList(@PathVariable String country, @PathVariable String segment){

        return repo.getDistinctStatusList(country,segment);

    }

    @GetMapping(path="/segments/{country}")

    public @ResponseBody List<String> getDistinctSegmentsByCountry(@PathVariable String country){

        return repo.getDistinctSegmentsByCountry(country);

    }



    @GetMapping(path="/urls/{country}/{segment}/{status}")

    public @ResponseBody List<String> getDistinctUrlsByCountryAndSegment(@PathVariable String country, @PathVariable String segment,@PathVariable String status){

        return repo.getDistinctUrlsByCountryAndSegment(country,segment,status);

    }

    @GetMapping(path="/getImages/{country}/{segment}/{url}")

    public @ResponseBody
    Optional<Testresultimagecomparison> getRecordByCompositeKey(@PathVariable String country, @PathVariable String segment, @PathVariable String url){

        CompositeId compositeId = new CompositeId(country,segment,url);

        return repo.findById(compositeId);

    }

    @PostMapping(path="getImagesPost")
    public @ResponseBody
    Optional<Testresultimagecomparison> getRecordByCompositeKeyPost(@RequestBody CompositeId compositeId){
        return repo.findById(compositeId);
    }
}
