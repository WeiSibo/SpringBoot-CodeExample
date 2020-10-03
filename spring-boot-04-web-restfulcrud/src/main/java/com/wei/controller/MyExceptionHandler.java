package com.wei.controller;

import com.wei.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author abo
 * @date 2020/10/3 16:33
 * @remarks
 **/
@ControllerAdvice
public class MyExceptionHandler {
    //浏览器客户端返回的都是json
//    @ResponseBody
//    @ExceptionHandler(UserNotExistException.class)
//    public Map<String, Object> handleException(Exception e){
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("code","user.notExist");
//        map.put("message", e.getMessage());
//        return map;
//    }

    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        /*
        BasicErrorController里的errorHtml中的getStatus中的：
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        * */
        request.setAttribute("javax.servlet.error.status_code", 400);
        map.put("code", "user.notExist");
        map.put("message", e.getMessage());
        request.setAttribute("ext", map);
        //转发到/error
        return "forward:/error";
    }
}
