package p.c2;
import p.aw6;
import android.view.View;
import java.lang.Object;
import android.content.Context;
import android.graphics.drawable.Drawable;
import p.eb3;
import com.spotify.hubs.liteintegration.util.LiteImageUtil;

public final class c2 implements aw6	// class@001187 from classes.dex
{
    public final int a;
    public final View b;

    public void c2(View p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       c2 tb = this.b;
       switch (this.a){
           case 0:
             return LiteImageUtil.getPauseIcon(tb.getContext());
           case 1:
             return LiteImageUtil.getPlayIcon(tb.getContext());
           case 2:
             return eb3.m(tb.getContext(), R.drawable.ic_started_listening);
           default:
             return eb3.m(tb.getContext(), R.drawable.ic_fully_played);
       }
    }
}
