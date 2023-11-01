package p.fg4;
import java.lang.Comparable;
import p.gg4;
import android.os.Bundle;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.os.BaseBundle;

public final class fg4 implements Comparable	// class@0015c1 from classes.dex
{
    public final gg4 a;
    public final Bundle b;
    public final boolean c;
    public final boolean t;
    public final int v;

    public void fg4(gg4 p0,Bundle p1,boolean p2,boolean p3,int p4){
       co5.o(p0, "destination");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final int a(fg4 p0){
       fg4 tc;
       int i1;
       co5.o(p0, "other");
       int i = 1;
       fg4 c = p0.c;
       if ((tc = this.c) != null && c == null) {
          return i;
       }
       if (tc == null && c != null) {
          return -1;
       }
       c = p0.b;
       if ((tc = this.b) != null && c == null) {
          return i;
       }
       if (tc == null && c != null) {
          return -1;
       }
       if (tc != null) {
          co5.i(c);
          if ((i1 = tc.size() - c.size()) > 0) {
             return i;
          }else if(i1 < 0){
             return -1;
          }
       }
       c = p0.t;
       if ((tc = this.t) != null && c == null) {
          return i;
       }else if(tc == null && c != null){
          return -1;
       }else {
          return (this.v - p0.v);
       }
    }
    public final int compareTo(Object p0){
       return this.a(p0);
    }
}
