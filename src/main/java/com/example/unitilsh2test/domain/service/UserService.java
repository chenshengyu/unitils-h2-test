package com.example.unitilsh2test.domain.service;


import com.example.unitilsh2test.domain.infrastructure.entity.User;

/**
 * 用户 service
 *
 * @author chensy
 * @since 2017/6/23.
 */
public interface UserService {
    /**
     * 登陆
     *
     * @param name 名字
     * @return User
     */
    User login(String name);
}
