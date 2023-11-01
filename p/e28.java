package p.e28;
import p.f28;
import p.xu7;
import java.lang.String;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import p.y08;
import p.iw7;
import p.pw7;
import p.l08;
import p.ow7;
import java.lang.Object;
import p.jd;
import android.os.BaseBundle;
import java.lang.Integer;
import java.util.ArrayList;

public abstract class e28 extends xu7 implements f28	// class@001409 from classes.dex
{

    public void e28(){
       super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback", 1);
    }
    public final boolean k(int p0,Parcel p1){
       Bundle uBundle;
       iw7 oiw7;
       Object[] objArray;
       Parcelable$Creator cREATOR;
       Bundle uBundle1;
       Bundle uBundle2;
       iw7 oiw71;
       Object[] objArray1;
       Bundle uBundle3;
       int i = 2;
       String str = "module_name";
       switch (p0){
           case 2:
             uBundle = y08.a(p1, Bundle.CREATOR);
             oiw7 = this;
             oiw7.c.d.c(oiw7.b);
             objArray = new Object[]{Integer.valueOf(p1.readInt())};
             pw7.g.e("onStartDownload\(%d\)", objArray);
             break;
           case 3:
             uBundle = y08.a(p1, Bundle.CREATOR);
             oiw7 = this;
             oiw7.c.d.c(oiw7.b);
             objArray = new Object[]{Integer.valueOf(p1.readInt())};
             pw7.g.e("onCancelDownload\(%d\)", objArray);
             break;
           case 4:
             uBundle = y08.a(p1, Bundle.CREATOR);
             oiw7 = this;
             oiw7.c.d.c(oiw7.b);
             objArray = new Object[]{Integer.valueOf(p1.readInt())};
             pw7.g.e("onGetSession\(%d\)", objArray);
             break;
           case 5:
             this.r(p1.createTypedArrayList(Bundle.CREATOR));
             break;
           case 6:
             cREATOR = Bundle.CREATOR;
             uBundle1 = y08.a(p1, cREATOR);
             uBundle2 = y08.a(p1, cREATOR);
             oiw71 = this;
             oiw71.c.d.c(oiw71.b);
             objArray1 = new Object[]{uBundle1.getString(str),uBundle1.getString("slice_id"),Integer.valueOf(uBundle1.getInt("chunk_number")),Integer.valueOf(uBundle1.getInt("session_id"))};
             pw7.g.e("onNotifyChunkTransferred\(%s, %s, %d, session=%d\)", objArray1);
             break;
           case 7:
             this.u(y08.a(p1, Bundle.CREATOR));
             break;
           case 8:
             cREATOR = Bundle.CREATOR;
             uBundle1 = y08.a(p1, cREATOR);
             uBundle2 = y08.a(p1, cREATOR);
             oiw71 = this;
             oiw71.c.d.c(oiw71.b);
             objArray1 = new Object[i];
             objArray1[0] = uBundle1.getString(str);
             objArray1[1] = Integer.valueOf(uBundle1.getInt("session_id"));
             pw7.g.e("onNotifyModuleCompleted\(%s, sessionId=%d\)", objArray1);
             break;
           case 10:
             cREATOR = Bundle.CREATOR;
             uBundle3 = y08.a(p1, cREATOR);
             uBundle2 = y08.a(p1, cREATOR);
             oiw71 = this;
             oiw71.c.d.c(oiw71.b);
             objArray1 = new Object[]{Integer.valueOf(uBundle3.getInt("session_id"))};
             pw7.g.e("onNotifySessionFailed\(%d\)", objArray1);
             break;
           case 11:
             cREATOR = Bundle.CREATOR;
             uBundle3 = y08.a(p1, cREATOR);
             this.t(uBundle3, y08.a(p1, cREATOR));
             break;
           case 12:
             cREATOR = Bundle.CREATOR;
             uBundle3 = y08.a(p1, cREATOR);
             this.c(uBundle3, y08.a(p1, cREATOR));
             break;
           case 13:
             cREATOR = Bundle.CREATOR;
             uBundle3 = y08.a(p1, cREATOR);
             uBundle2 = y08.a(p1, cREATOR);
             oiw71 = this;
             oiw71.c.d.c(oiw71.b);
             objArray1 = new Object[0];
             pw7.g.e("onRequestDownloadInfo\(\)", objArray1);
             break;
           case 14:
             cREATOR = Bundle.CREATOR;
             uBundle3 = y08.a(p1, cREATOR);
             uBundle2 = y08.a(p1, cREATOR);
             oiw71 = this;
             oiw71.c.d.c(oiw71.b);
             objArray1 = new Object[0];
             pw7.g.e("onRemoveModule\(\)", objArray1);
             break;
           case 15:
             uBundle2 = y08.a(p1, Bundle.CREATOR);
             oiw71 = this;
             oiw71.c.d.c(oiw71.b);
             objArray1 = new Object[0];
             pw7.g.e("onCancelDownloads\(\)", objArray1);
             break;
           default:
             return 0;
       }
       return 1;
    }
}
