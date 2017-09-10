package com.transparency.tool.repository;



import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.transparency.tool.domain.model.City;

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
interface CityRepository extends PagingAndSortingRepository<City, Long> {

}
