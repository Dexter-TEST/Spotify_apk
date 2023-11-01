package p.kh5;
import p.e2;
import p.wd5;
import p.p77;
import android.view.ViewGroup;
import p.uu2;
import p.ut2;
import p.jh5;
import android.view.View;
import p.et0;

public final class kh5 extends e2	// class@001c14 from classes.dex
{
    public final wd5 b;
    public final p77 c;

    public void kh5(wd5 p0,p77 p1){
       super(0);
       this.b = p0;
       this.c = p1;
    }
    public final ut2 e(ViewGroup p0,uu2 p1){
       return new jh5(et0.n(p0, R.layout.component_podcast_card_image, p0, false), this.b, this.c);
    }
}
