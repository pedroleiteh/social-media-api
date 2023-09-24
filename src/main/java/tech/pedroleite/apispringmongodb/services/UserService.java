package tech.pedroleite.apispringmongodb.services;

import org.springframework.stereotype.Service;
import tech.pedroleite.apispringmongodb.domain.User;
import tech.pedroleite.apispringmongodb.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> findAll() {
        return repo.findAll();
    }
}
