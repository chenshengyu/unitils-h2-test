package com.example.unitilsh2test.domain.infrastructure.model;

import com.example.unitilsh2test.domain.infrastructure.entity.User;
import com.example.unitilsh2test.domain.infrastructure.model.mapper.UserMapper;
import com.example.unitilsh2test.domain.model.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 用户 仓库管理
 *
 * @author chensy
 * @since 2017/6/23.
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }


}
