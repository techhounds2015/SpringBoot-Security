package com.springtutorial;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

public interface UserRepo extends CrudRepository<UserDetails, String> {

}
