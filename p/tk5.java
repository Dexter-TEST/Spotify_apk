package p.tk5;
import java.util.HashMap;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.io.IOException;
import java.nio.channels.spi.AbstractInterruptibleChannel;

public final class tk5	// class@00278c from classes.dex
{
    public final boolean a;
    public final File b;
    public final Lock c;
    public FileChannel d;
    public static final HashMap e;

    static {
       tk5.e = new HashMap();
    }
    public void tk5(String p0,File p1,boolean p2){
       ReentrantLock reentrantLoc;
       super();
       this.a = p2;
       File uFile = (p1 != null)? new File(p1, p0.concat(".lck")): null;
       this.b = uFile;
       HashMap e = tk5.e;
       _monitor_enter(e);
       if ((reentrantLoc = e.get(p0)) == null) {
          reentrantLoc = new ReentrantLock();
          e.put(p0, reentrantLoc);
       }
       _monitor_exit(e);
       this.c = reentrantLoc;
       return;
    }
    public final void a(boolean p0){
       tk5 tb;
       File parentFile;
       this.c.lock();
       if (p0) {
          try{
             if ((tb = this.b) != null) {
                if ((parentFile = tb.getParentFile()) != null) {
                   parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(tb).getChannel();
                channel.lock();
                this.d = channel;
             }else {
                throw new IOException("No lock directory was provided.");
             }
          }catch(java.io.IOException e0){
             this.d = null;
          }
       }
       return;
    }
    public final void b(){
       tk5 td;
       try{
          if ((td = this.d) != null) {
             td.close();
          }
          this.c.unlock();
          return;
       }catch(java.io.IOException e0){
       }
    }
}
