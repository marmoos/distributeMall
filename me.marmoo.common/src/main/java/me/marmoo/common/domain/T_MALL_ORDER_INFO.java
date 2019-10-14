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
@Table(name = "T_MALL_ORDER_INFO")
public class T_MALL_ORDER_INFO extends BaseModel {

	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "dd_id",type = MySqlTypeConstant.INT,length = 11)
	private int dd_id;
	@Column(name = "sku_id",type = MySqlTypeConstant.INT,length = 11)
	private int sku_id;
	@Column(name = "chjshj",type = MySqlTypeConstant.DATETIME)
	private Date chjshj;
	@Column(name="sku_mch",type = MySqlTypeConstant.VARCHAR)
	private String sku_mch;
	@Column(name="shp_tp",type = MySqlTypeConstant.VARCHAR)
	private String shp_tp;
	@Column(name = "sku_jg",type = MySqlTypeConstant.DOUBLE,length = 8)
	private double sku_jg;
	@Column(name = "sku_shl",type = MySqlTypeConstant.INT,length = 11)
	private int sku_shl;
	@Column(name="sku_kcdz",type = MySqlTypeConstant.VARCHAR)
	private String sku_kcdz;
	@Column(name = "gwch_id",type = MySqlTypeConstant.INT,length = 11)
	private int gwch_id;
	@Column(name = "flow_id",type = MySqlTypeConstant.INT,length = 11)
	private int flow_id;


}
