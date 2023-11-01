package p.m8;
import android.widget.AbsListView$OnScrollListener;
import android.view.View;
import java.lang.Object;
import android.widget.AbsListView;
import p.q8;

public final class m8 implements AbsListView$OnScrollListener	// class@001e49 from classes.dex
{
    public final View a;
    public final View b;

    public void m8(View p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onScroll(AbsListView p0,int p1,int p2,int p3){
       q8.b(p0, this.a, this.b);
    }
    public final void onScrollStateChanged(AbsListView p0,int p1){
    }
}
