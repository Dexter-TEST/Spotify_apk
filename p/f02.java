package p.f02;
import p.js6;
import java.lang.Object;
import java.lang.Class;
import p.vf3;
import p.gb6;
import java.lang.String;
import p.wa6;
import java.lang.Enum;
import p.ne;

public final class f02 extends js6	// class@00152f from classes.dex
{
    public final int c;
    public final Serializable t;

    public void f02(){
       this.c = 0;
       super(Object.class);
       this.t = "Null key for a Map not allowed in JSON \(use a converting NullKeySerializer?\)";
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       f02 tt = this.t;
       switch (this.c){
           case 0:
           default:
             if (p2.w(wa6.w)) {
                p1.i0(p0.toString());
             }else if(p2.w(wa6.x)){
                p1.i0(String.valueOf(p0.ordinal()));
             }else {
                tt.getClass();
                p0.ordinal();
                throw null;
             }
             return;
       }
       p0 = new Object[0];
       p2.y(tt, p0);
       throw null;
    }
}
