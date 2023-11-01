package p.rv;
import java.lang.String;
import p.r45;
import android.view.View$OnClickListener;
import java.lang.Object;
import p.i77;
import java.lang.Integer;
import p.jj5;
import java.lang.StringBuilder;

public final class rv	// class@00256b from classes.dex
{
    public final String a;
    public final r45 b;
    public final String c;
    public final r45 d;
    public final View$OnClickListener e;

    public void rv(String p0,r45 p1,String p2,r45 p3,View$OnClickListener p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static i77 a(int p0){
       i77 oi77 = new i77(10);
       oi77.b = r45.d(Integer.valueOf(p0));
       oi77.a = "";
       return oi77;
    }
    public final boolean equals(Object p0){
       rv tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof rv) {
          return false;
       }
       if (this.a.equals(p0.a) && this.b.equals(p0.b)) {
          rv c = p0.c;
          if ((tc = this.c) == null) {
             if (c != null) {
             label_0048 :
                b = false;
             label_0049 :
                return b;
             }
          }else if(tc.equals(c)){
          }
          if (this.d.equals(p0.d)) {
             p0 = p0.e;
             if ((c = this.e) == null) {
                if (p0 == null) {
                   goto label_0049 ;
                }else {
                   goto label_0048 ;
                }
             }else if(c.equals(p0)){
                goto label_0049 ;
             }else {
                goto label_0048 ;
             }
          }else {
             goto label_0048 ;
          }
       }else {
          goto label_0048 ;
       }
    }
    public final int hashCode(){
       rv tc;
       int i = (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243;
       int i1 = ((tc = this.c) == null)? 0: tc.hashCode();
       i = (((i ^ i1) * 0xf4243) ^ this.d.hashCode()) * 0xf4243;
       i1 = ((tc = this.e) == null)? 0: tc.hashCode();
       return (((i ^ i1) * 0xf4243) ^ 0);
    }
    public final String toString(){
       return "SnackbarConfiguration{infoText="+this.a+", infoTextRes="+this.b+", actionText="+this.c+", actionTextRes="+this.d+", onClickListener="+this.e+", snackbarListener=null}";
    }
}
