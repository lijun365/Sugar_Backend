package org.freefly.simplesugarmark.common;

import lombok.Data;

@Data
public class ResponseVO {
    private int code;
    private String desc;
    private Object obj;

    public ResponseVO(int code, String desc, Object obj) {
        this.code = code;
        this.desc = desc;
        this.obj = obj;
    }

    public ResponseVO() {
    }

    public static ResponseVO success(String desc) {
        return new ResponseVO(200,desc,null);
    }

    public static ResponseVO success(String desc,Object obj) {
        return new ResponseVO(200,desc,obj);
    }

    public static ResponseVO error(String desc) {
        return new ResponseVO(500,desc,null);
    }

    public static ResponseVO error(String desc, Object obj) {
        return new ResponseVO(500,desc,obj);
    }
}
