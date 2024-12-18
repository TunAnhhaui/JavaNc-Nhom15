package com.javancnhom15.JavaNcNhom15.controller.api;

import com.javancnhom15.JavaNcNhom15.dto.LoginDTO;
import com.javancnhom15.JavaNcNhom15.dto.ResponseDTO;
import com.javancnhom15.JavaNcNhom15.service.UserService;
import com.javancnhom15.JavaNcNhom15.utilities.SessionUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseDTO login(@RequestBody LoginDTO info) {
        if(this.userService.adminLogin(info)) {
            return new ResponseDTO("Thành công", SessionUtilities.getAdmin());
        }
        return new ResponseDTO("Thông tin đăng nhập không hợp lệ", null);
    }

    @GetMapping("/logout")
    public ResponseDTO logout() {
        this.userService.adminLogout();
        return new ResponseDTO("Đăng xuất thành công",null);
    }

}
