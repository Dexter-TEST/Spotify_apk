package p.jg5;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class jg5 extends Enum implements tb3	// class@001ad0 from classes.dex
{
    public final int a;
    public static final jg5 b;
    public static final jg5 c;
    public static final jg5 t;
    public static final jg5 v;
    public static final jg5 w;
    public static final jg5 x;
    public static final jg5 y;
    public static final jg5[] z;

    static {
       jg5 ojg5 = new jg5("ITEM_UNKNOWN", 0, 0);
       jg5.b = ojg5;
       jg5 ojg51 = new jg5("ITEM_ADDED_BY", 1, 1);
       jg5.c = ojg51;
       jg5 ojg52 = new jg5("ITEM_TIMESTAMP", 2, 2);
       jg5.t = ojg52;
       jg5 ojg53 = new jg5("ITEM_SEEN_AT", 3, 9);
       jg5.v = ojg53;
       jg5 ojg54 = new jg5("ITEM_PUBLIC", 4, 10);
       jg5.w = ojg54;
       jg5 ojg55 = new jg5("ITEM_FORMAT_ATTRIBUTES", 5, 11);
       jg5.x = ojg55;
       jg5 ojg56 = new jg5("ITEM_ID", 6, 12);
       jg5.y = ojg56;
       jg5[] ojg5Array = new jg5[]{ojg5,ojg51,ojg52,ojg53,ojg54,ojg55,ojg56};
       jg5.z = ojg5Array;
    }
    public void jg5(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static jg5 a(int p0){
       if (!p0) {
          return jg5.b;
       }
       if (p0 == 1) {
          return jg5.c;
       }
       if (p0 == 2) {
          return jg5.t;
       }
       switch (p0){
           case 9:
             return jg5.v;
           case 10:
             return jg5.w;
           case 11:
             return jg5.x;
           case 12:
             return jg5.y;
           default:
             return null;
       }
    }
    public static jg5 valueOf(String p0){
       return Enum.valueOf(jg5.class, p0);
    }
    public static jg5[] values(){
       return jg5.z.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
