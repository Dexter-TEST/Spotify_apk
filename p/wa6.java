package p.wa6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class wa6 extends Enum	// class@002afc from classes.dex
{
    public static final wa6 a;
    public static final wa6 b;
    public static final wa6 c;
    public static final wa6 t;
    public static final wa6 v;
    public static final wa6 w;
    public static final wa6 x;
    public static final wa6 y;
    public static final wa6[] z;

    static {
       wa6 owa6 = new wa6(0, "WRAP_ROOT_VALUE", 0);
       wa6.a = owa6;
       wa6 owa61 = new wa6(2, "FAIL_ON_EMPTY_BEANS", 1);
       wa6.b = owa61;
       wa6 owa62 = new wa6(7, "CLOSE_CLOSEABLE", 0);
       wa6.c = owa62;
       wa6 owa63 = new wa6(9, "WRITE_DATES_AS_TIMESTAMPS", 1);
       wa6.t = owa63;
       wa6 owa64 = new wa6(14, "WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS", false);
       wa6.v = owa64;
       wa6 owa65 = owa64;
       wa6 owa66 = new wa6(15, "WRITE_ENUMS_USING_TO_STRING", false);
       wa6.w = owa66;
       wa6 owa67 = owa66;
       owa66 = new wa6(17, "WRITE_ENUM_KEYS_USING_INDEX", false);
       wa6.x = owa66;
       wa6 owa68 = owa66;
       owa64 = new wa6(24, "EAGER_SERIALIZER_FETCH", true);
       wa6.y = owa64;
       wa6 owa69 = owa64;
       wa6[] owa6Array = new wa6[26];
       owa6Array[0] = owa6;
       owa6Array[1] = new wa6(1, "INDENT_OUTPUT", 0);
       owa6Array[2] = owa61;
       owa6Array[3] = new wa6(3, "FAIL_ON_SELF_REFERENCES", 1);
       owa6Array[4] = new wa6(4, "WRAP_EXCEPTIONS", 1);
       owa6Array[5] = new wa6(5, "FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS", 1);
       owa6Array[6] = new wa6(6, "WRITE_SELF_REFERENCES_AS_NULL", 0);
       owa6Array[7] = owa62;
       owa6Array[8] = new wa6(8, "FLUSH_AFTER_WRITE_VALUE", 1);
       owa6Array[9] = owa63;
       owa6Array[10] = new wa6(10, "WRITE_DATE_KEYS_AS_TIMESTAMPS", 0);
       owa6Array[11] = new wa6(11, "WRITE_DATES_WITH_ZONE_ID", 0);
       owa6Array[12] = new wa6(12, "WRITE_DATES_WITH_CONTEXT_TIME_ZONE", 1);
       owa6Array[13] = new wa6(13, "WRITE_DURATIONS_AS_TIMESTAMPS", 1);
       owa6Array[14] = owa65;
       owa6Array[15] = owa67;
       owa6Array[16] = new wa6(16, "WRITE_ENUMS_USING_INDEX", false);
       owa6Array[17] = owa68;
       owa6Array[18] = new wa6(18, "WRITE_NULL_MAP_VALUES", true);
       owa6Array[19] = new wa6(19, "WRITE_EMPTY_JSON_ARRAYS", true);
       owa6Array[20] = new wa6(20, "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", false);
       owa6Array[21] = new wa6(21, "WRITE_BIGDECIMAL_AS_PLAIN", false);
       owa6Array[22] = new wa6(22, "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", true);
       owa6Array[23] = new wa6(23, "ORDER_MAP_ENTRIES_BY_KEYS", false);
       owa6Array[24] = owa69;
       owa6Array[25] = new wa6(25, "USE_EQUALITY_FOR_OBJECT_ID", false);
       wa6.z = owa6Array;
    }
    public void wa6(int p0,String p1,boolean p2){
       super(p1, p0);
       this.ordinal();
    }
    public static wa6 valueOf(String p0){
       return Enum.valueOf(wa6.class, p0);
    }
    public static wa6[] values(){
       return wa6.z.clone();
    }
}
