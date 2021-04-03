package mydemo.mapper;

import com.example.mydemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User getById(@Param("id") Integer id);
}
