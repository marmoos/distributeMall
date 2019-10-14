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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_MALL_FLOW")
public class T_MALL_FLOW extends BaseModel {
	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "psfsh",type = MySqlTypeConstant.VARCHAR)
	private String psfsh;
	@Column(name = "psshj",type = MySqlTypeConstant.DATETIME)
	private Date psshj;
	@Column(name = "psmsh",type = MySqlTypeConstant.VARCHAR)
	private String psmsh;
	@Column(name = "yh_id",type = MySqlTypeConstant.INT,length = 11)
	private int yh_id;
	@Column(name = "dd_id",type = MySqlTypeConstant.INT,length = 11)
	private int dd_id;
	@Column(name = "mqdd",type = MySqlTypeConstant.VARCHAR)
	private String mqdd;
	@Column(name = "mdd",type = MySqlTypeConstant.VARCHAR)
	private String mdd;
	@Column(name = "ywy",type = MySqlTypeConstant.VARCHAR)
	private String ywy;
	@Column(name = "lxfsh",type = MySqlTypeConstant.VARCHAR)
	private String lxfsh;


}
