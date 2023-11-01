package com.spotify.androidx.workmanager.DaggerRxWorker;
import androidx.work.rxjava3.RxWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.Single;
import p.fm3;
import p.b17;

public abstract class DaggerRxWorker extends RxWorker	// class@000535 from classes.dex
{

    public void DaggerRxWorker(Context p0,WorkerParameters p1){
       co5.o(p0, "appContext");
       co5.o(p1, "workerParams");
       super(p0, p1);
    }
    public final Single h(){
       b17.p(this);
       return this.i();
    }
    public abstract Single i();
}
