package me.marmoo.data.mapper;


import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
@NoRepositoryBean
public interface BaseMapper<T,PK extends Serializable> {

    public T getOneByPK(PK id);


}
