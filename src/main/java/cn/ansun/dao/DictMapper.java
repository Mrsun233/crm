package cn.ansun.dao;

import cn.ansun.pojo.BaseDict;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DictMapper {
	
	public List<BaseDict> findDictByCode(String code);
	
}
