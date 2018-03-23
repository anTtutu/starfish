package priv.starfish.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = { ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Return {
	/**
	 * 泛型类型数组
	 */
	Class<?>[] xType() default {};

	String desc() default "";

	//
	Class<?> type() default Object.class;
}
