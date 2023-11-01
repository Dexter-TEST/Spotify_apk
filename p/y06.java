package p.y06;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.r44;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableEmitter;
import p.a16;
import p.z06;
import p.tb0;
import java.lang.Integer;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

public final class y06 implements ObservableOnSubscribe	// class@002d25 from classes.dex
{
    public final int a;
    public final r44 b;

    public void y06(r44 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void subscribe(ObservableEmitter p0){
       a16 uoa16;
       PlaybackStateCompat playbackStat;
       MediaMetadataCompat mediaMetadat;
       int i3;
       int i = -1;
       int i1 = 2;
       int i2 = 3;
       y06 tb = this.b;
       switch (this.a){
           case 0:
             uoa16 = new a16(p0, 0);
             tb.g(uoa16);
             p0.setCancellable(new z06(tb, uoa16, 1));
             if ((playbackStat = tb.c()) != null) {
                p0.onNext(playbackStat);
             }
             break;
           case 1:
             uoa16 = new a16(p0, 1);
             tb.g(uoa16);
             p0.setCancellable(new z06(tb, uoa16, 0));
             if ((mediaMetadat = tb.b()) != null) {
                p0.onNext(mediaMetadat);
             }
             return;
             break;
           case 2:
             uoa16 = new a16(p0, i2);
             tb.g(uoa16);
             p0.setCancellable(new z06(tb, uoa16, i1));
             if ((i3 = tb.d()) != i) {
                p0.onNext(Integer.valueOf(i3));
             }
             return;
             break;
           default:
             uoa16 = new a16(p0, i1);
             tb.g(uoa16);
             p0.setCancellable(new z06(tb, uoa16, i2));
             if ((i3 = tb.e()) != i) {
                p0.onNext(Integer.valueOf(i3));
             }
             return;
       }
       return;
    }
}
