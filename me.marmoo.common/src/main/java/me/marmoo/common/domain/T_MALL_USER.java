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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_MALL_USER")
public class T_MALL_USER extends BaseModel {

	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "yh_mch",type = MySqlTypeConstant.VARCHAR)
	private String yh_mch;
	@Column(name = "yh_nch",type = MySqlTypeConstant.VARCHAR)
	private String yh_nch;
	@Column(name = "yh_mm",type = MySqlTypeConstant.VARCHAR)
	private String yh_mm;
	@Column(name = "yh_xm",type = MySqlTypeConstant.VARCHAR)
	private String yh_xm;
	@Column(name = "yh_shjh",type = MySqlTypeConstant.VARCHAR)
	private String yh_shjh;
	@Column(name = "yh_yx",type = MySqlTypeConstant.VARCHAR)
	private String yh_yx;
	@Column(name = "yh_tx",type = MySqlTypeConstant.VARCHAR)
	private String yh_tx;


}
