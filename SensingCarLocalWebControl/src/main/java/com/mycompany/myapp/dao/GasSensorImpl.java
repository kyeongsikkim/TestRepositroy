package com.mycompany.myapp.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dto.GasSensor;
@Component
public class GasSensorImpl implements GasSensorDao {
	@Autowired
	private GasSensorDao gasSensorDao;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(GasSensorImpl.class);
	@Autowired
	private SqlSessionTemplate sst;
	@Override
	public List<GasSensor> selectByAll() {
		LOGGER.info("");
		return sst.selectList("gassensor.selectByAll");
	}
	@Override
	public int insert(GasSensor gasSensor) {
		sst.insert("gassensor.insert",gasSensor);
		return gasSensor.getGno();
	}

}
