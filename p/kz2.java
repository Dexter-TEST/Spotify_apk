package p.kz2;
import p.c03;
import java.lang.String;
import p.ju2;
import java.lang.Class;
import java.lang.Object;
import p.eo5;
import p.mi;
import p.fz2;
import p.au2;
import p.a03;
import java.lang.Integer;
import p.tu2;

public final class kz2 extends c03	// class@001caf from classes.dex
{

    public void kz2(){
       super("NORMAL", 4, "glue:row");
    }
    public final int e(ju2 p0){
       zz2 z;
       int i;
       p0.getClass();
       if (eo5.p(p0)) {
          if (mi.x(p0)) {
             if (p0.b().y("hubs:glue:muted", false)) {
                z = a03.z;
             }else {
                z = a03.y;
             }
          }else if(p0.b().d("row_number") != null){
             i = 1;
          }else {
             i = 0;
          }
          if (i) {
             if (p0.b().y("hubs:glue:muted", false)) {
                z = a03.C;
             }else {
                z = a03.B;
             }
          }else if(p0.b().y("hubs:glue:muted", false)){
             z = a03.A;
          }else {
             z = a03.x;
          }
       }else if(p0.y().e() != null){
          z = a03.b;
       }else if(mi.x(p0)){
          z = a03.t;
       }else {
          z = a03.c;
       }
       return z.a;
    }
}
