package com.cg.service;

import java.util.List;

import com.cg.bean.LoginBean;
import com.cg.bean.ProductBean;
import com.cg.bean.UserBean;
import com.cg.dao.ShoppingDao;
import com.cg.dao.ShoppingDaoImp;

/** 
* @author pragya
* @date 27-Mar-2020
@time 1:50:20 pm
*/
public class ShoppingServiceImpl implements ShoppingService {

private ShoppingDao dao;
	
	public ShoppingServiceImpl() {
		dao=ShoppingDaoImp.getDao();
	}
	@Override
	public boolean save(UserBean user) {
		return dao.persist(user);
	}

	@Override
	public UserBean validate(LoginBean login) {
		return dao.authenticate(login);
	}

	@Override
	public ProductBean getProduct(int code) {
		// TODO Auto-generated method stub
		return dao.fetchProduct(code);
	}

	@Override
	public List<ProductBean> getCatalog() {
		// TODO Auto-generated method stub
		return dao.getCatalog();
	}

	
	
}
