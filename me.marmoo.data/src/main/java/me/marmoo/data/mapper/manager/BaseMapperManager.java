package me.marmoo.data.mapper.manager;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;

@Mapper
public interface BaseMapperManager<T,PK extends Serializable> {

    @Select("select * from #{tableName} where id =#{id}")
    public T getOneByPK(String tableName,PK id);


}
