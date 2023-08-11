package com.xworkz.softwareproduct.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDTO;
import com.xworkz.softwareproduct.util.SoftwareProductUtil;

public class SoftwareProductRepositoryImpl implements SoftwareProductRepository {

	SoftwareProductUtil util = new SoftwareProductUtil();

	public SoftwareProductRepositoryImpl() {
		System.out.println("SoftwareProductRepositoryImpl constructor");
	}

	@Override
	public boolean onSave(SoftwareProductDTO dto) {
		System.out.println("On save method ");
		try {
			Connection connection = DriverManager.getConnection(util.url, util.userName, util.password);
			System.out.println("connection established  " + connection);
			String saveQuery = "insert into softwareproduct values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(saveQuery);
			System.out.println("before " + ps);
			ps.setInt(1, dto.getId());
			ps.setString(2, dto.getUserName());
			ps.setString(3, dto.getEmail());
			ps.setLong(4, dto.getPhoneNumber());
			ps.setString(5, dto.getSoftwateName());
			ps.setInt(6, dto.getVersion());
			ps.setInt(7, dto.getDoe());
			ps.setString(8, dto.getPassword());
			ps.setDouble(9, dto.getPrice());
			ps.setDouble(10, dto.getOsVersion());

			int add = ps.executeUpdate();
			if (add > 0) {
				System.out.println("successfully data added " + add);
			} else {
				System.out.println("invalid data");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public void readAll() {
		try {
			Connection connection = DriverManager.getConnection(util.url, util.userName, util.password);
			System.out.println("connection established " + connection);
			String read = "select * from softwareproduct";
			PreparedStatement ps = connection.prepareStatement(read);
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				System.out.println("id:" + result.getInt(1) + " userName:" + result.getString(2) + " email:"
						+ result.getString(3) + " phoneNumber:" + result.getLong(4) + " softwateName:"
						+ result.getString(5) + " version" + result.getInt(6) + " doe:" + result.getInt(7)
						+ " password:" + result.getString(8) + " price:" + result.getDouble(9) + " osVersion:"
						+ result.getDouble(10));
				System.out.println("after" + result);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean updatePriceBySoftwareVersion(double price, int version) {
		System.out.println("update price by version");
		try {
			Connection connection = DriverManager.getConnection(util.url, util.userName, util.password);
			System.out.println("connection established " + connection);
			String update = "update softwareproduct set price=? where version=?";
			PreparedStatement ps = connection.prepareStatement(update);
			ps.setDouble(1, price);
			ps.setInt(2, version);
			System.out.println("after " + ps);
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean searchById(int id) {
		System.out.println("search by id method invoked");
		try {
			Connection connection = DriverManager.getConnection(util.url, util.userName, util.password);
			System.out.println("connection established " + connection);
			String search = "select * from softwareproduct where id=?";

			PreparedStatement ps = connection.prepareStatement(search);
			ps.setInt(1, id);

			ResultSet s = ps.executeQuery();
			while (s.next()) {
				System.out.println("id:" + s.getInt(1) + " userName:" + s.getString(2) + " email:" + s.getString(3)
						+ " phoneNumber:" + s.getLong(4) + " softwateName:" + s.getString(5) + " version" + s.getInt(6)
						+ " doe:" + s.getInt(7) + " password:" + s.getString(8) + " price:" + s.getDouble(9)
						+ " osVersion:" + s.getDouble(10));
				System.out.println("after" + s);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean searchByversion(int version) {
		System.out.println("search by version");
		try {
			Connection connection = DriverManager.getConnection(util.url, util.userName, util.password);
			System.out.println("connection established " + connection);
			String search = "select * from softwareproduct where version=?";

			PreparedStatement ps = connection.prepareStatement(search);
			ps.setInt(1, version);

			ResultSet s = ps.executeQuery();
			while (s.next()) {
				System.out.println("id:" + s.getInt(1) + " userName:" + s.getString(2) + " email:" + s.getString(3)
						+ " phoneNumber:" + s.getLong(4) + " softwateName:" + s.getString(5) + " version" + s.getInt(6)
						+ " doe:" + s.getInt(7) + " password:" + s.getString(8) + " price:" + s.getDouble(9)
						+ " osVersion:" + s.getDouble(10));
				System.out.println("after" + s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean searchBySoftwateName(String softwateName) {
		System.out.println("search by softwateName");
		try {
			Connection connection = DriverManager.getConnection(util.url, util.userName, util.password);
			System.out.println("connection established " + connection);
			String search = "select * from softwareproduct where softwateName=?";

			PreparedStatement ps = connection.prepareStatement(search);
			ps.setString(1, softwateName);

			ResultSet s = ps.executeQuery();
			while (s.next()) {
				System.out.println("id:" + s.getInt(1) + " userName:" + s.getString(2) + " email:" + s.getString(3)
						+ " phoneNumber:" + s.getLong(4) + " softwateName:" + s.getString(5) + " version" + s.getInt(6)
						+ " doe:" + s.getInt(7) + " password:" + s.getString(8) + " price:" + s.getDouble(9)
						+ " osVersion:" + s.getDouble(10));
				System.out.println("after" + s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteBySoftwareName(String softwateName) {
		System.out.println("delete by softwateName");
		try {
			Connection connection = DriverManager.getConnection(util.url, util.userName, util.password);
			System.out.println("connection established " + connection);
			String delete = "delete from softwareproduct where softwateName=?";
			PreparedStatement ps = connection.prepareStatement(delete);
			ps.setString(1, softwateName);
			int row = ps.executeUpdate();
			if (row > 0) {
				System.out.println("deleted succesfully");
			} else {
				System.out.println("not deleted.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateById(int id, String userName, String email, long phoneNumber, String softwateName, int version,
			int doe, String password, double price, double osVersion) {
		System.out.println("update by id..");
		try {
			Connection connection = DriverManager.getConnection(util.url, util.userName, util.password);
			System.out.println("connection established " + connection);
			String up = "update softwareproduct set userName=?,email=?,phoneNumber=?,softwateName=?,version=?,doe=?,password=?,price=?,osVersion=? where id=?";
			PreparedStatement ps=connection.prepareStatement(up);
			ps.setString(1, userName);
			ps.setString(2, email);
			ps.setLong(3, phoneNumber);
			ps.setString(4, softwateName);
			ps.setInt(5, version);
			ps.setInt(6, doe);
			ps.setString(7, password);
			ps.setDouble(8,price);
			ps.setDouble(9, osVersion);
			ps.setInt(10, id);
			int add=ps.executeUpdate();
			if (add>0) {
				System.out.println("successfully added"+add);
			}else {
				System.out.println("invalid..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
}
