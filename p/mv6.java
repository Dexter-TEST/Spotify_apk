package p.mv6;
import p.kv6;
import java.lang.Enum;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import p.vv7;
import java.util.Objects;
import p.qf1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.IllegalArgumentException;
import p.kg4;
import java.lang.NullPointerException;
import java.lang.Class;

public final class mv6 extends Enum implements kv6	// class@001f14 from classes.dex
{
    public static final mv6 a;
    public static final mv6[] b;

    static {
       mv6 omv6 = new mv6();
       mv6.a = omv6;
       mv6[] omv6Array = new mv6[]{omv6};
       mv6.b = omv6Array;
    }
    public void mv6(){
       super("CANCELLED", 0);
    }
    public static boolean b(AtomicReference p0){
       kv6 andSet;
       mv6 a = mv6.a;
       if (p0.get() == a || (andSet = p0.getAndSet(a)) == a) {
          return false;
       }
       if (andSet != null) {
          andSet.cancel();
       }
       return true;
    }
    public static void c(AtomicReference p0,AtomicLong p1,long p2){
       kv6 okv6;
       kv6 okv61;
       if ((okv6 = p0.get()) != null) {
          okv6.a(p2);
       }else if(mv6.f(p2)){
          vv7.a(p1, p2);
          if ((okv61 = p0.get()) != null) {
             long andSet = p1.getAndSet(0);
             if (andSet) {
                okv61.a(andSet);
             }
          }
       }
       return;
    }
    public static void d(AtomicReference p0,AtomicLong p1,kv6 p2){
       if (mv6.e(p0, p2)) {
          long andSet = p1.getAndSet(0);
          if (andSet) {
             p2.a(andSet);
          }
       }
       return;
    }
    public static boolean e(AtomicReference p0,kv6 p1){
       int i;
       Objects.requireNonNull(p1, "s is null");
       while (true) {
          if (p0.compareAndSet(null, p1)) {
             i = 1;
          }else {
             if (p0.get() != null) {
                i = 0;
             }
          }
          if (!i) {
             p1.cancel();
             if (p0.get() != mv6.a) {
                RxJavaPlugins.c(new qf1("Subscription already set!"));
                break ;
             }
             break ;
          }else {
             return true;
          }
       }
       return false;
    }
    public static boolean f(long p0){
       if ((p0) > 0) {
          return true;
       }
       RxJavaPlugins.c(new IllegalArgumentException(kg4.k("n > 0 required but it was ", p0)));
       return false;
    }
    public static boolean g(kv6 p0,kv6 p1){
       if (p1 == null) {
          RxJavaPlugins.c(new NullPointerException("next is null"));
          return false;
       }else if(p0 != null){
          p1.cancel();
          RxJavaPlugins.c(new qf1("Subscription already set!"));
          return false;
       }else {
          return true;
       }
    }
    public static mv6 valueOf(String p0){
       return Enum.valueOf(mv6.class, p0);
    }
    public static mv6[] values(){
       return mv6.b.clone();
    }
    public final void a(long p0){
    }
    public final void cancel(){
    }
}
