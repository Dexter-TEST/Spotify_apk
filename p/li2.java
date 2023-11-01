package p.li2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class li2 extends Enum	// class@001d5b from classes.dex
{
    public static final li2 a;
    public static final li2 b;
    public static final li2 c;
    public static final li2 t;
    public static final li2 v;
    public static final li2 w;
    public static final li2 x;
    public static final li2[] y;

    static {
       li2 oli2 = new li2("GET_MEMOIZED_IS_INITIALIZED", 0);
       li2.a = oli2;
       li2 oli21 = new li2("SET_MEMOIZED_IS_INITIALIZED", 1);
       li2.b = oli21;
       li2 oli22 = new li2("BUILD_MESSAGE_INFO", 2);
       li2.c = oli22;
       li2 oli23 = new li2("NEW_MUTABLE_INSTANCE", 3);
       li2.t = oli23;
       li2 oli24 = new li2("NEW_BUILDER", 4);
       li2.v = oli24;
       li2 oli25 = new li2("GET_DEFAULT_INSTANCE", 5);
       li2.w = oli25;
       li2 oli26 = new li2("GET_PARSER", 6);
       li2.x = oli26;
       li2[] oli2Array = new li2[]{oli2,oli21,oli22,oli23,oli24,oli25,oli26};
       li2.y = oli2Array;
    }
    public void li2(String p0,int p1){
       super(p0, p1);
    }
    public static li2 valueOf(String p0){
       return Enum.valueOf(li2.class, p0);
    }
    public static li2[] values(){
       return li2.y.clone();
    }
}
