package p.ah;
import android.widget.SeekBar;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p.n37;
import p.bh;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;

public final class ah extends SeekBar	// class@000f86 from classes.dex
{
    private final bh a;

    public void ah(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f030560);
       n37.a(this.getContext(), this);
       bh uobh = new bh(this);
       this.a = uobh;
       uobh.a(p1, R.attr.seekBarStyle);
    }
    public final void drawableStateChanged(){
       bh e;
       super.drawableStateChanged();
       ah ta = this.a;
       if ((e = ta.e) != null && e.isStateful()) {
          bh d = ta.d;
          if (e.setState(d.getDrawableState())) {
             d.invalidateDrawable(e);
          }
       }
       return;
    }
    public final void jumpDrawablesToCurrentState(){
       bh e;
       super.jumpDrawablesToCurrentState();
       if ((e = this.a.e) != null) {
          e.jumpToCurrentState();
       }
       return;
    }
    public synchronized final void onDraw(Canvas p0){
       super.onDraw(p0);
       this.a.d(p0);
    }
}
