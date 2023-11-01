package p.rg5;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class rg5 extends Enum implements tb3	// class@0024e2 from classes.dex
{
    public final int a;
    public static final rg5 b;
    public static final rg5 c;
    public static final rg5 t;
    public static final rg5 v;
    public static final rg5 w;
    public static final rg5 x;
    public static final rg5[] y;

    static {
       rg5 org5 = new rg5("KIND_UNKNOWN", 0, 0);
       rg5.b = org5;
       rg5 org51 = new rg5("ADD", 1, 2);
       rg5.c = org51;
       rg5 org52 = new rg5("REM", 2, 3);
       rg5.t = org52;
       rg5 org53 = new rg5("MOV", 3, 4);
       rg5.v = org53;
       rg5 org54 = new rg5("UPDATE_ITEM_ATTRIBUTES", 4, 5);
       rg5.w = org54;
       rg5 org55 = new rg5("UPDATE_LIST_ATTRIBUTES", 5, 6);
       rg5.x = org55;
       rg5[] org5Array = new rg5[]{org5,org51,org52,org53,org54,org55};
       rg5.y = org5Array;
    }
    public void rg5(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static rg5 a(int p0){
       if (!p0) {
          return rg5.b;
       }
       if (p0 == 2) {
          return rg5.c;
       }
       if (p0 == 3) {
          return rg5.t;
       }
       if (p0 == 4) {
          return rg5.v;
       }
       if (p0 == 5) {
          return rg5.w;
       }
       if (p0 != 6) {
          return null;
       }
       return rg5.x;
    }
    public static rg5 valueOf(String p0){
       return Enum.valueOf(rg5.class, p0);
    }
    public static rg5[] values(){
       return rg5.y.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
