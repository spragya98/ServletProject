package com.cg.service;

import java.util.List;

import com.cg.bean.LoginBean;
import com.cg.bean.ProductBean;
import com.cg.bean.UserBean;

/** 
* @author pragya
* @date 27-Mar-2020
@time 1:49:48 pm
*/
public interface ShoppingService {

	boolean save(UserBean user);
	UserBean validate(LoginBean login);
	ProductBean getProduct(int code);
	List<ProductBean>getCatalog();
}
