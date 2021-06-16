package ua.lviv.trainapplogos.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.trainapplogos.dao.UserDao;
import ua.lviv.trainapplogos.dao.impl.UserDaoImpl;
import ua.lviv.trainapplogos.domain.User;
import ua.lviv.trainapplogos.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserServiceImpl() {
		try {
			userDao = new UserDaoImpl();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User create(User user) {
		return userDao.create(user);
	}

	@Override
	public User read(Integer id) {
		return userDao.read(id);
	}

	@Override
	public User update(User user) {
		return userDao.update(user);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

	@Override
	public List<User> readAll() {
		return userDao.readAll();
	}
}
