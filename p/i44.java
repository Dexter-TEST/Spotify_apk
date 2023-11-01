package p.i44;
import android.os.Handler;
import p.k44;
import android.os.Looper;
import android.os.Message;
import java.lang.Class;
import java.lang.Object;
import java.lang.Integer;
import p.a16;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.Boolean;
import android.os.Bundle;
import p.or7;
import java.lang.CharSequence;
import java.util.List;
import p.n44;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.String;

public final class i44 extends Handler	// class@001921 from classes.dex
{
    public boolean a;
    public final k44 b;

    public void i44(k44 p0,Looper p1){
       this.b = p0;
       super(p1);
       this.a = false;
    }
    public final void handleMessage(Message p0){
       a16 uoa16;
       if (this.a == null) {
          return;
       }
       i44 tb = this.b;
       switch (p0.what){
           case 1:
             or7.f(p0.getData());
             tb.getClass();
             break;
           case 2:
             p0 = p0.obj;
             switch (tb.d){
                 case 0:
                   if (p0 == null) {
                   }
                   break;
                 default:
             }
             tb.e.onNext(p0);
             break;
           case 3:
             p0 = p0.obj;
             switch (tb.d){
                 case 1:
                   if (p0 == null) {
                   }
                   break;
                 default:
             }
             tb.e.onNext(p0);
             break;
           case 4:
             tb.getClass();
             break;
           case 5:
             tb.getClass();
             break;
           case 6:
             tb.getClass();
             break;
           case 7:
             or7.f(p0.obj);
             tb.getClass();
             break;
           case 8:
             tb.getClass();
             break;
           case 9:
             uoa16 = p0.obj.intValue();
             switch (tb.d){
                 case 3:
                   if (uoa16 == -1) {
                   }
                   break;
                 default:
             }
             tb.e.onNext(Integer.valueOf(uoa16));
             break;
           case 11:
             p0.obj.booleanValue();
             tb.getClass();
             break;
           case 12:
             uoa16 = p0.obj.intValue();
             switch (tb.d){
                 case 2:
                   if (uoa16 == -1) {
                   }
                   break;
                 default:
             }
             tb.e.onNext(Integer.valueOf(uoa16));
             break;
           case 13:
             tb.getClass();
             break;
           default:
       }
       return;
    }
}
