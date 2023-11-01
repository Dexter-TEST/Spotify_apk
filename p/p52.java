package p.p52;
import java.lang.Object;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import p.o52;
import java.lang.Math;

public final class p52	// class@0021f3 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public final ArrayList n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;

    public void p52(){
       super();
       this.a = Integer.MAX_VALUE;
       this.b = Integer.MAX_VALUE;
       this.c = Integer.MIN_VALUE;
       this.d = Integer.MIN_VALUE;
       this.n = new ArrayList();
    }
    public final void a(View p0,int p1,int p2,int p3,int p4){
       o52 layoutParams = p0.getLayoutParams();
       this.a = Math.min(this.a, ((p0.getLeft() - layoutParams.E()) - p1));
       this.b = Math.min(this.b, ((p0.getTop() - layoutParams.K()) - p2));
       this.c = Math.max(this.c, ((layoutParams.r() + p0.getRight()) + p3));
       this.d = Math.max(this.d, ((layoutParams.B() + p0.getBottom()) + p4));
    }
}
