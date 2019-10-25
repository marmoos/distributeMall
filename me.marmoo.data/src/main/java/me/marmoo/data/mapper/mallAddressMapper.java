package me.marmoo.data.mapper;

import me.marmoo.common.domain.T_MALL_ADDRESS;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


public interface mallAddressMapper extends BaseMapper<T_MALL_ADDRESS,Long> {
    @Select("select * from T_MALL_ADDRESS")
    public String test();

}
