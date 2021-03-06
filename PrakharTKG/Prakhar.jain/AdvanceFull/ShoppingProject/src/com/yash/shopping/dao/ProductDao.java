package com.yash.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.shopping.pojo.Product;

public class ProductDao {

	public static List<Product> selectList(String type) {
		String sql="Select * from product where type=?";
		Connection connection=CustomerDao.getConnection();
		List<Product> productList=new ArrayList<Product>();
		Product product=null;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, type);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				product=new Product();
				product.setProductId(resultSet.getInt(1));
				product.setProductName(resultSet.getString(2));
				product.setPrice(resultSet.getInt(3));
				product.setUrl(resultSet.getString(4));
				product.setType(resultSet.getString(5));
				productList.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productList;
	}

}
