/*
 *
 *  * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 *
 */
package com.jiaotou.pay.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * table 注解
 * 
 * @author jiaotou<jiaotou@dfire.com>
 * @date 2016年12月21日
 */
@Target(ElementType.TYPE)
public @interface Table {

	/**
	 * 
	 * 数据表名称注解，默认值为类名称
	 * 
	 * @return
	 */
	public String tableName() default "className";
}
