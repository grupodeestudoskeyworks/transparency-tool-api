package com.transparency.tool.domain.model.projections;

import org.springframework.data.rest.core.config.Projection;

import com.transparency.tool.domain.model.Address;
import com.transparency.tool.domain.model.Hero;

@Projection(name = "inlineAddress", types = { Hero.class }) 
public interface InlineAddress {

  String getFirstName();

  String getLastName();

  Address getAddress(); 
}
