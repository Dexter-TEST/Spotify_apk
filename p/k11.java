package p.k11;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.os.LocaleList;
import android.os.storage.StorageVolume;
import android.icu.text.BreakIterator;
import android.widget.PopupWindow;
import android.view.View;
import android.icu.util.ULocale;
import java.util.Locale;
import android.os.UserHandle;
import android.os.storage.StorageManager;
import java.io.File;
import java.lang.String;
import android.text.Spanned;
import android.text.Html;
import java.util.Optional;
import p.ap4;
import java.lang.Object;
import java.util.function.Supplier;
import android.icu.text.DateFormat;
import java.util.Date;
import android.content.Context;
import java.util.stream.Stream;
import java.util.Iterator;
import p.i55;
import java.util.function.Function;
import java.util.Spliterator;
import java.util.Spliterators;
import android.app.usage.NetworkStatsManager;
import android.app.usage.NetworkStatsManager$UsageCallback;
import p.vi4;
import android.os.Handler;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager$NetworkCallback;
import java.util.function.BiConsumer;
import android.app.NotificationManager;

public abstract class k11	// class@001b85 from classes.dex
{

    public static boolean A(Uri p0){
       return DocumentsContract.isTreeUri(p0);
    }
    public static boolean B(LocaleList p0){
       return p0.isEmpty();
    }
    public static boolean C(StorageVolume p0){
       return p0.isRemovable();
    }
    public static boolean D(StorageVolume p0){
       return p0.isEmulated();
    }
    public static int a(BreakIterator p0){
       return p0.next();
    }
    public static int b(LocaleList p0){
       return p0.hashCode();
    }
    public static int c(PopupWindow p0,View p1,int p2,boolean p3){
       return p0.getMaxAvailableHeight(p1, p2, p3);
    }
    public static BreakIterator d(){
       return BreakIterator.getCharacterInstance();
    }
    public static ULocale e(ULocale p0){
       return ULocale.addLikelySubtags(p0);
    }
    public static ULocale f(Locale p0){
       return ULocale.forLocale(p0);
    }
    public static LocaleList g(){
       return LocaleList.getDefault();
    }
    public static UserHandle h(int p0){
       return UserHandle.getUserHandleForUid(p0);
    }
    public static StorageVolume i(StorageManager p0,File p1){
       return p0.getStorageVolume(p1);
    }
    public static Spanned j(String p0){
       return Html.fromHtml(p0, 0);
    }
    public static Object k(Optional p0,ap4 p1){
       return p0.orElseGet(p1);
    }
    public static String l(DateFormat p0,Date p1){
       return p0.format(p1);
    }
    public static String m(ULocale p0){
       return p0.getScript();
    }
    public static String n(LocaleList p0){
       return p0.toString();
    }
    public static String o(StorageVolume p0,Context p1){
       return p0.getDescription(p1);
    }
    public static Iterator p(Stream p0){
       return p0.iterator();
    }
    public static Locale q(LocaleList p0){
       return p0.get(0);
    }
    public static Locale r(LocaleList p0,int p1){
       return p0.get(p1);
    }
    public static Optional s(Optional p0,i55 p1){
       return p0.map(p1);
    }
    public static Spliterator t(Iterator p0){
       return Spliterators.spliteratorUnknownSize(p0, 0);
    }
    public static void u(NetworkStatsManager p0,NetworkStatsManager$UsageCallback p1){
       p0.unregisterUsageCallback(p1);
    }
    public static void v(NetworkStatsManager p0,vi4 p1,Handler p2){
       p0.registerUsageCallback(0, null, 0x186a0, p1, p2);
    }
    public static void w(BreakIterator p0,String p1){
       p0.setText(p1);
    }
    public static void x(ConnectivityManager p0,ConnectivityManager$NetworkCallback p1){
       p0.registerDefaultNetworkCallback(p1);
    }
    public static void y(BiConsumer p0,Object p1,Object p2){
       p0.accept(p1, p2);
    }
    public static boolean z(NotificationManager p0){
       return p0.areNotificationsEnabled();
    }
}
