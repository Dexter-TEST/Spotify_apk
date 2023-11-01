package p.ki7;
import android.hardware.SensorEventListener;
import java.lang.Object;
import android.hardware.Sensor;
import java.lang.String;
import p.co5;
import android.hardware.SensorEvent;
import java.lang.Math;
import p.zh0;
import p.f22;
import p.sz1;
import p.me7;
import p.le7;
import p.ai0;
import java.util.concurrent.Executor;
import p.am0;
import java.lang.Runnable;

public final class ki7 implements SensorEventListener	// class@001c1f from classes.dex
{
    public zh0 a;

    public void ki7(){
       super();
    }
    public final void onAccuracyChanged(Sensor p0,int p1){
       co5.o(p0, "sensor");
    }
    public final void onSensorChanged(SensorEvent p0){
       ki7 ta;
       co5.o(p0, "event");
       if ((ta = this.a) == null) {
       }else {
          p0 = p0.values;
          int i = 0;
          if ((0x4002666666666666 - Math.sqrt((((double)(p0[2] / 9.81f) * (double)(p0[2] / 9.81f)) + (((double)(p0[1] / 9.81f) * (double)(p0[1] / 9.81f)) + ((double)(p0[i] / 9.81f) * (double)(p0[i] / 9.81f)))))) > 0) {
             zh0 b = ta.b;
             zh0 c = ta.c;
             co5.o(c, "$appId");
             if (b != null && b.g != null) {
                i = 1;
             }
             me7.c();
             boolean b1 = me7.f.a();
             if (i && (b1 && !ai0.g)) {
                ai0.g = true;
                sz1.c().execute(new am0(10, c));
             }
          }
       }
       return;
    }
}
