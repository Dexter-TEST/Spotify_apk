package p.um2;
import android.os.AsyncTask;
import p.wm2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Void;
import java.lang.Class;
import p.tm2;
import java.util.ArrayList;
import p.az5;
import java.util.List;
import java.lang.Throwable;
import java.util.Arrays;
import p.sz1;
import java.lang.Thread;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Looper;
import java.lang.StringBuilder;

public final class um2 extends AsyncTask	// class@0028d9 from classes.dex
{
    public final wm2 a;
    public Exception b;

    public void um2(wm2 p0){
       co5.o(p0, "requests");
       super();
       this.a = p0;
    }
    public final Object doInBackground(Object[] p0){
       ArrayList uArrayList;
       String str = "params";
       try{
          co5.o(p0, str);
          um2 ta = this.a;
          ta.getClass();
          uArrayList = az5.B(ta);
       }catch(java.lang.Exception e2){
          this.b = e2;
          uArrayList = null;
       }
       return uArrayList;
    }
    public final void onPostExecute(Object p0){
       co5.o(p0, "result");
       super.onPostExecute(p0);
       if ((p0 = this.b) != null) {
          Object[] objArray = new Object[]{p0.getMessage()};
          co5.l(String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(objArray, 1)), "java.lang.String.format\(format, *args\)");
          p0 = sz1.a;
       }
       return;
    }
    public final void onPreExecute(){
       super.onPreExecute();
       um2 ta = this.a;
       if (ta.a == null) {
          Handler handler = (Thread.currentThread() instanceof HandlerThread)? new Handler(): new Handler(Looper.getMainLooper());
          ta.a = handler;
       }
       return;
    }
    public final String toString(){
       String str = "{RequestAsyncTask:  connection: null, requests: "+this.a+"}";
       co5.l(str, "StringBuilder\(\)\n        .append\(\"{RequestAsyncTask: \"\)\n        .append\(\" connection: \"\)\n        .append\(connection\)\n        .append\(\", requests: \"\)\n        .append\(requests\)\n        .append\(\"}\"\)\n        .toString\(\)");
       return str;
    }
}
