package com.blog.service;

import com.blog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    /**
     * 新增，编辑，保存用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 注册用户
     * @param user
     * @return
     */
    User registerUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    void removeUser(Long id);

    /**
     * 根据id查询user
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 根据名字模糊分页查询
     * @param name
     * @param pageable
     * @return
     */
    Page<User> listUserByNameLike(String name, Pageable pageable);
}
