package com.chengxi.pojo;

import javax.persistence.*;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 生成类: t_user
 * 创建时间: 2018年12月03日
 * 作者: 姓名
 */

@Entity
@Table(name = "t_user")
@Data
public class TUser {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "age")
    private Integer age;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "sex")
    private String sex;
}