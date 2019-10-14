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
@Table(name = "T_MALL_ORDER")
public class T_MALL_ORDER extends BaseModel {

	@Index
	@Unique
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isAutoIncrement = true,isKey = true)
	private long id;
	@Column(name = "shhr",type = MySqlTypeConstant.VARCHAR)
	private String shhr;
	@Column(name = "zje",type = MySqlTypeConstant.DECIMAL,decimalLength = 8,length = 12)
	private BigDecimal zje;
	@Column(name = "jdh",type =MySqlTypeConstant.INT,length = 11)
	private int jdh;
	@Column(name="yh_id",type = MySqlTypeConstant.INT,length = 11)
	private int yh_id;
	@Column(name = "chjshj",type = MySqlTypeConstant.DATETIME)
	private Date chjshj;
	@Column(name = "yjsdshj",type = MySqlTypeConstant.DATETIME)
	private Date yjsdshj;
	@Column(name = "dzh_id",type = MySqlTypeConstant.INT,length = 11)
	private int dzh_id;
	@Column(name = "dzh_mch",type = MySqlTypeConstant.VARCHAR)
	private String dzh_mch;

}
