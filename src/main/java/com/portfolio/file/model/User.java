package com.portfolio.file.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * usersテーブルのEntityクラス.
 */
@Getter
@Setter
@Entity
@Table(name="users")
public class User {

    /**
     * ユーザー名.
     * プライマリーキー.
     */
    @Id
    @Column(name = "username", length = 30, nullable = false)
    private String username;

    /** ユーザー名（表示名）. */
    @Column(name = "display_name", length = 60, nullable = false)
    private String displayName;
 
    /** パスワード. */
    @Column(name = "password", length = 255, nullable = false)
    private String password;

    /** ロール. */
    @Column(name = "role", length = 120, nullable = false)
    private String role;

    /** 有効フラグ. */
    @Column(name = "is_enabled", nullable = false)
    private boolean isEnabled;

}
