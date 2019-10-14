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
@Table(name = "T_MALL_PRODUCT")
public class T_MALL_PRODUCT extends BaseModel {

	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "shp_mch",type = MySqlTypeConstant.VARCHAR)
	private String shp_mch;
	@Column(name="shp_tp",type = MySqlTypeConstant.VARCHAR)
	private String shp_tp;
	@Column(name = "flbh1",type = MySqlTypeConstant.INT,length = 11)
	private int flbh1;
	@Column(name = "flbh2",type = MySqlTypeConstant.INT,length = 11)
	private int flbh2;
	@Column(name = "pp_id",type = MySqlTypeConstant.INT,length = 11)
	private int pp_id;
	@Column(name = "chjshj",type = MySqlTypeConstant.DATETIME)
	private Date chjshj;
	@Column(name="shp_msh",type = MySqlTypeConstant.VARCHAR)
	private String shp_msh;

}
