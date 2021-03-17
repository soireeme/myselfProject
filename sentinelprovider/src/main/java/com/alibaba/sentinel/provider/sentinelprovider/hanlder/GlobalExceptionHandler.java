package com.alibaba.sentinel.provider.sentinelprovider.hanlder;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author honglei
 * @version 1.0
 * @date 2021/3/16 17:12
 * @desp
 */
@Component
@ControllerAdvice(basePackages = "com.alibaba.sentinel.provider.sentinelprovider")
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(value = BlockException.class) // 因为这里是示例，所以暂时使用 JSONObject，实际项目最终定义一个 CommonResult。
    public JSONObject blockExceptionHandler(DefaultBlockExceptionHandler blockException) {
        return new JSONObject().fluentPut("code", 1024)
                .fluentPut("msg", "请求被拦截，拦截类型为 " + blockException.getClass().getSimpleName());
    }



}
