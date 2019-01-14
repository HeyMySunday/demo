package top.heysunday.myblog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import top.heysunday.myblog.model.Hello;

@Component
@Mapper
public interface HelloMapper {
    @Select("select * from hello where id =#{id}")
    Hello getHello(Integer id);
}
