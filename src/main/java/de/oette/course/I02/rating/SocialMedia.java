package de.oette.course.I02.rating;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {
        ElementType.TYPE,
        ElementType.PARAMETER,
        ElementType.FIELD,
        ElementType.METHOD
})
@Qualifier("SocialMedia")
public @interface SocialMedia {
}
