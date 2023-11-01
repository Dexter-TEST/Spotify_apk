package p.xu0;
import java.lang.Object;
import android.view.View;
import p.av0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View$BaseSavedState;

public abstract class xu0	// class@002ce9 from classes.dex
{

    public void xu0(){
       super();
    }
    public void xu0(int p0){
       super();
    }
    public boolean a(View p0){
       return false;
    }
    public boolean b(View p0,View p1){
       return false;
    }
    public void c(av0 p0){
    }
    public boolean d(CoordinatorLayout p0,View p1,View p2){
       return false;
    }
    public void e(CoordinatorLayout p0,View p1){
    }
    public void f(){
    }
    public boolean g(CoordinatorLayout p0,View p1,MotionEvent p2){
       return false;
    }
    public abstract boolean h(CoordinatorLayout p0,View p1,int p2);
    public boolean i(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       return false;
    }
    public void j(CoordinatorLayout p0,View p1,View p2){
    }
    public boolean k(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       return false;
    }
    public void l(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
    }
    public void m(CoordinatorLayout p0,View p1,View p2,int p3){
    }
    public void n(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6,int p7,int[] p8){
       p8[0] = p8[0] + p5;
       p8[1] = p8[1] + p6;
       this.m(p0, p1, p2, p6);
    }
    public boolean o(CoordinatorLayout p0,View p1,Rect p2,boolean p3){
       return false;
    }
    public void p(View p0,Parcelable p1){
    }
    public Parcelable q(View p0,CoordinatorLayout p1){
       return View$BaseSavedState.EMPTY_STATE;
    }
    public boolean r(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       return false;
    }
    public void s(CoordinatorLayout p0,View p1,View p2,int p3){
    }
    public boolean t(CoordinatorLayout p0,View p1,MotionEvent p2){
       return false;
    }
}
