package p.yy;
import p.xy;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import p.sj5;
import com.spotify.search.view.BackKeyEditText;

public abstract class yy	// class@002e54 from classes.dex
{
    public final CopyOnWriteArraySet a;
    public e76 b;
    public final sj5 c;

    static {
       xy oxy = new xy();
    }
    public void yy(){
       super();
       this.a = new CopyOnWriteArraySet();
       this.c = new sj5(1, this);
    }
    public abstract BackKeyEditText a();
}
