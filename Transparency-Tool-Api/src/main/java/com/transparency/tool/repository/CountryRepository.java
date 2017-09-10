package com.transparency.tool.repository;



import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.transparency.tool.domain.model.Country;

@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

}
