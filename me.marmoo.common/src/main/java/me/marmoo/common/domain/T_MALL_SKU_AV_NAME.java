package me.marmoo.common.domain;


import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Index;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_MALL_SKU_AV_NAME")
public class T_MALL_SKU_AV_NAME extends BaseModel {

	@Index
	@Column(name = "shxm_mch",type = MySqlTypeConstant.VARCHAR)
	private String shxm_mch;
	@Index
	@Column(name = "shxzh_mch",type = MySqlTypeConstant.VARCHAR)
	private String shxzh_mch;



}
