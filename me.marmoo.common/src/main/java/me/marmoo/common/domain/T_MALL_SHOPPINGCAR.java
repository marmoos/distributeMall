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
@Table(name = "T_MALL_SHOPPINGCAR")
public class T_MALL_SHOPPINGCAR extends BaseModel {
	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "sku_mch",type = MySqlTypeConstant.VARCHAR)
	private String sku_mch;
	@Column(name = "sku_jg",type = MySqlTypeConstant.DOUBLE,decimalLength = 8)
	private double sku_jg;
	@Column(name = "tjshl",type = MySqlTypeConstant.INT,length = 11)
	private int tjshl;
	@Column(name = "hj",type = MySqlTypeConstant.DOUBLE,decimalLength = 8)
	private double hj;
	@Column(name = "yh_id",type = MySqlTypeConstant.INT,length = 11)
	private int yh_id;
	@Column(name = "shp_id",type = MySqlTypeConstant.INT,length = 11)
	private int shp_id;
	@Column(name = "chjshj",type = MySqlTypeConstant.DATETIME)
	private Date chjshj;
	@Column(name = "sku_id",type = MySqlTypeConstant.INT,length = 11)
	private int sku_id;
	@Column(name = "shp_tp",type = MySqlTypeConstant.VARCHAR)
	private String shp_tp;
	@Column(name = "shfxz",type = MySqlTypeConstant.VARCHAR)
	private String shfxz;

	@Column(name = "kcdz",type = MySqlTypeConstant.VARCHAR)
	private String kcdz;


}
