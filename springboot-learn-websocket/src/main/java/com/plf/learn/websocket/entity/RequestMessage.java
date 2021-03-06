package com.plf.learn.websocket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 请求的消息类
 * @author Panlf
 * @date 2020/3/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestMessage {
    private String name;
}
