package com.example.unitilsh2test.domain.infrastructure.entity;

import lombok.Data;

/**
 * 用户 entity
 *
 * @author chensy
 * @since 2017/6/23.
 */
@Data
public class User {
    /**
     * 用户名称
     */
    private String username;
    /**
     * 邮件
     */
    private String email;
    /**
     * 密码
     */
    private String password;

}
