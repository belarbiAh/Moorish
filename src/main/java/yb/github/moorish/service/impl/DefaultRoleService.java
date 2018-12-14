package yb.github.moorish.service.impl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import yb.github.moorish.model.Role;
import yb.github.moorish.model.User;
import yb.github.moorish.repository.RoleRepository;
import yb.github.moorish.repository.UserRepository;
import yb.github.moorish.service.RoleService;

public class DefaultRoleService implements RoleService{
	
	@Inject
	private RoleRepository roleRepo;
	
	@Inject
	private UserRepository userRepo;


	public List<Role> getAllRoles() {
		return roleRepo.findAll();
	}

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	public Optional<Role> getRole(Long id) {
		return Optional.ofNullable(roleRepo.getOne(id));
	}

	public Optional<User> getUser(Long id) {
		return  Optional.ofNullable(userRepo.getOne(id));
	}

	@Transactional
	public boolean addOrUpdateRole(Role role) {
		return roleRepo.save(role) != null;
	}

	@Transactional
	public boolean addOrUpdateUser(User user) {
		return userRepo.save(user) != null;
	}

	@Transactional
	public void deleteRole(Long id) {
		try {
			roleRepo.deleteById(id);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	@Transactional
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Transactional
	public Optional<User> getUserByEmail(String email) {
		return Optional.ofNullable(userRepo.findByEmail(email));
		
	}

}
