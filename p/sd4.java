package p.sd4;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import p.ud4;
import java.io.File;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.lang.Class;
import p.ys5;
import com.google.common.collect.c;
import java.util.Collection;
import p.l32;
import java.lang.Long;
import p.hi6;
import java.lang.Throwable;

public final class sd4 implements SingleOnSubscribe	// class@002609 from classes.dex
{
    public final ud4 a;
    public final File b;

    public void sd4(ud4 p0,File p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void subscribe(SingleEmitter p0){
       sd4 tb = this.b;
       sd4 ta = this.a;
       try{
          ta.getClass();
          ta.c.getClass();
          p0.onSuccess(Long.valueOf(l32.c(c.r(tb))));
       }catch(java.lang.RuntimeException e0){
          p0.tryOnError(e0);
       }
       return;
    }
}
