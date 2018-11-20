package com.bootdo.clouddoadmin.rpc.impl;

import com.bootdo.clouddoadmin.rpc.TestRpc;
import org.springframework.stereotype.Service;

/**
 * @Auther: xinjl
 * @Date: 2018/11/19 20:50
 * @Description:
 */
@Service
public class TestRpcImpl implements TestRpc {

    @Override
    public String test() {
        return "test";
    }
}
