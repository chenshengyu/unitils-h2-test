package com.example.unitilsh2test.domain.infrastructure.model;

import com.example.unitilsh2test.domain.infrastructure.entity.User;
import com.example.unitilsh2test.domain.model.UserRepository;
import com.example.unitilsh2test.domain.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户 service 实现类
 *
 * @author chensy
 * @since 2017/6/23.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User login(String name) {
        User user = userRepository.findByName(name);
        if (user != null) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
        return user;
    }
}
