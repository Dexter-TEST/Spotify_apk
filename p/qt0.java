package p.qt0;
import p.wf2;
import p.gi3;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import p.ab7;
import java.lang.Class;
import java.lang.Object;
import p.n91;
import p.eb4;
import p.mb7;
import p.kb7;
import p.fb7;
import p.gb7;
import p.nb7;
import p.ds3;
import java.lang.String;
import p.co5;
import p.vx5;
import p.jc7;

public final class qt0 extends gi3 implements wf2	// class@00240b from classes.dex
{
    public final int a;
    public final ContextualAudioFragment b;

    public void qt0(ContextualAudioFragment p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final void a(){
       ContextualAudioFragment v;
       ab7 b;
       mb7 b1;
       void ovoid = null;
       String str = "logger";
       qt0 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             if ((v = tb.v) != null) {
                b = v.b;
                b.getClass();
                vx5 str2 = new vx5(b);
                b1 = new mb7();
                b1.c(str2.b);
                b1.b = str2.c.a;
                v.a.a(b1.a());
                return;
             }else {
                co5.N(str);
                throw ovoid;
             }
       }
       if ((v = tb.v) != null) {
          b = v.b;
          b.getClass();
          n91 str1 = new n91(b);
          b1 = new mb7();
          b1.c(str1.b);
          b1.b = str1.c.a;
          v.a.a(b1.a());
          return;
       }else {
          co5.N(str);
          throw ovoid;
       }
    }
    public final Object invoke(){
       ContextualAudioFragment b;
       jc7 a = jc7.a;
       switch (this.a){
           case 0:
             this.a();
             return a;
           case 1:
             this.a();
             return a;
           default:
             if ((b = this.b.b) != null) {
                return b;
             }
             co5.N("viewModelFactory");
             throw null;
       }
    }
}
