package com.portfolio.file.form.sub;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.portfolio.file.form.UserBaseForm;
import com.portfolio.file.model.User;

import lombok.Getter;
import lombok.Setter;

/**
 * ユーザー編集画面のFormクラス.
 */
@Getter
@Setter
public class UserUpdateForm extends UserBaseForm {

	/** シリアルバージョンUID. */
	private static final long serialVersionUID = 1L;

	/** 正規表現(半角英数字). */
	private static final String ALPHANUMERIC_REGEXP = "[a-zA-Z0-9.]*";

	/** 正規表現(半角英数字)のエラーメッセージ. */
	private static final String ALPHANUMERIC_MESSAGE = "半角英字、数字、ピリオドを使用できます";

	@Size(max = 30)
	@Pattern(regexp = ALPHANUMERIC_REGEXP, message = ALPHANUMERIC_MESSAGE)
	private String username;

	@Size(max = 255)
	@Pattern(regexp = ALPHANUMERIC_REGEXP, message = ALPHANUMERIC_MESSAGE)
	private String password;

	/**
	 * コンストラクタ.
	 */
	public UserUpdateForm() {

	}

	/**
	 * コンストラクタ.
	 * 
	 * @param user User(Entityクラス)
	 */
	public UserUpdateForm(User user) {
		this.setUsername(user.getUsername());
		super.setDisplayName(user.getDisplayName());
		this.setPassword("");
		super.setRole(user.getRole());
		this.setEnabled(user.isEnabled());
	}

	/**
	 * Formクラスの設定内容を文字列で出力する.
	 */
	public String toString() {
		return "User(userame: " + this.getUsername() + ", displayName: " + super.getDisplayName() + ", password: "
				+ this.getPassword() + ", role: " + super.getRole() + ", isEnabled: " + super.isEnabled() + ")";
	}

	/**
	 * Formの設定内容をUser Entityクラスに変換する.
	 *
	 * @return ユーザー情報(Entityクラス)
	 */
	public User toEntity() {

		User user = new User();
		user.setUsername(this.getUsername());
		user.setDisplayName(super.getDisplayName());
		user.setPassword(this.getPassword());
		user.setRole(super.getRole());
		user.setEnabled(super.isEnabled());

		return user;
	}
}
