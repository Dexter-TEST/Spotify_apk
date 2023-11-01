package p.n18;
import p.xu7;
import java.lang.String;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import p.y08;
import p.i18;
import p.m18;
import p.l08;
import p.ow7;
import java.lang.Object;
import p.jd;
import android.os.BaseBundle;
import p.ll;
import java.lang.Exception;
import java.lang.Class;
import java.io.File;
import p.t18;
import android.content.Context;
import android.app.PendingIntent;
import p.wj;

public abstract class n18 extends xu7	// class@001f4d from classes.dex
{

    public void n18(){
       super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback", 1);
    }
    public final boolean k(int p0,Parcel p1){
       Bundle uBundle;
       int i = p0;
       Parcel parcel = p1;
       boolean b = false;
       if (i != 2) {
          if (i != 3) {
             return b;
          }else {
             uBundle = y08.a(parcel, Bundle.CREATOR);
             i18 oi18 = this;
             oi18.d.a.c(oi18.c);
             Object[] objArray = new Object[b];
             oi18.b.e("onCompleteUpdate", objArray);
          }
       }else {
          uBundle = y08.a(parcel, Bundle.CREATOR);
          i18 oi181 = this;
          i18 c = oi181.c;
          oi181.d.a.c(c);
          Object[] objArray1 = new Object[b];
          oi181.b.e("onRequestInfo", objArray1);
          String str = "error.code";
          int i1 = -2;
          if (uBundle.getInt(str, i1)) {
             c.a(new ll(uBundle.getInt(str, i1), true));
          }else {
             uBundle.getInt("version.code", -1);
             int intx = uBundle.getInt("update.availability");
             uBundle.getInt("install.status", b);
             str = "client.version.staleness";
             if (uBundle.getInt(str, -1) != -1) {
                uBundle.getInt(str);
             }
             uBundle.getInt("in.app.update.priority", b);
             uBundle.getLong("bytes.downloaded");
             uBundle.getLong("total.bytes.to.download");
             m18 d = oi181.e.d;
             d.getClass();
             wj uBundle1 = new wj(intx, uBundle.getLong("additional.size.required"), t18.a(new File(d.a.getFilesDir(), "assetpacks")), uBundle.getParcelable("blocking.intent"), uBundle.getParcelable("nonblocking.intent"), uBundle.getParcelable("blocking.destructive.intent"), uBundle.getParcelable("nonblocking.destructive.intent"));
             c.b(uBundle);
          }
       }
       return true;
    }
}
