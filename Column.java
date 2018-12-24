/*
 *
 *  * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 *
 */
package com.jiaotou.pay.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 列注解
 * 
 * @author jiaotou<jiaotou@dfire.com>
 * @date 2016年12月21日
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {

	public String name() default "fieldName";

	public String setFuncName() default "setField";

	public String getFuncName() default "getField";

	public boolean defaultDBValue() default false;
}
