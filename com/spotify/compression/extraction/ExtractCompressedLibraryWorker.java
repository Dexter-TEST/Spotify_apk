package com.spotify.compression.extraction.ExtractCompressedLibraryWorker;
import com.spotify.androidx.workmanager.DaggerWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.uq7;
import p.nx1;
import p.z35;
import java.lang.Class;
import p.a45;
import p.cr7;
import java.util.List;
import java.util.Collections;
import p.j45;
import p.em3;
import java.lang.Runnable;
import p.dm3;
import p.bm3;

public final class ExtractCompressedLibraryWorker extends DaggerWorker	// class@000599 from classes.dex
{
    public Runnable w;
    public boolean x;

    public void ExtractCompressedLibraryWorker(Context p0,WorkerParameters p1){
       co5.o(p0, "appContext");
       co5.o(p1, "workerParams");
       super(p0, p1);
    }
    public static final void h(Context p0){
       co5.o(p0, "context");
       uq7.y(p0).w("extract_compressed_libraries", nx1.b, Collections.singletonList(new z35(ExtractCompressedLibraryWorker.class).a()));
    }
    public final em3 g(){
       ExtractCompressedLibraryWorker tw;
       bm3 uobm3;
       super.g();
       if (this.x != null) {
          try{
             if ((tw = this.w) != null) {
                tw.run();
                uobm3 = em3.a();
             }else {
                co5.N("compressedLibrariesWorker");
                throw null;
             }
          }catch(java.lang.Exception e0){
             uobm3 = new bm3();
          }
       }else {
          uobm3 = em3.a();
       }
       return uobm3;
    }
}
