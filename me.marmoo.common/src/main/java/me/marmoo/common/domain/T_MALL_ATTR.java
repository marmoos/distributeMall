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
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_MALL_ATTR")
public class T_MALL_ATTR extends BaseModel {

	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "shxm_mch",type = MySqlTypeConstant.VARCHAR,length = 255)
	private String shxm_mch;
	@Column(name = "shfqy",type = MySqlTypeConstant.VARCHAR,length = 255)
	private String shfqy;
	@Column(name = "flbh2",type = MySqlTypeConstant.INT,length = 11)
	private int flbh2;
	@Column(name = "chjshj",type = MySqlTypeConstant.DATETIME)
	private Date chjshj;



}
