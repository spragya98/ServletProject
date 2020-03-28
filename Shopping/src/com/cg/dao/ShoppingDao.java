package com.cg.dao;

import java.util.List;

import com.cg.bean.LoginBean;
import com.cg.bean.ProductBean;
import com.cg.bean.UserBean;

/** 
* @author pragya
* @date 27-Mar-2020
@time 1:51:53 pm
*/
public interface ShoppingDao {

  boolean persist(UserBean user);
  UserBean authenticate(LoginBean login);
  ProductBean fetchProduct(int code);
  List<ProductBean>getCatalog();
}
