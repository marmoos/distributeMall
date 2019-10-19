package me.marmoo.data.mapper.manager;

import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import me.marmoo.data.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@Transactional
@Service
public class BaseMapperImpl<T,PK extends Serializable> implements BaseMapper<T,PK> {
    private Class clazz;

    @Autowired
    private BaseMapperManager<T,PK> mapperManager;
    //@PostConstruct
    public void getClazz(){
        Class class1=this.getClass();
        Type genType=class1.getGenericSuperclass();
        Type[] params=((ParameterizedType)genType).getActualTypeArguments();
        clazz=  params[0].getClass();

    }


    @Override
    public T getOneByPK(PK id) {
        getClazz();
        String tableName=clazz.getName();
        System.out.println(tableName);
        mapperManager.getOneByPK(tableName,id);
        return null;
    }
}
