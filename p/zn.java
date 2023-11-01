package p.zn;
import java.lang.Object;
import p.zr5;
import android.view.View;

public final class zn	// class@002f33 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int d;

    public void zn(){
       super();
       this.a = -1;
       this.b = -1;
       this.c = -1;
       this.d = -1;
    }
    public void zn(int p0){
       super();
    }
    public void zn(int p0,int p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(zr5 p0){
       p0 = p0.a;
       this.a = p0.getLeft();
       this.b = p0.getTop();
       this.c = p0.getRight();
       this.d = p0.getBottom();
    }
}
