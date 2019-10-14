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
@Table(name = "T_MALL_ADDRESS")
public class T_MALL_ADDRESS extends BaseModel {

	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "yh_dz",type = MySqlTypeConstant.VARCHAR,length = 255)
	private String yh_dz;
	@Column(name = "dzzt",type = MySqlTypeConstant.VARCHAR,length = 255)
	private String dzzt;
	@Column(name="yh_id",type = MySqlTypeConstant.INT,length = 11)
	private int yh_id;
	@Column(name = "shjr",type = MySqlTypeConstant.VARCHAR,length = 255)
	private String shjr;
	@Column(name="lxfsh",type = MySqlTypeConstant.VARCHAR,length = 255)
	private String lxfsh;



}
