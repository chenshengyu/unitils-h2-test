package com.example.unitilsh2test.domain.infrastructure.model;

import com.example.unitilsh2test.common.UnitilsH2TestApplicationTests;
import com.example.unitilsh2test.domain.infrastructure.entity.User;
import com.example.unitilsh2test.domain.model.UserRepository;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringBeanByType;

/**
 * @author chensy
 * @Date: Created in 17:43 2017/12/5
 */
@DataSet(value = "/database/dataset/user.xml")
public class UserRepositoryImplTest extends UnitilsH2TestApplicationTests {

    @SpringBeanByType
    private UserRepository userRepository;

    @Test
    public void findByName() throws Exception {
        User user = userRepository.findByName("1");
        Assertions.assertThat(user).hasFieldOrPropertyWithValue("email", "1");
    }

}