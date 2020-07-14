package com.github.tinyurl.service.impl;

import com.github.tinyurl.service.UidGenerator;

import java.util.UUID;

/**
 * Java UUID生成器
 * @author errorfatal89@gmail.com
 */
public class UUIDGenerator implements UidGenerator {
    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}