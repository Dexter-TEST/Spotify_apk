package p.dt6;
import p.ir0;
import com.spotify.liteappstorage.files.StorageLocationMovingService;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import android.app.Notification;
import android.app.Service;

public final class dt6 implements ir0	// class@0013b4 from classes.dex
{
    public final int a;
    public final StorageLocationMovingService b;

    public void dt6(StorageLocationMovingService p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       dt6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.startForeground(R.id.storage_notification, p0);
             return;
       }
       tb.getClass();
       Object[] objArray = new Object[0];
       Logger.c(p0, "Error finalizing storage location move", objArray);
       tb.a();
       return;
    }
}
