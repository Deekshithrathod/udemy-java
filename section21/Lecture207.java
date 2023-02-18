package section21;

//@Override
//@Depricated
//@FuntionalInterface
//@SupressWarnings
//@SafeVarArgs

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(value = {ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.MODULE, ElementType.PACKAGE})
//@Retention(value = RetentionPolicy.SOURCE)
@interface MyAnno{
    String name();
}

//@MyAnno(name = "dexter")
public class Lecture207 {
    @MyAnno(name = "dexter")
    int superNumber = 1083;
    @MyAnno(name = "dexter")
    public static void main(String[] args) {
        @MyAnno(name = "dexter")
        int var = 10;

    }
}
