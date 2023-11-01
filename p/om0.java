package p.om0;
import p.qm0;
import java.lang.String;
import android.content.Context;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Integer;
import android.view.View;
import io.reactivex.rxjava3.core.Observer;
import p.u01;
import java.lang.Class;
import p.zk2;
import p.eo5;
import android.widget.ProgressBar;
import android.os.Build$VERSION;
import android.widget.SeekBar;
import p.v3;
import p.nm0;
import android.widget.SeekBar$OnSeekBarChangeListener;

public final class om0 extends qm0	// class@002148 from classes.dex
{
    public boolean f;
    public int g;
    public final String h;
    public final String i;
    public int j;

    public void om0(String p0,String p1,int p2,String p3,String p4){
       super(4, 123, p0);
       this.e = p1;
       this.j = p2;
       this.i = p3;
       this.h = p4;
    }
    public static String b(Context p0,int p1){
       String str;
       if (!p1) {
          str = p0.getString(R.string.settings_audio_quality_crossfade_off);
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p1)};
          str = p0.getResources().getQuantityString(R.plurals.settings_audio_quality_crossfade_time_seconds, p1, objArray);
       }
       return str;
    }
    public final boolean a(View p0,Observer p1){
       u01 ou01 = eo5.M(p0, u01.class);
       u01 b = ou01.b;
       if (this.f == null && this.j != b.getProgress()) {
          if (Build$VERSION.SDK_INT >= 24) {
             this.t(b, this.j);
          }else {
             b.setProgress(this.j);
             b.refreshDrawableState();
          }
       }
       b.setOnSeekBarChangeListener(new nm0(this, ou01, p1));
       return true;
    }
}
