package cn.itcast.mp.hander;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
//自动填充的插件
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override   //插入数据的时候填充
    public void insertFill(MetaObject metaObject) {
        //先获取到password的值 再进行判断 如果为空 就进行填充 如果不为空 就不处理
        Object password = getFieldValByName("password", metaObject);
        if (password == null) {
            setFieldValByName("password", "222222", metaObject);
        }
    }

    @Override   //更新数据的时候填充
    public void updateFill(MetaObject metaObject) {

    }
}
