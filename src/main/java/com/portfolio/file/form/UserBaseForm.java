package com.portfolio.file.form;

import java.io.Serializable;
import java.util.Map;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.portfolio.file.util.EnabledItems;
import com.portfolio.file.util.RoleItems;

import lombok.Getter;
import lombok.Setter;

/**
 * ユーザーEntityクラスののFormクラス.
 */
@Getter
@Setter
public class UserBaseForm implements Serializable {

	/** シリアルバージョンUID. */
	private static final long serialVersionUID = 1L;

	@NotBlank
	@Size(max = 30)
	private String displayName;

	private String role;

	private boolean isEnabled;

	/**
	 * ロールの選択肢の定数を取得するメソッド.
	 * 
	 * @return 選択肢の定数
	 */
	public Map<String, String> getRoleItems() {
		return RoleItems.ROLEITEMS;
	}

	/**
	 * 有効/無効の選択肢の定数を取得するメソッド.
	 * 
	 * @return 選択肢の定数
	 */
	public Map<Boolean, String> getEnabledItems() {
		return EnabledItems.ENABLEDITEMS;
	}
}
