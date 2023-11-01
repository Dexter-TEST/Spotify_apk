package p.m54;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import p.yo4;

public class m54	// class@001e2b from classes.dex
{
    public final String a;
    public final int b;
    public final int c;

    public void m54(String p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       m54 tb;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof m54) {
          return false;
       }
       m54 tc = this.c;
       m54 ta = this.a;
       if ((tb = this.b) >= null && p0.b >= null) {
          if (!TextUtils.equals(ta, p0.a) || (tb != p0.b || tc != p0.c)) {
             b = false;
          }
          return b;
       }else if(TextUtils.equals(ta, p0.a) && tc == p0.c){
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,Integer.valueOf(this.c)};
       return yo4.b(objArray);
    }
}
