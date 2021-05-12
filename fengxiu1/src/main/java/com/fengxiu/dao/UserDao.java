package com.fengxiu.dao;

import com.fengxiu.models.Theme;
import com.fengxiu.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Long> {

    User findOneByMobile(String mobil);

    User findByOpenid(String openid);


}
