package model;

import java.sql.SQLException;

public class UserControllerDB extends DBConnection implements UserController{

	@Override
	public void addUser(User aux) throws Exception {
		String insert = "INSERT INTO user VALUES (?,?,?,?,?.?,?,?,?)";
		try {
		connect();
		stmt = con.prepareStatement(insert);
		stmt.setString(1, aux.getUsername());
		stmt.setString(2, aux.getName());
		stmt.setString(3, aux.getSurname());
		stmt.setInt(4, aux.getTlf());
		stmt.setString(5, aux.getEmail());
		stmt.setInt(6, aux.getAccount_n());
		stmt.setString(7, aux.getPassword());
		stmt.setString(8, aux.getLikes());
		stmt.setString(9, aux.getAdress());
		stmt.executeUpdate();
		stmt.close();
		
		disconnect();
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void likesUser() {
		// TODO Auto-generated method stub

	}

}
