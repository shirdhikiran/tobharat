package com.dbs.cmsautomation.tasks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface HighlightsRepository extends JpaRepository<Highlights, Integer> {
}
