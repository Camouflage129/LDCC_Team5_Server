package com.ldcc.team5.product.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldcc.team5.model.ProductInfoModel;
import com.ldcc.team5.product.dao.ProductDAO;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{
	@Resource(name="ProductDAO")
	ProductDAO dao;

	@Override
	public List<ProductInfoModel> getProductList(ProductInfoModel model) {
		return dao.getProductList(model);
	}

	@Override
	public ProductInfoModel getProductInfo(String code) {
		return dao.getProductInfo(code);
	}
}
