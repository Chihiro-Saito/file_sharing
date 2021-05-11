package com.portfolio.file.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ログイン処理のControllerクラス.
 */
@Controller
@RequestMapping("/file")
public class LoginController {

    /**
     * ログイン画面のTemplateHTMLのパス.
     */
    private final String LOGIN_TEMPLATE_PATH = "file/common/login";

    /**
     * Redirect用HOME画面パス.
     */
    private final String REDIRECT_HOME_URL = "redirect:/file/home";

    /**
     * ログイン画面を表示.
     * Getメソッドのみ許可.
     *
     * @return ログイン画面のHTMLのパス
     */
    @GetMapping("login")
    public String login(){
    	return LOGIN_TEMPLATE_PATH;
    }

    /**
     * ログインに成功した時の処理.
     *
     * @return 遷移先
     */
    @PostMapping("success")
    public String loginSuccess() {

        // HOME画面に遷移する
        return REDIRECT_HOME_URL;
    }

}
