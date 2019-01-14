package top.heysunday.myblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.heysunday.myblog.mapper.HelloMapper;
import top.heysunday.myblog.model.Hello;
import top.heysunday.myblog.service.HelloService;

@Service("HelloServiceImpl")
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloMapper helloDao;

    public Hello getHelloMessage(Integer id){
        Hello hlo = helloDao.getHello(id);
        return hlo;
    }
}
