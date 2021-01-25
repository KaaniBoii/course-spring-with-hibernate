package de.oette.course.F04;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
@Import(value = SimpleConfiguration.class)
public @interface MySimpleConfiguration {
}
