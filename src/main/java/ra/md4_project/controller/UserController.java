package ra.md4_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.md4_project.security.principle.UserDetailsCustom;
import ra.md4_project.service.shoppingCartService.IShopPingCartService;

@Controller
@RequestMapping("/md4_project.com/v1/user")
public class UserController {
    @Autowired
    private IShopPingCartService iShopPingCartService;

    @GetMapping
    private ResponseEntity<?>getCartList(@AuthenticationPrincipal UserDetailsCustom userDetailsCustom){


    }


}
