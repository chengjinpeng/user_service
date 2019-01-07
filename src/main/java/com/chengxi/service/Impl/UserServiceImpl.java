package com.chengxi.service.Impl;

import com.chengxi.dao.TUserMapper;
import com.chengxi.pojo.TUser;
import com.chengxi.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author chengxi
 * @date 2018/12/3 09:31
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private TUserMapper tUserMapper;

    @Override
    public TUser selectUserById(Integer id) {
        return tUserMapper.selectByPrimaryKey(id);
    }
}
