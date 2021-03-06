package com.ldcc.team5.product.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ldcc.team5.model.ProductInfoModel;

@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO{
	@Autowired
	SqlSessionTemplate mybatis;

	@Override
	public List<ProductInfoModel> getProductList(ProductInfoModel model) {
		return mybatis.selectList("ProductMapper.getProductList", model);
	}

	@Override
	public ProductInfoModel getProductInfo(String code) {
		return mybatis.selectOne("ProductMapper.getProductInfo", code);
	}

	@Override
	public ProductInfoModel getProductInfo2(int num) {
		return mybatis.selectOne("ProductMapper.getProductInfo2", num);
	}

	@Override
	public int deliveryComplete(ProductInfoModel model) {
		return mybatis.update("ProductMapper.deliveryComplete", model);
	}

	@Override
	public int getTotalProductCount(ProductInfoModel model) {
		return mybatis.selectOne("ProductMapper.getTotalProductCount", model);
	}

	@Override
	public int getRemainProductCount(ProductInfoModel model) {
		return mybatis.selectOne("ProductMapper.getRemainProductCount", model);
	}
}
