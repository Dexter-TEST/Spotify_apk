package p.sk2;
import p.mj2;
import p.y2;
import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import p.uw5;
import p.ry7;
import p.b17;

public class sk2 extends View implements mj2, y2	// class@002645 from classes.dex
{
    public boolean a;

    public void sk2(Context p0){
       super(p0);
    }
    public final void a(float p0,int p1){
    }
    public final void draw(Canvas p0){
    }
    public int getFilterHeight(){
       if (this.a == null) {
          return 0;
       }
       return (ry7.F(this.getContext()) + uw5.n(this.getContext(), 0x10102eb));
    }
    public int getTotalScrollRange(){
       return 0;
    }
    public View getView(){
       return this;
    }
    public final void onMeasure(int p0,int p1){
       super.onMeasure(p0, b17.s(this.getFilterHeight()));
    }
    public void setCoordinatorAccessoryOffset(int p0){
    }
    public void setFakingActionBar(boolean p0){
       this.a = p0;
    }
}
