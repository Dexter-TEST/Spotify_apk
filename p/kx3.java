package p.kx3;
import android.widget.SeekBar$OnSeekBarChangeListener;
import p.lx3;
import java.lang.Object;
import android.widget.SeekBar;
import p.wm4;
import p.mn4;
import android.widget.ProgressBar;
import p.xm4;

public final class kx3 implements SeekBar$OnSeekBarChangeListener	// class@001c9e from classes.dex
{
    public final lx3 a;

    public void kx3(lx3 p0){
       this.a = p0;
       super();
    }
    public final void onProgressChanged(SeekBar p0,int p1,boolean p2){
    }
    public final void onStartTrackingTouch(SeekBar p0){
       this.a.D(new wm4());
    }
    public final void onStopTrackingTouch(SeekBar p0){
       this.a.D(new xm4(p0.getProgress()));
    }
}
