package p.n14;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class n14 extends Enum	// class@001f49 from classes.dex
{
    public static final n14 a;
    public static final n14 b;
    public static final n14[] c;

    static {
       n14 on14 = new n14(27, "ALLOW_COERCION_OF_SCALARS", true);
       n14.a = on14;
       n14 on141 = on14;
       on14 = new n14(29, "IGNORE_MERGE_FOR_UNMERGEABLE", true);
       n14.b = on14;
       n14 on142 = on14;
       n14[] on14Array = new n14[32];
       on14Array[0] = new n14(0, "USE_ANNOTATIONS", true);
       on14Array[1] = new n14(true, "USE_GETTERS_AS_SETTERS", true);
       on14Array[2] = new n14(2, "PROPAGATE_TRANSIENT_MARKER", 0);
       on14Array[3] = new n14(3, "AUTO_DETECT_CREATORS", true);
       on14Array[4] = new n14(4, "AUTO_DETECT_FIELDS", true);
       on14Array[5] = new n14(5, "AUTO_DETECT_GETTERS", true);
       on14Array[6] = new n14(6, "AUTO_DETECT_IS_GETTERS", true);
       on14Array[7] = new n14(7, "AUTO_DETECT_SETTERS", true);
       on14Array[8] = new n14(8, "REQUIRE_SETTERS_FOR_GETTERS", 0);
       on14Array[9] = new n14(9, "ALLOW_FINAL_FIELDS_AS_MUTATORS", true);
       on14Array[10] = new n14(10, "INFER_PROPERTY_MUTATORS", true);
       on14Array[11] = new n14(11, "INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES", true);
       on14Array[12] = new n14(12, "ALLOW_VOID_VALUED_PROPERTIES", 0);
       on14Array[13] = new n14(13, "CAN_OVERRIDE_ACCESS_MODIFIERS", true);
       on14Array[14] = new n14(14, "OVERRIDE_PUBLIC_ACCESS_MODIFIERS", true);
       on14Array[15] = new n14(15, "USE_STATIC_TYPING", false);
       on14Array[16] = new n14(16, "USE_BASE_TYPE_AS_DEFAULT_IMPL", false);
       on14Array[17] = new n14(17, "INFER_BUILDER_TYPE_BINDINGS", true);
       on14Array[18] = new n14(18, "DEFAULT_VIEW_INCLUSION", true);
       on14Array[19] = new n14(19, "SORT_PROPERTIES_ALPHABETICALLY", false);
       on14Array[20] = new n14(20, "SORT_CREATOR_PROPERTIES_FIRST", true);
       on14Array[21] = new n14(21, "ACCEPT_CASE_INSENSITIVE_PROPERTIES", false);
       on14Array[22] = new n14(22, "ACCEPT_CASE_INSENSITIVE_ENUMS", false);
       on14Array[23] = new n14(23, "ACCEPT_CASE_INSENSITIVE_VALUES", false);
       on14Array[24] = new n14(24, "USE_WRAPPER_NAME_AS_PROPERTY_NAME", false);
       on14Array[25] = new n14(25, "USE_STD_BEAN_NAMING", false);
       on14Array[26] = new n14(26, "ALLOW_EXPLICIT_PROPERTY_RENAMING", false);
       on14Array[27] = on141;
       on14Array[28] = new n14(28, "IGNORE_DUPLICATE_MODULE_REGISTRATIONS", true);
       on14Array[29] = on142;
       on14Array[30] = new n14(30, "BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES", false);
       on14Array[31] = new n14(31, "APPLY_DEFAULT_VALUES", true);
       n14.c = on14Array;
    }
    public void n14(int p0,String p1,boolean p2){
       super(p1, p0);
       this.ordinal();
    }
    public static n14 valueOf(String p0){
       return Enum.valueOf(n14.class, p0);
    }
    public static n14[] values(){
       return n14.c.clone();
    }
}
