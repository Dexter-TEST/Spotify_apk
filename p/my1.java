package p.my1;
import p.s12;
import p.ci5;
import java.lang.String;
import java.lang.Object;
import p.so1;
import p.b17;
import com.spotify.metadata.proto.Metadata$Track;
import p.p94;

public final class my1 implements s12, ci5	// class@001f2a from classes.dex
{
    public final String a;

    public void my1(String p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0){
       try{
          my1 ta = this.a;
          if (p0) {
             so1 oso1 = new so1(ta);
             ta = (oso1.b != null && oso1.c != null)? 1: 0;
             if (ta) {
                b17.E(oso1.a, oso1.toString());
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final boolean apply(Object p0){
       boolean b;
       if (p0 != null) {
          if (p94.c(p0, this.a)) {
             b = true;
          label_0011 :
             return b;
          }
       }else {
          p0 = p94.a;
       }
       b = false;
       goto label_0011 ;
    }
}
