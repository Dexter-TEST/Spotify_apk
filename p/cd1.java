package p.cd1;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Enum;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.Objects;
import p.qf1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.NullPointerException;
import java.lang.Class;

public final class cd1 extends Enum implements Disposable	// class@0011e3 from classes.dex
{
    public static final cd1 a;
    public static final cd1[] b;

    static {
       cd1 uocd1 = new cd1();
       cd1.a = uocd1;
       cd1[] uocd1Array = new cd1[]{uocd1};
       cd1.b = uocd1Array;
    }
    public void cd1(){
       super("DISPOSED", 0);
    }
    public static boolean a(AtomicReference p0){
       Disposable andSet;
       cd1 a = cd1.a;
       if (p0.get() == a || (andSet = p0.getAndSet(a)) == a) {
          return false;
       }
       if (andSet != null) {
          andSet.dispose();
       }
       return true;
    }
    public static boolean b(Disposable p0){
       boolean b = (p0 == cd1.a)? true: false;
       return b;
    }
    public static boolean c(AtomicReference p0,Disposable p1){
       boolean b;
       while (true) {
          Disposable uDisposable = p0.get();
          b = false;
          if (uDisposable == cd1.a) {
             if (p1 != null) {
                p1.dispose();
                break ;
             }
             break ;
          }else if(p0.compareAndSet(uDisposable, p1)){
             b = true;
          }else {
             if (p0.get() == uDisposable) {
                continue ;
             }
          }
          if (b) {
             return true;
          }
          continue ;
       }
       return b;
    }
    public static boolean d(AtomicReference p0,Disposable p1){
       while (true) {
          Disposable uDisposable = p0.get();
          boolean b = false;
          if (uDisposable == cd1.a) {
             if (p1 != null) {
                p1.dispose();
             }
          }else if(p0.compareAndSet(uDisposable, p1)){
             b = true;
          }else {
             if (p0.get() == uDisposable) {
                continue ;
             }
          }
          if (b) {
             if (uDisposable != null) {
                uDisposable.dispose();
             }
          }else {
             continue ;
          }
       }
       return true;
    }
    public static boolean e(AtomicReference p0,Disposable p1){
       int i;
       Objects.requireNonNull(p1, "d is null");
       while (true) {
          if (p0.compareAndSet(null, p1)) {
             i = 1;
          }else {
             if (p0.get() != null) {
                i = 0;
             }
          }
          if (!i) {
             p1.dispose();
             if (p0.get() != cd1.a) {
                RxJavaPlugins.c(new qf1("Disposable already set!"));
                break ;
             }
             break ;
          }else {
             return true;
          }
       }
       return false;
    }
    public static void f(AtomicReference p0,Disposable p1){
       int i;
       while (true) {
          if (p0.compareAndSet(null, p1)) {
             i = 1;
          }else {
             if (p0.get() != null) {
                i = 0;
             }
          }
          if (!i && p0.get() == cd1.a) {
             p1.dispose();
             break ;
          }
          break ;
       }
       return;
    }
    public static boolean g(Disposable p0,Disposable p1){
       if (p1 == null) {
          RxJavaPlugins.c(new NullPointerException("next is null"));
          return false;
       }else if(p0 != null){
          p1.dispose();
          RxJavaPlugins.c(new qf1("Disposable already set!"));
          return false;
       }else {
          return true;
       }
    }
    public static cd1 valueOf(String p0){
       return Enum.valueOf(cd1.class, p0);
    }
    public static cd1[] values(){
       return cd1.b.clone();
    }
    public void dispose(){
    }
    public boolean isDisposed(){
       return true;
    }
}
