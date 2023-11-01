package p.s;
import android.os.Process;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import p.bc;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Object;
import android.app.ActivityManager$ProcessErrorStateInfo;
import android.os.Looper;
import java.lang.Thread;
import java.lang.String;
import p.co5;
import java.lang.StackTraceElement;
import org.json.JSONArray;
import p.av6;
import p.ya3;

public abstract class s	// class@0025e9 from classes.dex
{
    public static final int a;
    public static final ScheduledExecutorService b;
    public static String c;
    public static final bc d;

    static {
       s.a = Process.myUid();
       s.b = Executors.newSingleThreadScheduledExecutor();
       s.c = "";
       s.d = new bc(15);
    }
    public static final void a(ActivityManager p0){
       List processesInE;
       String str;
       StackTraceElement[] stackTrace1;
       String methodName;
       if ((processesInE = p0.getProcessesInErrorState()) == null) {
       }else {
          Iterator iterator = processesInE.iterator();
          while (iterator.hasNext()) {
             ActivityManager$ProcessErrorStateInfo processError = iterator.next();
             if (processError.condition == 2 && processError.uid == s.a) {
                Thread thread = Looper.getMainLooper().getThread();
                co5.l(thread, "getMainLooper\(\).thread");
                StackTraceElement[] stackTrace = thread.getStackTrace();
                JSONArray jSONArray = new JSONArray();
                co5.l(stackTrace, "stackTrace");
                int len = stackTrace.length;
                boolean b = false;
                int i = 0;
                while (i < len) {
                   i = i + 1;
                   jSONArray.put(stackTrace[i].toString());
                }
                str = jSONArray.toString();
                if (!co5.c(str, s.c)) {
                   if ((stackTrace1 = thread.getStackTrace()) != null) {
                      int len1 = stackTrace1.length;
                      len = 0;
                      while (len < len1) {
                         object oobject = stackTrace1[len];
                         String className = oobject.getClassName();
                         String str1 = "element.className";
                         co5.l(className, str1);
                         if (av6.D0(className, "com.facebook", b)) {
                            className = oobject.getClassName();
                            co5.l(className, str1);
                            if (!av6.D0(className, "com.facebook.appevents.codeless", b)) {
                               className = oobject.getClassName();
                               co5.l(className, str1);
                               if (!av6.D0(className, "com.facebook.appevents.suggestedevents", b)) {
                                  b = 1;
                               }
                            }
                            className = oobject.getMethodName();
                            str1 = "element.methodName";
                            co5.l(className, str1);
                            if (!av6.D0(className, "onClick", b)) {
                               className = oobject.getMethodName();
                               co5.l(className, str1);
                               if (!av6.D0(className, "onItemClick", b)) {
                                  methodName = oobject.getMethodName();
                                  co5.l(methodName, str1);
                                  if (!av6.D0(methodName, "onTouch", b)) {
                                  }
                               }
                            }
                         }
                         len = len + 1;
                      }
                   }
                   if (!b) {
                      continue ;
                   }
                }
             }
             s.c = str;
             new ya3(processError.shortMsg, str).c();
          }
       }
       return;
    }
}
