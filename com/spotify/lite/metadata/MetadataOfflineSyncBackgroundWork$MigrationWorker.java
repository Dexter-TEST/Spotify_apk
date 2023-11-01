package com.spotify.lite.metadata.MetadataOfflineSyncBackgroundWork$MigrationWorker;
import com.spotify.androidx.workmanager.DaggerRxWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import io.reactivex.rxjava3.core.Single;
import p.co3;
import java.lang.Class;
import java.lang.Object;
import p.s53;
import java.util.concurrent.Callable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.e16;
import p.yf2;

public class MetadataOfflineSyncBackgroundWork$MigrationWorker extends DaggerRxWorker	// class@00091d from classes.dex
{
    public n94 x;
    public w12 y;

    public void MetadataOfflineSyncBackgroundWork$MigrationWorker(Context p0,WorkerParameters p1){
       super(p0, p1);
    }
    public final Single i(){
       MetadataOfflineSyncBackgroundWork$MigrationWorker ty = this.y;
       ty.getClass();
       return Single.fromCallable(new s53(8, ty)).subscribeOn(s36.c).flatMap(new e16(16, this));
    }
}
