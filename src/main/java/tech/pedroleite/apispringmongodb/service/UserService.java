package tech.pedroleite.apispringmongodb.service;

import org.springframework.stereotype.Service;
import tech.pedroleite.apispringmongodb.domain.User;
import tech.pedroleite.apispringmongodb.repository.UserRepository;
import tech.pedroleite.apispringmongodb.service.exception.ObjectNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> findAll() {
        return repo.findAll();
    }

    public Optional<User> findById(String id) {
        Optional<User> user = repo.findById(id);
        if (user.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }

        return user;
    }
}
