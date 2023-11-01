package com.spotify.lite.metadata.MetadataCleanUpBackgroundWork$CleanUpWorker;
import com.spotify.androidx.workmanager.DaggerRxWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import io.reactivex.rxjava3.core.Single;
import p.co3;
import java.lang.Class;
import java.lang.Object;
import p.ou4;
import p.ko1;
import p.tn6;
import p.zv6;
import p.e16;
import p.yf2;

public class MetadataCleanUpBackgroundWork$CleanUpWorker extends DaggerRxWorker	// class@00091c from classes.dex
{
    public zg0 A;
    public MetadataRoomDatabase x;
    public w12 y;
    public rp3 z;

    public void MetadataCleanUpBackgroundWork$CleanUpWorker(Context p0,WorkerParameters p1){
       super(p0, p1);
    }
    public final Single i(){
       MetadataCleanUpBackgroundWork$CleanUpWorker ty = this.y;
       co3 g = ty.g;
       g.getClass();
       return Single.fromSupplier(new ou4(g, ty.i, 1)).flatMap(new e16(12, this));
    }
}
