package p.u52;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.lang.Object;
import p.w45;
import p.hr5;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class u52	// class@002845 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final FlexboxLayoutManager h;

    public void u52(FlexboxLayoutManager p0){
       this.h = p0;
       super();
       this.d = 0;
    }
    public static void a(u52 p0){
       int i;
       u52 h = p0.h;
       if (!h.i() && h.L != null) {
          i = (p0.e != null)? h.T.i(): h.F - h.T.n();
          p0.c = i;
       }else if(p0.e != null){
          i = h.T.i();
       }else {
          i = h.T.n();
       }
       p0.c = i;
       return;
    }
    public static void b(u52 p0){
       FlexboxLayoutManager i;
       p0.a = -1;
       p0.b = -1;
       p0.c = Integer.MIN_VALUE;
       boolean b = false;
       p0.f = b;
       p0.g = b;
       u52 h = p0.h;
       if (h.i()) {
          if ((i = h.I) == null) {
             if (h.H == 1) {
                b = true;
             }
             p0.e = b;
          }else if(i == 2){
             b = true;
          }
          p0.e = b;
       }else if((i = h.I) == null){
          if (h.H == 3) {
             b = true;
          }
          p0.e = b;
       }else if(i == 2){
          b = true;
       }
       p0.e = b;
       return;
    }
    public final String toString(){
       return kg4.p("AnchorInfo{mPosition="+this.a+", mFlexLinePosition="+this.b+", mCoordinate="+this.c+", mPerpendicularCoordinate="+this.d+", mLayoutFromEnd="+this.e+", mValid="+this.f+", mAssignedFromSavedState=", this.g, '}');
    }
}
