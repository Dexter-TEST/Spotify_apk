package com.spotify.share.fileimpl.files.SharedFilesCleanWorker;
import com.spotify.androidx.workmanager.DaggerWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.em3;
import p.fm3;
import p.h51;
import java.util.HashMap;
import android.net.Uri;
import p.dm3;

public final class SharedFilesCleanWorker extends DaggerWorker	// class@000c1d from classes.dex
{

    public void SharedFilesCleanWorker(Context p0,WorkerParameters p1){
       co5.o(p0, "context");
       co5.o(p1, "workerParams");
       p0 = p0.getApplicationContext();
       co5.l(p0, "context.applicationContext");
       super(p0, p1);
    }
    public final em3 g(){
       super.g();
       fm3 tb = this.b;
       em3 uoem3 = tb.b.a.get("file_names_to_delete");
       if (uoem3 instanceof String[]) {
       }else {
          uoem3 = null;
       }
       em3 uoem31 = tb.b.a.get("uris_to_revoke");
       if (uoem31 instanceof String[]) {
       }else {
          uoem31 = null;
       }
       if (uoem31 != null && uoem31.length > 0) {
          Uri.parse(uoem31[0]);
          co5.N("filePermissionHandler");
          throw null;
       }else if(uoem3 != null && uoem3.length > 0){
          co5.N("fileCleaner");
          throw null;
       }else {
          return em3.a();
       }
    }
}
