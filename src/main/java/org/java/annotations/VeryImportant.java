package org.java.annotations;

import java.lang.annotation.*;

/*To build annotation, we need to Annotation @Target and @Retention */
@Retention(RetentionPolicy.RUNTIME)/*we specified if Annotation is Runtime Annotation or befo re Compel Time [SOURCE]  */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})/*Annotation For Classes  */
public @interface VeryImportant {

}
