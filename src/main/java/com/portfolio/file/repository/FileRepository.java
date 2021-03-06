package com.portfolio.file.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.file.model.File;

/**
 * File(Entity)クラスのリポジトリクラス.
 */
@Repository
public interface FileRepository extends JpaRepository<File, String> {

	Page<File> findAll(Pageable pageable);

	/**
	 * IDに紐付くFile(Entity)クラスを取得.
	 *
	 * @param id ファイルID
	 * @return 取得したデータが格納されたFile(Entity)クラス
	 */
	@Query("SELECT f FROM File f INNER JOIN f.createUser INNER JOIN f.updateUser WHERE f.id = :id")
	File getOne(@Param("id") int id);

	/**
	 * ファイルIDに紐付くFile(Entity)クラスを削除.
	 *
	 * @param id ファイルID
	 */
	@Query("DELETE FROM File f WHERE f.id = :id")
	@Transactional
	@Modifying
	void deleteById(@Param("id") int id);
}
