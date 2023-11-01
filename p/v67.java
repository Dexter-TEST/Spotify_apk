package p.v67;
import p.b5;
import java.lang.Object;
import p.ir0;
import io.reactivex.rxjava3.core.Notification;
import p.ew5;
import com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import java.lang.Boolean;
import p.t00;
import com.spotify.litelyrics.lyrics.views.TouchBlockingFrameLayout;
import io.reactivex.rxjava3.core.Observer;

public final class v67 implements b5	// class@002992 from classes.dex
{
    public final int a;
    public final Object b;

    public void v67(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void run(){
       v67 tb = this.b;
       switch (this.a){
           case 0:
             tb.a = false;
             return;
           case 1:
             tb.Q.onNext(Boolean.TRUE);
             return;
           case 2:
             tb.clear();
             return;
           case 3:
             tb.accept(Notification.b);
             return;
           default:
             tb.onComplete();
             return;
       }
    }
}
