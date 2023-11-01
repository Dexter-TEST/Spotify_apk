package p.hj1;
import java.lang.Object;
import p.ij1;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p.dj1;
import android.os.Handler;
import android.os.Looper;
import p.sk;
import p.cj1;
import java.util.concurrent.locks.Lock;
import p.bj1;
import p.vf;
import p.ap5;
import p.gj1;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Class;
import java.util.ArrayList;
import java.util.Collection;
import p.yx5;
import java.util.List;
import java.lang.Runnable;
import java.lang.CharSequence;
import p.is7;
import java.lang.IllegalArgumentException;
import p.fj1;
import java.lang.NullPointerException;

public final class hj1	// class@001860 from classes.dex
{
    public final ReentrantReadWriteLock a;
    public final sk b;
    public int c;
    public final Handler d;
    public final cj1 e;
    public final gj1 f;
    public final int g;
    public final g71 h;
    public static final Object i;
    public static hj1 j;

    static {
       hj1.i = new Object();
    }
    public void hj1(ij1 p0){
       super();
       ReentrantReadWriteLock reentrantRea = new ReentrantReadWriteLock();
       this.a = reentrantRea;
       this.c = 3;
       this.f = p0.a;
       dj1 b = p0.b;
       this.g = b;
       this.h = p0.c;
       this.d = new Handler(Looper.getMainLooper());
       this.b = new sk(0);
       cj1 uocj1 = new cj1(this);
       this.e = uocj1;
       reentrantRea.writeLock().lock();
       if (b == null) {
          this.c = 0;
       }
       reentrantRea.writeLock().unlock();
       if (!this.b()) {
          uocj1.b.f.b(new bj1(uocj1));
       }
       return;
    }
    public static hj1 a(){
       hj1 j;
       Object i = hj1.i;
       _monitor_enter(i);
       int i1 = ((j = hj1.j) != null)? 1: 0;
       if (i1) {
          _monitor_exit(i);
          return j;
       }else {
          throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
       }
    }
    public final int b(){
       this.a.readLock().lock();
       this.a.readLock().unlock();
       return this.c;
    }
    public final void c(){
       int i = 0;
       int i1 = 1;
       int i2 = (this.g == i1)? 1: 0;
       if (i2) {
          if (this.b() != i1) {
             i1 = 0;
          }
          if (i1) {
             return;
          }else {
             this.a.writeLock().lock();
             if (this.c == null) {
                this.a.writeLock().unlock();
                return;
             }else {
                this.c = i;
                this.a.writeLock().unlock();
                hj1 te = this.e;
                te.getClass();
                te.b.f.b(new bj1(te));
                return;
             }
          }
       }else {
          throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
       }
    }
    public final void d(Throwable p0){
       ArrayList uArrayList = new ArrayList();
       this.a.writeLock().lock();
       this.c = 2;
       uArrayList.addAll(this.b);
       this.b.clear();
       this.a.writeLock().unlock();
       this.d.post(new yx5(uArrayList, this.c, p0));
    }
    public final void e(){
       ArrayList uArrayList = new ArrayList();
       this.a.writeLock().lock();
       this.c = 1;
       uArrayList.addAll(this.b);
       this.b.clear();
       this.a.writeLock().unlock();
       this.d.post(new yx5(this.c, uArrayList));
    }
    public final CharSequence f(int p0,int p1,CharSequence p2){
       boolean b = true;
       boolean i = (this.b() == b)? 1: 0;
       if (i) {
          if (p0 >= 0) {
             if (p1 >= 0) {
                i = (p0 <= p1)? true: false;
                is7.f("start should be <= than end", i);
                if (p2 == null) {
                   return null;
                }else if(p0 <= p2.length()){
                   i = true;
                }else {
                   i = false;
                }
                is7.f("start should be < than charSequence length", i);
                if (p1 > p2.length()) {
                   b = false;
                }
                is7.f("end should be < than charSequence length", b);
                if (p2.length() && p0 != p1) {
                   return this.e.O(p2, p0, p1, false);
                }else {
                   return p2;
                }
             }else {
                throw new IllegalArgumentException("end cannot be negative");
             }
          }else {
             throw new IllegalArgumentException("start cannot be negative");
          }
       }else {
          throw new IllegalStateException("Not initialized yet");
       }
    }
    public final void g(fj1 p0){
       if (p0 == null) {
          throw new NullPointerException("initCallback cannot be null");
       }
       this.a.writeLock().lock();
       if (this.c != 1 && this.c != 2) {
          this.b.add(p0);
       }else {
          this.d.post(new yx5(p0, this.c));
       }
       this.a.writeLock().unlock();
       return;
    }
}
