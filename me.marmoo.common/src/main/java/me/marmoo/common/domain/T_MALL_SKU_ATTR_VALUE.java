package me.marmoo.common.domain;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Index;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.annotation.Unique;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_MALL_SKU_ATTR_VALUE")
public class T_MALL_SKU_ATTR_VALUE extends BaseModel {
	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "shxm_id",type = MySqlTypeConstant.INT,length = 11)
	private int shxm_id;
	@Column(name = "shxzh_id",type = MySqlTypeConstant.INT,length = 11)
	private int shxzh_id;
	@Column(name = "shp_id",type = MySqlTypeConstant.INT,length = 11)
	private int shp_id;
	@Column(name = "is_sku",type = MySqlTypeConstant.VARCHAR)
	private String is_sku;
	@Column(name = "chjshj",type = MySqlTypeConstant.DATETIME)
	private Date chjshj;
	@Column(name = "sku_id",type = MySqlTypeConstant.INT,length = 11)
	private int sku_id;


}
