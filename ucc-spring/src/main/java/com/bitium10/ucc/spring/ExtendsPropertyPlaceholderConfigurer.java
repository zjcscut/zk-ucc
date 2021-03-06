/**
 * Copyright (c) 2014, shouli1990@gmail.com|shouli1990@gmail.com. All rights reserved.
 *
 */
package com.bitium10.ucc.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

/**
 * <b>项目名</b>： ucc <br>
 * <b>包名称</b>： com.bitium10.ucc.spring <br>
 * <b>类名称</b>： ExtendsPropertyPlaceholderConfigurer <br>
 * <b>类描述</b>： <br>
 * <b>创建人</b>： <a href="mailto:shouli1990@gmail.com">李朋明</a> <br>
 * <b>修改人</b>： <br>
 * <b>创建时间</b>：2015/4/11 9:51<br>
 * <b>修改时间</b>： <br>
 * <b>修改备注</b>： <br>
 *
 * @version 1.0.0 <br>
 */
public class ExtendsPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
    private Properties props;

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props)
            throws BeansException {
        super.processProperties(beanFactory, props);
        this.props = props;
    }

    public Object getProperty(String key) {
        return props.get(key);
    }

    public void setProps(Properties props) {
        this.props = props;
    }
}
