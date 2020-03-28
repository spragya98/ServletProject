package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.LoginBean;
import com.cg.bean.ProductBean;
import com.cg.bean.UserBean;

/** 
* @author pragya
* @date 27-Mar-2020
@time 1:52:12 pm
*/
public class ShoppingDaoImp implements ShoppingDao {

	List<ProductBean> catalog=new ArrayList<ProductBean>();
	//private List<ProductBean> catalog;
	private List<UserBean> users;
	 
	 private static ShoppingDao dao;
	 
	 public static ShoppingDao getDao()
	 {
		 if(dao==null)
			 dao=new ShoppingDaoImp();
		 
		 return dao;
	 }
	
	 public ShoppingDaoImp() {
		catalog.add(new ProductBean(1,"Mobile",20000));
		catalog.add(new ProductBean(2,"Tablet",30000));
		catalog.add(new ProductBean(3,"PC",60000));
		catalog.add(new ProductBean(4,"Laptop",80000));
		catalog.add(new ProductBean(5,"Earphones",2000));
		catalog.add(new ProductBean(6,"iPod",15000));
		catalog.add(new ProductBean(7,"Football",2000));
		catalog.add(new ProductBean(8,"Bat",12000));
		catalog.add(new ProductBean(9,"Ball",2000));
		catalog.add(new ProductBean(10,"Stumps",1000));
		
		users =new ArrayList<UserBean>();
		users.add(new UserBean("Polo","12","java","Pune","sarkar@gmail.com","7721877022"));
	}

	@Override
	public boolean persist(UserBean user) {
		users.add(user);
		return true;
	}

	@Override
	public UserBean authenticate(LoginBean login) {
		return users.parallelStream().filter(u -> u.getUserid().equals(login.getUsername())
				&& u.getPassword().equals(login.getPassword())).findFirst().orElse(null);
	}

	@Override
	public ProductBean fetchProduct(int code) {
		return catalog.stream().filter(p ->p.getCode()==code).findFirst().get();
	}

	@Override
	public List<ProductBean> getCatalog() {
		return catalog;
	}

}
