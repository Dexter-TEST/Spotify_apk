package p.hf4;
import p.ru5;
import java.io.File;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import android.util.Log;
import java.util.Objects;

public final class hf4 implements ru5	// class@00183f from classes.dex
{
    public final File a;

    public void hf4(File p0){
       super();
       this.a = p0;
    }
    public final Map a(){
       return null;
    }
    public final int b(){
       return 2;
    }
    public final File[] c(){
       return this.a.listFiles();
    }
    public final String d(){
       return this.a.getName();
    }
    public final File e(){
       return null;
    }
    public final String getFileName(){
       return null;
    }
    public final void remove(){
       File[] uFileArray = this.c();
       int len = uFileArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uFileArray[i];
          oobject.getPath();
          Log.isLoggable("FirebaseCrashlytics", 3);
          oobject.delete();
       }
       hf4 ta = this.a;
       Objects.toString(ta);
       Log.isLoggable("FirebaseCrashlytics", 3);
       ta.delete();
       return;
    }
}
