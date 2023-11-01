package p.v44;
import p.z44;
import p.p54;
import p.fn0;
import java.lang.String;
import java.lang.Object;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.r44;
import android.support.v4.media.MediaMetadataCompat;
import p.ox7;
import android.support.v4.media.RatingCompat;

public final class v44 extends z44	// class@00297d from classes.dex
{
    public final fn0 f;
    public final rf5 g;

    public void v44(p54 p0){
       super();
       this.f = new fn0();
       this.g = p0;
    }
    public final void b(String p0){
       r44 or44;
       v44 tg = this.g;
       v44 tf = this.f;
       if ("dismiss".equals(p0)) {
          tf.e();
          tf.c(tg.q().subscribe());
       }else if("favourite".equals(p0)){
          if ((or44 = tg.d()) == null) {
             return;
          }else {
             tf.e();
             tf.c(tg.n((ox7.v(or44.b()) ^ 0x01)).subscribe());
          }
       }
       return;
    }
    public final void d(){
       v44 tf = this.f;
       tf.e();
       tf.c(this.g.i().subscribe());
    }
    public final void e(){
       v44 tf = this.f;
       tf.e();
       tf.c(this.g.l().subscribe());
    }
    public final void f(long p0){
       v44 tf = this.f;
       tf.e();
       tf.c(this.g.m((int)p0).subscribe());
    }
    public final void g(RatingCompat p0){
       v44 tf = this.f;
       tf.e();
       tf.c(this.g.n(p0.c()).subscribe());
    }
    public final void h(){
       v44 tf = this.f;
       tf.e();
       tf.c(this.g.o().subscribe());
    }
    public final void i(){
       v44 tf = this.f;
       tf.e();
       tf.c(this.g.p().subscribe());
    }
    public final void j(){
       v44 tf = this.f;
       tf.e();
       tf.c(this.g.q().subscribe());
    }
}
