package com.ldcc.team5.product.service;

import java.sql.Date;
import java.util.List;

import com.ldcc.team5.model.ProductInfoModel;

public interface ProductService {
	public List<ProductInfoModel> getProductList(ProductInfoModel model);
	public ProductInfoModel getProductInfo(String code);
	public ProductInfoModel getProductInfo2(int num);
	public int deliveryComplete(String code);
	public int getTotalBox(ProductInfoModel model);
	public int getRemainBox();
}
