package p.cc6;
import p.ru5;
import java.io.File;
import java.util.Map;
import java.lang.Object;
import java.util.HashMap;
import java.util.Collections;
import java.lang.String;
import android.util.Log;

public final class cc6 implements ru5	// class@0011df from classes.dex
{
    public final File a;
    public final File[] b;
    public final HashMap c;

    public void cc6(File p0,Map p1){
       super();
       this.a = p0;
       File[] uFileArray = new File[]{p0};
       this.b = uFileArray;
       this.c = new HashMap(p1);
    }
    public final Map a(){
       return Collections.unmodifiableMap(this.c);
    }
    public final int b(){
       return 1;
    }
    public final File[] c(){
       return this.b;
    }
    public final String d(){
       String fileName = this.getFileName();
       return fileName.substring(0, fileName.lastIndexOf(46));
    }
    public final File e(){
       return this.a;
    }
    public final String getFileName(){
       return this.a.getName();
    }
    public final void remove(){
       cc6 ta = this.a;
       ta.getPath();
       Log.isLoggable("FirebaseCrashlytics", 3);
       ta.delete();
    }
}
