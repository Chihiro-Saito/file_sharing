package com.portfolio.file.service;

import java.util.List;

import com.portfolio.file.model.User;

/**
 * UserEntityクラスを操作するServiceクラスのインターフェース.
 */
public interface UserService {

	/**
	 * User(Entity)クラスのデータを全件取得する.
	 *
	 * @return usersテーブルの全件データ
	 */
	public List<User> findAll();

	/**
	 * ユーザー名に紐付くUser(Entity)クラスのデータを1件取得する.
	 *
	 * @param username ユーザー名
	 * @return 該当した1件のデータ
	 */
	public User findOne(String username);

	/**
	 * User(Entity)クラスのデータを保存する.
	 *
	 * @param user　User(Entity)クラス
	 * @return 保存したUser(Entity)クラス
	 */
	public User save(User user);

	/**
	 * ユーザー名に紐付くUser(Entity)クラスの件数を取得する.
	 *
	 * @param username ユーザー名
	 * @return 件数
	 */
	public long countByUsername(String username);
}
