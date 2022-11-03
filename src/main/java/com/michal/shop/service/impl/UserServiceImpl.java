package com.michal.shop.service.impl;

import com.michal.shop.model.dao.User;
import com.michal.shop.repository.UserRepository;
import com.michal.shop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public User update(User user, Long id) {
        User userDb=getById(id);
        userDb.setEmail(user.getEmail());
        userDb.setFirstname(user.getFirstname());
        userDb.setLastname(user.getLastname());
        return userDb;

    }

    @Override
    public void delete(Long id) {
    userRepository.deleteById(id);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public Page<User> getPage(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
