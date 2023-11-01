package p.vr5;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;
import p.kg4;

public final class vr5	// class@002a4f from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public int n;

    public void vr5(){
       super();
       this.a = -1;
       this.b = 0;
       this.c = 0;
       this.d = 1;
       this.e = 0;
       this.f = false;
       this.g = false;
       this.h = false;
       this.i = false;
       this.j = false;
       this.k = false;
    }
    public final void a(int p0){
       if ((this.d & p0)) {
          return;
       }
       throw new IllegalStateException("Layout state should be one of "+Integer.toBinaryString(p0)+" but it is "+Integer.toBinaryString(this.d));
    }
    public final int b(){
       int i = (this.g != null)? this.b - this.c: this.e;
       return i;
    }
    public final String toString(){
       return kg4.p("State{mTargetPosition="+this.a+", mData=null, mItemCount="+this.e+", mIsMeasuring="+this.i+", mPreviousLayoutItemCount="+this.b+", mDeletedInvisibleItemCountSincePreviousLayout="+this.c+", mStructureChanged="+this.f+", mInPreLayout="+this.g+", mRunSimpleAnimations="+this.j+", mRunPredictiveAnimations=", this.k, '}');
    }
}
