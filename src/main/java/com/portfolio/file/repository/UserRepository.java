package com.portfolio.file.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.portfolio.file.model.User;

/**
 * User(Entity)クラスのリポジトリクラス.
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	/**
	 * ユーザー名に紐付くUser(Entity)クラスの件数を取得.
	 *
	 * @param username ユーザー名
	 * @return 件数
	 */
	@Query("select count(e) from User e WHERE e.username = :username")
	long countByUsername(@Param("username") String username);

}
