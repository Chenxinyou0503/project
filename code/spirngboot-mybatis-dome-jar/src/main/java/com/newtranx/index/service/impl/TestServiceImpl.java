package com.newtranx.index.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newtranx.index.dao.EntityMapper;
import com.newtranx.index.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private EntityMapper entityMapper;

	@Override
	public int insert() {
//		Entity entity = new Entity();
//		entity.setId(123123);
//		entity.setName("132131");
//		entityMapper.insert(entity);

		return 0;
	}

}
