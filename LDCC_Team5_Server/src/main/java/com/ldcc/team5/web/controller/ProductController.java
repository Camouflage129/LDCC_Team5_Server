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
	public ResponseEntity<List<ProductInfoModel>> getProductList(@PathVariable("id") String id, @PathVariable("today") Date date) {
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
	
	@CrossOrigin
	@RequestMapping(value="/getProductInfo/{code}", method = RequestMethod.GET)
	public ResponseEntity<List<ProductInfoModel>> getProductInfo(@PathVariable("code") String code) {
		ResponseEntity<List<ProductInfoModel>> resEntity = null;
		try {
			List<ProductInfoModel> list = new ArrayList<>();
			ProductInfoModel model = service.getProductInfo(code);
			if(model != null) {
				list.add(model);
				System.out.println(model);
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

	@CrossOrigin
	@RequestMapping(value="/getProductInfo2/{num}", method = RequestMethod.GET)
	public ResponseEntity<List<ProductInfoModel>> getProductInfo2(@PathVariable("num") int num) {
		ResponseEntity<List<ProductInfoModel>> resEntity = null;
		try {
			List<ProductInfoModel> list = new ArrayList<>();
			ProductInfoModel model = service.getProductInfo2(num);
			if(model != null) {
				list.add(model);
				System.out.println(model);
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

	@CrossOrigin
	@RequestMapping(value="/deliveryComplete/{code}", method = RequestMethod.PUT)
	public ResponseEntity<String> deliveryComplete(@PathVariable("code") String code) {
		ResponseEntity<String> resEntity = null;
		try {
			int row = service.deliveryComplete(new ProductInfoModel(code,"y"));
			if(row > 0) 
				resEntity = new ResponseEntity<>("success", HttpStatus.OK);
			else 
				resEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			e.printStackTrace();
			resEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resEntity;
	}

	@CrossOrigin
	@RequestMapping(value="/userStatus/{id}/{date}", method = RequestMethod.PUT)
	public ResponseEntity<List<Integer>> userStatus(@PathVariable("id") String id, @PathVariable("id") Date date) {
		ResponseEntity<List<Integer>> resEntity = null;
		try {
			List<Integer> list = new ArrayList<>();
			ProductInfoModel model = new ProductInfoModel(id, date, "n");
			int remain = service.getRemainProductCount(model);
			int total = service.getTotalProductCount(model);
			if(total > 0)  {
				list.add(total-remain);
				list.add(total);
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
