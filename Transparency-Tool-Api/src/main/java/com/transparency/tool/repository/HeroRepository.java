package com.transparency.tool.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.transparency.tool.domain.model.Hero;
import com.transparency.tool.domain.model.projections.InlineAddress;

@RepositoryRestResource(collectionResourceRel = "heroes", path = "heroes")//, excerptProjection = InlineAddress.class)
interface HeroRepository extends PagingAndSortingRepository<Hero, Long> {
	Hero findByUsername(String username);
}
