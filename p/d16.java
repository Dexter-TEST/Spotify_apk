package p.d16;
import p.yf2;
import java.lang.String;
import java.lang.Object;
import com.spotify.login.signupapi.services.model.PasswordValidationResponse;
import com.spotify.login.signupapi.services.model.PasswordValidationResponse$PasswordValidation;
import com.spotify.login.signupapi.services.model.PasswordValidationResponse$PasswordValidation$Error;
import java.util.Map;
import p.te5;
import p.sf7;
import p.tf7;
import java.lang.Throwable;
import p.t66;
import p.b43;
import p.v66;
import com.spotify.playlist4.proto.Playlist4ApiProto$CreateListReply;
import p.ce7;
import p.c01;
import p.ss;
import java.lang.NullPointerException;
import com.spotify.litenetwork.webapi.model.RecommendedGenres;
import com.google.common.collect.c;
import p.w51;
import java.util.List;
import p.lm;
import android.os.Bundle;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import p.do5;
import java.util.Arrays;
import p.ys5;
import java.lang.Iterable;
import io.reactivex.rxjava3.core.Observable;
import p.x7;
import p.d73;
import p.aq6;
import p.td7;
import java.lang.Enum;
import p.ql;
import p.a73;
import p.rl;
import p.bn;
import com.spotify.litenetwork.webapi.model.RecommendedTracks;
import p.an;
import p.so3;
import p.o11;
import p.ks0;
import p.j8;
import p.gt0;
import p.ab2;
import p.rp;
import p.jg2;
import java.util.Collection;
import p.jj5;
import java.lang.Class;
import p.tr;
import p.rr;
import p.r45;
import com.spotify.connectivity.productstateesperanto.RxProductStateImpl;
import com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse;
import com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse$Status;
import com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse$Status$Error;

public final class d16 implements yf2	// class@0012bd from classes.dex
{
    public final int a;
    public final String b;

    public void d16(String p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       aq6 uoaq6;
       int i;
       x7 c;
       Bundle uBundle;
       sf7 osf7;
       String str = "spotify.fragment.argument.PLAYLIST_URI";
       d16 tb = this.b;
       switch (this.a){
           case 0:
             return RxProductStateImpl.a(tb, p0);
           case 1:
             return RxProductStateImpl.c(tb, p0);
           case 2:
             o11 oo11 = ks0.a(tb);
             j8 oj8 = gt0.a();
             p0 = c.o(ab2.b(p0).m(new rp(13)).d());
             p0.getClass();
             oj8.t = new jj5(p0);
             p0 = c.r(oj8.d());
             p0.getClass();
             oo11.v = new jj5(p0);
             return oo11.d();
           case 3:
             if ((p0 = p0.b) != null && !p0.isEmpty()) {
                p0 = new Bundle();
                p0.putString(str, tb);
                an uoan = new an();
                uoan.setArguments(p0);
                p0 = Observable.just(uoan);
             }else {
                p0 = Observable.empty();
             }
             return p0;
             break;
           case 4:
             d73 uod73 = new d73();
             if ((uoaq6 = td7.d(p0.c)) != null) {
                i = uoaq6.b.ordinal();
                c = p0.c;
                if (i != 1) {
                   if (i == 3) {
                      uBundle = new Bundle();
                      uBundle.putString(str, tb);
                      uBundle.putString("spotify.fragment.argument.ALBUM_URI", c);
                      ql oql = new ql();
                      oql.setArguments(uBundle);
                      uod73.D0(oql);
                   }
                }else {
                   uBundle = new Bundle();
                   uBundle.putString(str, tb);
                   uBundle.putString("spotify.fragment.argument.ARTIST_URI", c);
                   rl orl = new rl();
                   orl.setArguments(uBundle);
                   uod73.D0(orl);
                }
             }
             uBundle = new Bundle();
             uBundle.putString(str, tb);
             uBundle.putString("spotify.fragment.argument.TRACK_URI", p0.b);
             p0 = new bn();
             p0.setArguments(uBundle);
             uod73.D0(p0);
             return Observable.fromIterable(uod73.I0());
             break;
           case 5:
             w51.h(4, "initialCapacity");
             Object[] objArray = new Object[4];
             i = 0;
             int i1 = 0;
             while (i < p0.a.size()) {
                Bundle uBundle1 = new Bundle();
                uBundle1.putString(str, tb);
                uBundle1.putInt("spotify.fragment.argument.GENRE_INDEX", i);
                lm olm = new lm();
                olm.setArguments(uBundle1);
                int i2 = i1 + 1;
                if (objArray.length < i2) {
                   objArray = Arrays.copyOf(objArray, do5.t(objArray.length, i2));
                }
                objArray[i1] = olm;
                i = i + 1;
                i1 = i2;
             }
             return Observable.fromIterable(c.m(i1, objArray));
             break;
           case 7:
             ce7 uoce7 = new ce7(null);
             if (tb != null) {
                uoce7.a = tb;
                uoce7.b = c01.e(p0);
                uoce7.c = c01.e(p0);
                return uoce7.i();
             }else {
                throw new NullPointerException("Null name");
             }
             break;
           case 8:
             return new v66(p0, tb);
           case 9:
             return new t66(tb, p0);
           case 10:
             if (p0.getStatus() instanceof PasswordValidationResponse$PasswordValidation$Error) {
                p0 = p0.getStatus().getErrors().get("password");
                osf7 = (!te5.a(p0))? new sf7(tb, p0): new sf7(tb, "");
             }else {
                tf7 otf7 = new tf7(tb);
             }
             return osf7;
             break;
           default:
             if (p0.getStatus() instanceof EmailValidationAndDisplayNameSuggestionResponse$Status$Error) {
                p0 = p0.getStatus().getErrors().get("email");
                if (!te5.a(p0)) {
                   osf7 = new sf7(tb, p0);
                label_01e2 :
                   return osf7;
                }
             }
             osf7 = new tf7(tb);
             goto label_01e2 ;
       }
    }
}
