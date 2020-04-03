package zn.jester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zn.jester.entity.User;

/**
 * @author 曲逸涵
 * @date 2020/4/1 17:17
 * @Email:2628908921@qq.com
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
