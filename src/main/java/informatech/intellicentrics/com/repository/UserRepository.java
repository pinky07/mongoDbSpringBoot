package informatech.intellicentrics.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import informatech.intellicentrics.com.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {

}
