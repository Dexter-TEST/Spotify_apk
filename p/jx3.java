package p.jx3;
import p.je2;
import p.lx3;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import java.lang.Class;
import p.i77;
import p.rv;
import p.mx3;
import p.ym6;
import p.co5;
import java.util.List;
import p.dj0;
import android.app.Activity;
import p.vm6;
import java.lang.StackTraceElement;
import p.xm6;
import p.zf2;
import java.lang.Runnable;
import p.o60;
import p.sm6;
import java.lang.Throwable;
import p.jl;

public final class jx3 implements je2	// class@001b62 from classes.dex
{
    public final lx3 a;

    public void jx3(lx3 p0){
       this.a = p0;
    }
    public final void a(Bundle p0,String p1){
       Activity uActivity;
       jx3 ta = this.a;
       ta.getClass();
       if (p0.getBoolean("lyrics_report_bundle_key")) {
          lx3 o = ta.O;
          rv orv = rv.a(R.string.lyrics_fullscreen_track_reported).l();
          mx3 h = ta.R.h;
          o.getClass();
          co5.o(h, "view");
          if ((uActivity = dj0.l0(o.g)) != null) {
             uActivity.runOnUiThread(new xm6(o, new vm6(1, h), orv, ym6.a()));
          }else {
             o.c.a(orv);
             sm6 osm6 = new sm6("Snackbar is not shown because no resumed activity could be found! Was the Snackbar shown from the background?", null, ym6.a());
             jl.q(osm6.a, osm6);
          }
       }
       return;
    }
}
