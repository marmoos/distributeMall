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
@Table(name = "T_MALL_VALUE")
public class T_MALL_VALUE extends BaseModel {

	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "shxzh",type = MySqlTypeConstant.VARCHAR)
	private String shxzh;
	@Column(name = "shfqy",type = MySqlTypeConstant.VARCHAR)
	private String shfqy;
	@Column(name = "shxm_id",type = MySqlTypeConstant.INT,length = 11)
	private int shxm_id;
	@Column(name = "shxzh_mch",type = MySqlTypeConstant.VARCHAR)
	private String shxzh_mch;
	@Column(name = "chjshj",type = MySqlTypeConstant.DATETIME)
	private Date chjshj;


}
