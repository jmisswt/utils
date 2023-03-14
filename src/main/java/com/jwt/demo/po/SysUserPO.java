package com.jwt.demo.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @description: 用户数据表
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2021/12/10 10:04
 */
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_user")
public class SysUserPO implements Serializable {
    private static final long serialVersionUID = 7207780155261265206L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", nullable = false, columnDefinition = "varchar(30) comment '用户米'")
    private String username;

    @Column(name = "password", nullable = false, columnDefinition = "varchar(30) comment '秘密'")
    private String password;

    @Column(name = "email", nullable = false, columnDefinition = "varchar(30) comment '邮箱'")
    private String email;

    @Column(name = "phone", nullable = false, columnDefinition = "varchar(13) comment '电话号码'")
    private String phone;

}
