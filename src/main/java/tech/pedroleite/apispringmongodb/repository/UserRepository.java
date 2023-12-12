package tech.pedroleite.apispringmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.pedroleite.apispringmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
