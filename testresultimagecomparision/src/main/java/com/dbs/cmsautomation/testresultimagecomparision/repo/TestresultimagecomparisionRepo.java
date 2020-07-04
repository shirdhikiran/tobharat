package com.dbs.cmsautomation.testresultimagecomparision.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestresultimagecomparisionRepo extends CrudRepository<Testresultimagecomparison, CompositeId> {

    @Query("SELECT DISTINCT a.country FROM Testresultimagecomparison a")
    List<String> getDistinctCountries();

    @Query("SELECT DISTINCT a.segment FROM Testresultimagecomparison a where a.country =:country")
    List<String> getDistinctSegmentsByCountry(String country);

    @Query("SELECT DISTINCT a.url FROM Testresultimagecomparison a where a.country =:country and a.segment =:segment and a.status =:status")
    List<String> getDistinctUrlsByCountryAndSegment(String country, String segment, String status);

    @Query("SELECT DISTINCT a.status FROM Testresultimagecomparison a where a.country =:country and a.segment =:segment")
    List<String> getDistinctStatusList(String country, String segment);
}
