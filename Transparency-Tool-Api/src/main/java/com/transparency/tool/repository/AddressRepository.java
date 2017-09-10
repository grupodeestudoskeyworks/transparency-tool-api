package com.transparency.tool.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.transparency.tool.domain.model.Address;

@RepositoryRestResource(collectionResourceRel = "addresses", path = "addresses")
interface AddressRepository extends PagingAndSortingRepository<Address, Long> {

}