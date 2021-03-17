package com.alibaba.sentinel.provider.sentinelprovider.hanlder;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author honglei
 * @version 1.0
 * @date 2021/3/16 17:29
 * @desp
 */
public class DefaultBlockExceptionHandler implements BlockExceptionHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, BlockException e) throws Exception {
        // ... 省略其它代码

        PrintWriter out = response.getWriter();
        out.print("Blocked by Sentinel (flow limiting)");
    }

}