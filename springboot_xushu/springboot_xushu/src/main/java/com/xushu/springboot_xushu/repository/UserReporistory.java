package com.xushu.springboot_xushu.repository;

import com.xushu.springboot_xushu.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// CrudRepository<要操作的实体类, 实体类主键的类型>
public interface UserReporistory extends CrudRepository<User,Integer> {
}
