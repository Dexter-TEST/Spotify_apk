package p.jz3;
import p.wf2;
import p.gi3;
import com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import java.lang.Boolean;
import java.lang.Object;
import p.t00;
import p.hy3;
import p.jc7;

public final class jz3 extends gi3 implements wf2	// class@001b74 from classes.dex
{
    public final int a;
    public final LyricsWidgetPresenter b;

    public void jz3(LyricsWidgetPresenter p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final void a(){
       jz3 tb = this.b;
       switch (this.a){
           case 0:
             tb.N.onNext(Boolean.FALSE);
             return;
           case 1:
             tb.N.onNext(Boolean.TRUE);
             return;
           default:
             tb.a.b();
             return;
       }
    }
    public final Object invoke(){
       jc7 a = jc7.a;
       switch (this.a){
           case 0:
             this.a();
             return a;
           case 1:
             this.a();
             return a;
           default:
             this.a();
             return a;
       }
    }
}
