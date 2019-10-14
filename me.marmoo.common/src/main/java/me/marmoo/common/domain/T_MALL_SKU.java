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
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_MALL_SKU")
public class T_MALL_SKU extends BaseModel {

	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "shp_id",type = MySqlTypeConstant.INT,length = 11)
	private int shp_id;
	@Column(name = "kc",type = MySqlTypeConstant.INT,length = 11)
	private int kc;
	@Column(name = "jg",type = MySqlTypeConstant.DECIMAL,decimalLength = 8,length = 12)
	private BigDecimal jg;
	@Column(name = "chjshj",type = MySqlTypeConstant.DATETIME)
	private Date chjshj;
	@Column(name = "sku_mch",type = MySqlTypeConstant.VARCHAR)
	private String sku_mch;
	@Column(name = "kcdz",type = MySqlTypeConstant.VARCHAR)
	private String kcdz;
	@Column(name = "sku_xl",type = MySqlTypeConstant.INT,length = 11)
	private long sku_xl;



}
