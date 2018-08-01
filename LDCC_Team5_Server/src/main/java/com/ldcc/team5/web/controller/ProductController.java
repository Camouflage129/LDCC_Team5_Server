package com.ldcc.team5.web.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ldcc.team5.model.ProductInfoModel;
import com.ldcc.team5.product.service.ProductService;

@RestController
public class ProductController {
	@Resource(name="ProductService")
	ProductService service;	
	
	@CrossOrigin
	@RequestMapping(value="/getProductList/{id}/{today}", method = RequestMethod.GET)
	public ResponseEntity<List<ProductInfoModel>> login(@PathVariable("id") String id, @PathVariable("today") Date date) {
		ResponseEntity<List<ProductInfoModel>> resEntity = null;
		try {
			List<ProductInfoModel> list = new ArrayList<>();
			list = service.getProductList(new ProductInfoModel(id,date));
			if(!list.isEmpty()) {
				System.out.println(list);
				resEntity = new ResponseEntity<>(list, HttpStatus.OK);
			}
			else 
				resEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			e.printStackTrace();
			resEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resEntity;
	}
}
