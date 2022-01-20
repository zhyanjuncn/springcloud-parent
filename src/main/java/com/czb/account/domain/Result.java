package com.czb.account.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * zyj
 * @param <T>
 */
@Data
@AllArgsConstructor
public class Result<T> {

    /**
     * 返回数据
     */
    private T data;

    /**
     * 信息
     */
    private String msg;

    /**
     * 状态码
     */
    private Integer code;

}
