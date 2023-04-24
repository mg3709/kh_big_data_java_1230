package com.kh.mini_sample.controller;


import com.kh.mini_sample.dao.MemberDAO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MemberController {
    // POST : 로그인
    @PostMapping("login")
    public ResponseEntity<Boolean> memberLogin(@RequestBody Map<String, String> loginData){
        String id = loginData.get("id");
        String pwd = loginData.get("pwd");

        //DB
        MemberDAO dao = new MemberDAO();
        boolean result = dao.loginCheck(id, pwd);


        //frontend
        System.out.println("ID : " + id);
        System.out.println("PWD : " + pwd);

        return new ResponseEntity<>(result, HttpStatus.OK);

    }
}
