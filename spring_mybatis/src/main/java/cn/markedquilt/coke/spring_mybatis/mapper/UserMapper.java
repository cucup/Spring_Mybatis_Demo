package cn.markedquilt.coke.spring_mybatis.mapper;
import cn.markedquilt.coke.spring_mybatis.entity.User;

import java.util.List;


public interface UserMapper {

    List<User> getAll();

    User getOne(int id);

    void insert(User user);

    void update(User user);

    void delete(int id);

}
