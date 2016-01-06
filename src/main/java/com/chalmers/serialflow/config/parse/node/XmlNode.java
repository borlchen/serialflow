/**
 * chalmers.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.chalmers.serialflow.config.parse.node;

/**
 * abstract achieve the xml config node
 * @author chalmers
 * @version $Id: XmlNode.java, v 0.1 2016-1-6 下午11:57:12 chalmers Exp $
 */
public abstract class XmlNode {
    /**  describe the role of this node*/
    protected String desc;

    /**
     * Getter method for property <tt>desc</tt>.
     * 
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     * 
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
