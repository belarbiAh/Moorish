package yb.github.moorish.service.impl;

import java.util.Optional;

import javax.inject.Inject;
import yb.github.moorish.model.User;
import yb.github.moorish.repository.UserRepository;
import yb.github.moorish.service.exceptions.JwtSecurityException;

public class AuthenticationService {

	@Inject
	UserRepository userRepository;

	public Optional<User> login(String email, String password) {
		User user = userRepository.findByEmail(email);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				return Optional.of(user);
			}
		}
		throw new JwtSecurityException("user not found");
	}


}
