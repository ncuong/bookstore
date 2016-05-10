package vn.taibt.web.security;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import vn.taibt.bean.User;
import vn.taibt.db.dao.UserDAO;
import vn.taibt.db.dao.UserDAOImpl;

public class CustomUserDetailsService implements UserDetailsService {

	private UserDAO userDAO;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		userDAO = new UserDAOImpl();
		try {
			User user = userDAO.findByUsername(username);
			UserDetails userDetails = null;
			if (null != user) {
				Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
				SimpleGrantedAuthority authority = new SimpleGrantedAuthority(
						user.getRole().getRoleName());
				authorities.add(authority);
				userDetails = new org.springframework.security.core.userdetails.User(
						user.getUserName(), user.getPassword(), authorities);

			} else {
				throw new UsernameNotFoundException(String.format(
						"Could not find any user with username: %s", username));
			}

			return userDetails;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
