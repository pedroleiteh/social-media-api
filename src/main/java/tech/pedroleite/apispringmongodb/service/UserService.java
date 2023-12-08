package tech.pedroleite.apispringmongodb.service;

import org.springframework.stereotype.Service;
import tech.pedroleite.apispringmongodb.domain.User;
import tech.pedroleite.apispringmongodb.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> findAll() {
        return repo.findAll();
    }
}
