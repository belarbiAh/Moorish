package yb.github.moorish.service;

import java.util.List;
import java.util.Optional;

import yb.github.moorish.model.Role;
import yb.github.moorish.model.User;

public interface RoleService {

	List<Role> getAllRoles();

	List<User> getAllUsers();

	Optional<Role> getRole(Long id);

	Optional<User> getUser(Long id);
	
	Optional<User> getUserByEmail(String email);

	boolean addOrUpdateRole(Role role);

	boolean addOrUpdateUser(User user);

	void deleteRole(Long id);

	void deleteUser(Long id);

}
