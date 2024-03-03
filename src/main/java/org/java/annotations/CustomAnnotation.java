package org.java.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.CLASS)/*In the compile Time */
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface CustomAnnotation {
}
