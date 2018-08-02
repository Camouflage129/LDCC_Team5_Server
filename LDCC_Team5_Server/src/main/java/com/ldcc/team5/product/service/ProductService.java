package com.ldcc.team5.product.service;

import java.util.List;

import com.ldcc.team5.model.ProductInfoModel;

public interface ProductService {
	public List<ProductInfoModel> getProductList(ProductInfoModel model);
	public ProductInfoModel getProductInfo(String code);
	public ProductInfoModel getProductInfo2(int num);
	public int deliveryComplete(ProductInfoModel model);
	public int getTotalProductCount(ProductInfoModel model);
	public int getRemainProductCount(ProductInfoModel model);
}
