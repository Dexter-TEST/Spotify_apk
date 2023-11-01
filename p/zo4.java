package p.zo4;
import java.util.Optional;
import android.app.job.JobParameters;
import android.net.Uri;
import java.lang.String;
import android.text.Spannable;
import java.util.stream.IntStream;
import java.lang.CharSequence;
import android.util.DisplayMetrics;
import java.util.Locale;
import android.icu.text.DateFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.util.TimeZone;
import android.text.TextPaint;
import android.os.LocaleList;
import android.content.Context;
import android.view.PointerIcon;
import android.content.res.Resources;
import android.graphics.Bitmap;
import java.lang.Object;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import p.jg1;
import java.util.stream.BaseStream;
import java.lang.Runnable;
import java.util.Spliterator;
import java.util.stream.StreamSupport;
import android.net.ConnectivityManager;
import com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1;
import android.net.ConnectivityManager$NetworkCallback;
import android.view.View;
import android.view.View$DragShadowBuilder;
import java.util.concurrent.CompletionStage;
import p.c82;
import android.os.UserManager;
import java.lang.reflect.Method;

public abstract class zo4	// class@002f38 from classes.dex
{

    public static boolean A(Optional p0){
       return p0.isPresent();
    }
    public static Uri[] B(JobParameters p0){
       return p0.getTriggeredContentUris();
    }
    public static String[] C(JobParameters p0){
       return p0.getTriggeredContentAuthorities();
    }
    public static IntStream D(Spannable p0){
       return p0.codePoints();
    }
    public static int a(){
       return DisplayMetrics.DENSITY_DEVICE_STABLE;
    }
    public static DateFormat b(String p0,Locale p1){
       return DateFormat.getInstanceForSkeleton(p0, p1);
    }
    public static DecimalFormatSymbols c(Locale p0){
       return DecimalFormatSymbols.getInstance(p0);
    }
    public static TimeZone d(){
       return TimeZone.getTimeZone("UTC");
    }
    public static LocaleList e(TextPaint p0){
       return p0.getTextLocales();
    }
    public static PointerIcon f(Context p0,int p1){
       return PointerIcon.getSystemIcon(p0, p1);
    }
    public static PointerIcon g(Resources p0,int p1){
       return PointerIcon.load(p0, p1);
    }
    public static PointerIcon h(Bitmap p0,float p1,float p2){
       return PointerIcon.create(p0, p1, p2);
    }
    public static Object i(Optional p0){
       return p0.get();
    }
    public static Object j(Function p0,Object p1){
       return p0.apply(p1);
    }
    public static Object k(Supplier p0){
       return p0.get();
    }
    public static Optional l(Object p0){
       return Optional.ofNullable(p0);
    }
    public static BiConsumer m(Collector p0){
       return p0.accumulator();
    }
    public static Function n(Collector p0){
       return p0.finisher();
    }
    public static Supplier o(Collector p0){
       return p0.supplier();
    }
    public static BaseStream p(Stream p0,jg1 p1){
       return p0.onClose(p1);
    }
    public static IntStream q(Spannable p0){
       return p0.chars();
    }
    public static Stream r(Spliterator p0){
       return StreamSupport.stream(p0, false);
    }
    public static void s(DateFormat p0,TimeZone p1){
       p0.setTimeZone(p1);
    }
    public static void t(ConnectivityManager p0,SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1 p1){
       p0.registerDefaultNetworkCallback(p1);
    }
    public static void u(View p0){
       p0.dispatchStartTemporaryDetach();
    }
    public static void v(View p0,View$DragShadowBuilder p1){
       p0.updateDragShadow(p1);
    }
    public static void w(CompletionStage p0,c82 p1){
       p0.whenComplete(p1);
    }
    public static void x(Stream p0){
       p0.close();
    }
    public static boolean y(UserManager p0){
       return p0.isUserUnlocked();
    }
    public static boolean z(Method p0){
       return p0.isDefault();
    }
}
