package p.v91;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class v91 extends Enum	// class@0029a7 from classes.dex
{
    public final int a;
    public static final v91 A;
    public static final v91 B;
    public static final v91 C;
    public static final v91 D;
    public static final v91[] E;
    public static final v91 b;
    public static final v91 c;
    public static final v91 t;
    public static final v91 v;
    public static final v91 w;
    public static final v91 x;
    public static final v91 y;
    public static final v91 z;

    static {
       v91 ov91 = new v91(0, "USE_BIG_DECIMAL_FOR_FLOATS", 0);
       v91.b = ov91;
       v91 ov911 = new v91(1, "USE_BIG_INTEGER_FOR_INTS", 0);
       v91.c = ov911;
       v91 ov912 = new v91(2, "USE_LONG_FOR_INTS", 0);
       v91.t = ov912;
       v91 ov913 = new v91(4, "FAIL_ON_UNKNOWN_PROPERTIES", 1);
       v91.v = ov913;
       v91 ov914 = new v91(5, "FAIL_ON_NULL_FOR_PRIMITIVES", 0);
       v91.w = ov914;
       v91 ov915 = new v91(6, "FAIL_ON_NUMBERS_FOR_ENUMS", 0);
       v91.x = ov915;
       v91 ov916 = new v91(14, "FAIL_ON_TRAILING_TOKENS", false);
       v91.y = ov916;
       v91 ov917 = ov916;
       v91 ov918 = new v91(17, "UNWRAP_SINGLE_VALUE_ARRAYS", false);
       v91.z = ov918;
       v91 ov919 = ov918;
       ov918 = new v91(19, "ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", false);
       v91.A = ov918;
       v91 ov9110 = ov918;
       ov916 = new v91(20, "ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT", false);
       v91.B = ov916;
       v91 ov9111 = ov916;
       v91 ov9112 = new v91(21, "ACCEPT_FLOAT_AS_INT", true);
       v91.C = ov9112;
       v91 ov9113 = ov9112;
       ov9112 = new v91(27, "EAGER_DESERIALIZER_FETCH", true);
       v91.D = ov9112;
       v91[] ov91Array = new v91[28];
       ov91Array[0] = ov91;
       ov91Array[1] = ov911;
       ov91Array[2] = ov912;
       ov91Array[3] = new v91(3, "USE_JAVA_ARRAY_FOR_JSON_ARRAY", 0);
       ov91Array[4] = ov913;
       ov91Array[5] = ov914;
       ov91Array[6] = ov915;
       ov91Array[7] = new v91(7, "FAIL_ON_INVALID_SUBTYPE", 1);
       ov91Array[8] = new v91(8, "FAIL_ON_READING_DUP_TREE_KEY", 0);
       ov91Array[9] = new v91(9, "FAIL_ON_IGNORED_PROPERTIES", 0);
       ov91Array[10] = new v91(10, "FAIL_ON_UNRESOLVED_OBJECT_IDS", 1);
       ov91Array[11] = new v91(11, "FAIL_ON_MISSING_CREATOR_PROPERTIES", 0);
       ov91Array[12] = new v91(12, "FAIL_ON_NULL_CREATOR_PROPERTIES", 0);
       ov91Array[13] = new v91(13, "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY", true);
       ov91Array[14] = ov917;
       ov91Array[15] = new v91(15, "WRAP_EXCEPTIONS", true);
       ov91Array[16] = new v91(16, "ACCEPT_SINGLE_VALUE_AS_ARRAY", false);
       ov91Array[17] = ov919;
       ov91Array[18] = new v91(18, "UNWRAP_ROOT_VALUE", false);
       ov91Array[19] = ov9110;
       ov91Array[20] = ov9111;
       ov91Array[21] = ov9113;
       ov91Array[22] = new v91(22, "READ_ENUMS_USING_TO_STRING", false);
       ov91Array[23] = new v91(23, "READ_UNKNOWN_ENUM_VALUES_AS_NULL", false);
       ov91Array[24] = new v91(24, "READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE", false);
       ov91Array[25] = new v91(25, "READ_DATE_TIMESTAMPS_AS_NANOSECONDS", true);
       ov91Array[26] = new v91(26, "ADJUST_DATES_TO_CONTEXT_TIME_ZONE", true);
       ov91Array[27] = ov9112;
       v91.E = ov91Array;
    }
    public void v91(int p0,String p1,boolean p2){
       super(p1, p0);
       this.a = 1 << this.ordinal();
    }
    public static v91 valueOf(String p0){
       return Enum.valueOf(v91.class, p0);
    }
    public static v91[] values(){
       return v91.E.clone();
    }
}
