package org.example.web.controller;


import org.example.web.common.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    /**
     * 返回代码
     *
     * @param context
     * @return
     */
    @GetMapping("/hello")
    public ApiResponse<String> example(String context) {
        ApiResponse<String> response = new ApiResponse<>();
        response.setCode(200);
        if (context == null) {
            response.setData("Hello World !");
        } else {
            response.setData("Hello World,this is http request context: " + context);
        }
        return response;
    }
}
