package com.newtranx.index.dao;

import com.newtranx.index.entity.Entity;

public interface EntityMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Entity record);

	int insertSelective(Entity record);

	Entity selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Entity record);

	int updateByPrimaryKey(Entity record);
}