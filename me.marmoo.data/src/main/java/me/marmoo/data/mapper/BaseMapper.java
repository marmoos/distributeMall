package me.marmoo.data.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

public interface BaseMapper<T,PK extends Serializable> {

    public T getOneByPK(@Param("id") PK id);


}
