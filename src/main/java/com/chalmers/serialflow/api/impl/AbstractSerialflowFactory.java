/**
 * chalmers.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.chalmers.serialflow.api.impl;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;

import com.chalmers.serialflow.api.SerialflowFactory;

/**
 * 
 * @author chalmers
 * @version $Id: AbstractSerialflowFactory.java, v 0.1 2016-1-6 上午12:28:22 chalmers Exp $
 */
public abstract class AbstractSerialflowFactory implements SerialflowFactory, InitializingBean {
    /**
     * 
     * @return
     */
    public abstract List<InputStream> achieveConfigFileStreams();

    /** 
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
    }
}
