package com.ldcc.team5.product.dao;

import java.util.List;

import com.ldcc.team5.model.ProductInfoModel;

public interface ProductDAO {
	public List<ProductInfoModel> getProductList(ProductInfoModel model);
	public ProductInfoModel getProductInfo(String code);
	public ProductInfoModel getProductInfo2(int num);
	public int deliveryComplete(ProductInfoModel model);
}
