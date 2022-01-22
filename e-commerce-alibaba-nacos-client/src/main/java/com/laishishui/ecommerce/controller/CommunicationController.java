package com.laishishui.ecommerce.controller;

import com.laishihui.ecommerce.vo.JwtToken;
import com.laishihui.ecommerce.vo.UsernameAndPassword;
import com.laishishui.ecommerce.service.communication.UseRestTemplateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1>微服务通信Controller</h1>
 * @author tachai on 2022/1/22 10:52 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
@RestController
@RequestMapping("/communication")
public class CommunicationController {

    private final UseRestTemplateService useRestTemplateService;

    public CommunicationController(UseRestTemplateService useRestTemplateService) {
        this.useRestTemplateService = useRestTemplateService;
    }

    @PostMapping("/rest-template")
    public JwtToken getTokenFromAuthorityService(@RequestBody UsernameAndPassword usernameAndPassword){
        return useRestTemplateService.getTokenFromAuthorityService(usernameAndPassword);
    }


    @PostMapping("/rest-template-load-balance")
    public JwtToken getTokenFromAuthorityServiceWithLoadBalance(@RequestBody UsernameAndPassword usernameAndPassword){
        return useRestTemplateService.getTokenFromAuthorityServiceWithLoadBalance(usernameAndPassword);
    }
}
