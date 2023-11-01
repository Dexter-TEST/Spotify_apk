package p.of3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class of3 extends Enum	// class@00210c from classes.dex
{
    public static final of3[] a;

    static {
       of3[] oof3Array = new of3[]{new of3("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0),new of3("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 1),new of3("ACCEPT_CASE_INSENSITIVE_VALUES", 2),new of3("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 3),new of3("WRITE_DATES_WITH_ZONE_ID", 4),new of3("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 5),new of3("WRITE_SORTED_MAP_ENTRIES", 6),new of3("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 7)};
       of3.a = oof3Array;
    }
    public void of3(String p0,int p1){
       super(p0, p1);
    }
    public static of3 valueOf(String p0){
       return Enum.valueOf(of3.class, p0);
    }
    public static of3[] values(){
       return of3.a.clone();
    }
}
