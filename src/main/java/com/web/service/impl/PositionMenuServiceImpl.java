package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.PositionmenuMapper;
import com.web.entity.Position;
import com.web.entity.Positionmenu;
import com.web.entity.PositionmenuExample;
import com.web.entity.PositionmenuExample.Criteria;
import com.web.service.PositionMenuService;

@Service
public class PositionMenuServiceImpl implements PositionMenuService {

	@Autowired
	PositionmenuMapper positionmenuMapper;

	@Override
	public List<Integer> selectMenuByPoId(Integer poid) {

		return positionmenuMapper.selctMenuByPoId(poid);
	}

	@Override
	public int saveAuthority(Integer poId, Integer[] menuIds) {
		// 影响的行数
		Integer count = 0;

		// 清空数据
		PositionmenuExample example = new PositionmenuExample();
		Criteria criteria = example.createCriteria();
		criteria.andPostidEqualTo(poId);
		positionmenuMapper.deleteByExample(example);

		// 保存
		for (Integer menuId : menuIds) {
			Positionmenu pm = new Positionmenu();
			pm.setMenuid(menuId);
			pm.setPostid(poId);
			count += positionmenuMapper.insertSelective(pm);
		}

		return count;
	}

}
