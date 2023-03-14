package com.jwt.demo.repository;

import com.jwt.demo.po.SysUserPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @description: 用户操作
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2021/12/10 10:08
 */
@Service
public interface UserRepository extends JpaRepository<SysUserPO, Integer> {

    /**
     * 通过用户名和密码查找用户
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户信息
     */
    List<SysUserPO> findByUsernameAndPassword(String username, String password);
}
