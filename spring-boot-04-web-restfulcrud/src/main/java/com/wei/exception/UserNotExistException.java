package com.wei.exception;

/**
 * @author abo
 * @date 2020/10/3 16:21
 * @remarks
 **/
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在");
    }
}
