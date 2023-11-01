package p.n7;
import java.lang.Object;
import java.lang.Math;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public final class n7	// class@001f84 from classes.dex
{
    public int a;
    public int b;
    public Object c;
    public int d;

    public void n7(Object p0,int p1,int p2,int p3){
       super();
       this.a = p1;
       this.b = p2;
       this.d = p3;
       this.c = p0;
    }
    public final boolean equals(Object p0){
       n7 ta;
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof n7) {
          return false;
       }
       if ((ta = this.a) != p0.a) {
          return false;
       }
       if (ta == 8 && (Math.abs((this.d - this.b)) == 1 && (this.d == p0.b && this.b == p0.d))) {
          return true;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if ((ta = this.c) != null) {
          if (!ta.equals(p0.c)) {
             return false;
          }
       }else if(p0.c != null){
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((((this.a * 31) + this.b) * 31) + this.d);
    }
    public final String toString(){
       n7 ta;
       String str1;
       StringBuilder str = Integer.toHexString(System.identityHashCode(this))+"[";
       if ((ta = this.a) != 1) {
          if (ta != 2) {
             if (ta != 4) {
                str1 = (ta != 8)? "??": "mv";
             }else {
                str1 = "up";
             }
          }else {
             str1 = "rm";
          }
       }else {
          str1 = "add";
       }
       return str+str1+",s:"+this.b+"c:"+this.d+",p:"+this.c+"]";
    }
}
