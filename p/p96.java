package p.p96;
import android.widget.SeekBar$OnSeekBarChangeListener;
import p.wz3;
import android.widget.SeekBar;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.q96;
import p.r96;
import p.s96;

public final class p96 extends wz3 implements SeekBar$OnSeekBarChangeListener	// class@00221b from classes.dex
{
    public final SeekBar b;
    public final Observer c;

    public void p96(SeekBar p0,Observer p1){
       co5.q(p0, "view");
       co5.q(p1, "observer");
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void f(){
       this.b.setOnSeekBarChangeListener(null);
    }
    public final void onProgressChanged(SeekBar p0,int p1,boolean p2){
       co5.q(p0, "seekBar");
       if (!this.isDisposed()) {
          this.c.onNext(new q96(p0, p1, p2));
       }
       return;
    }
    public final void onStartTrackingTouch(SeekBar p0){
       co5.q(p0, "seekBar");
       if (!this.isDisposed()) {
          this.c.onNext(new r96(p0));
       }
       return;
    }
    public final void onStopTrackingTouch(SeekBar p0){
       co5.q(p0, "seekBar");
       if (!this.isDisposed()) {
          this.c.onNext(new s96(p0));
       }
       return;
    }
}
