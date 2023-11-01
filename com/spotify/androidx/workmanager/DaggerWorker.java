package com.spotify.androidx.workmanager.DaggerWorker;
import androidx.work.Worker;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.em3;
import p.fm3;
import p.b17;
import p.dm3;

public abstract class DaggerWorker extends Worker	// class@000536 from classes.dex
{

    public void DaggerWorker(Context p0,WorkerParameters p1){
       co5.o(p0, "context");
       co5.o(p1, "workerParams");
       super(p0, p1);
    }
    public em3 g(){
       b17.p(this);
       return em3.a();
    }
}
