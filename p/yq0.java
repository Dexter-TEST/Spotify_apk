package p.yq0;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;
import p.co5;
import java.lang.String;

public final class yq0	// class@002e07 from classes.dex
{
    public final Uri a;
    public final boolean b;

    public void yq0(Uri p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       yq0 oyq0 = yq0.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (!co5.c(oyq0, class)) {
          return false;
       }else {
          co5.j(p0, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
          if (!co5.c(this.a, p0.a)) {
             return false;
          }else if(this.b != p0.b){
             return false;
          }else {
             return true;
          }
       }
    }
    public final int hashCode(){
       int i = this.a.hashCode() * 31;
       int i1 = (this.b != null)? 1231: 1237;
       return (i + i1);
    }
}
