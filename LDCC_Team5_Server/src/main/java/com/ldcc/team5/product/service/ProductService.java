package com.ldcc.team5.product.service;

import java.util.List;

import com.ldcc.team5.model.ProductInfoModel;

public interface ProductService {
	public List<ProductInfoModel> getProductList(ProductInfoModel model);
}