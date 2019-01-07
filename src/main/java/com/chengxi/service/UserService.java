package com.chengxi.service;

import com.chengxi.pojo.TUser;

/**
 * @author chengxi
 * @date 2018/12/3 09:29
 */
public interface UserService {

    /**
     * 通过id查找用户信息
     * @param id
     * @return
     */
   public TUser selectUserById(Integer id);


}
