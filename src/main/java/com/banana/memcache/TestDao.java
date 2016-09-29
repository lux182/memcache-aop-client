package com.banana.memcache;

import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughSingleCache;
import org.springframework.stereotype.Component;

/**
 * Created by qiqiang on 2014/12/22.
 */
@Component
public class TestDao {
    @ReadThroughSingleCache(namespace = "test", expiration = 30000)
    public long getUserById(@ParameterValueKeyProvider long id) throws Exception {
        System.out.println("没有缓存命中");
        return id;
    }
}
