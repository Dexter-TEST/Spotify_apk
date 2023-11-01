package p.gb0;
import p.ib0;
import p.d51;
import p.la0;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.lang.String;
import p.up0;
import p.hr0;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.ta0;
import p.xb5;
import p.za0;
import java.lang.Object;
import androidx.fragment.app.f;
import android.os.Bundle;
import p.db0;
import java.util.Objects;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.Window;
import android.app.Dialog;
import android.view.WindowManager$LayoutParams;
import java.lang.IllegalStateException;
import android.os.BaseBundle;
import java.util.ArrayList;
import java.lang.Class;
import p.o11;
import java.util.Collection;
import p.ur6;
import p.hi7;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.co5;
import p.ir2;
import p.yf2;
import p.fn0;
import io.reactivex.rxjava3.core.Scheduler;
import p.hb0;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import android.content.Context;
import android.content.res.ColorStateList;
import p.n6;
import android.graphics.drawable.Drawable;
import p.uw5;
import p.eb3;
import p.ce1;
import p.or6;
import android.util.AttributeSet;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import p.sg;
import androidx.appcompat.widget.SearchView;
import p.eb0;
import p.n86;
import p.jm7;
import android.view.View$OnClickListener;
import p.lp6;
import p.sp6;
import android.content.res.Resources;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p.hr5;
import p.yq5;

public class gb0 extends d51 implements ib0	// class@0016d4 from classes.dex
{
    public o11 I;
    public db0 J;
    public LinearLayoutManager K;
    public EditText L;
    public up0 M;

    public void gb0(){
       super();
    }
    public final void C(la0 p0){
       gb0 tM;
       if (p0 != null && (tM = this.M) != null) {
          tM.b.accept(new xb5(new ta0(new CallingCode(p0.a, p0.b))));
       }
       this.v(false, false);
       return;
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.z(2, R.style.Theme.Lite.CallingCodePickerDialog);
       gb0 tI = this.I;
       Objects.requireNonNull(tI);
       this.J = new db0(new up0(15, tI));
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.calling_code_picker, p1, false);
    }
    public final void onResume(){
       f tC;
       Window window;
       super.onResume();
       if ((tC = this.C) == null) {
          throw new IllegalStateException();
       }
       if ((window = tC.getWindow()) == null) {
          throw new IllegalStateException();
       }
       WindowManager$LayoutParams attributes = window.getAttributes();
       attributes.width = -1;
       attributes.height = -1;
       window.setAttributes(attributes);
       this.L.requestFocus();
       return;
    }
    public final void onStart(){
       Bundle arguments;
       String str;
       ArrayList parcelableAr;
       Single single;
       super.onStart();
       if ((arguments = this.getArguments()) != null) {
          str = arguments.getString("ARG_COUNTRY_CODE");
          parcelableAr = arguments.getParcelableArrayList("ARG_CALLING_CODES");
       }else {
          str = null;
          parcelableAr = str;
       }
       gb0 tI = this.I;
       tI.getClass();
       tI.v = this;
       tI.w = str;
       int i = 0;
       int i1 = (parcelableAr != null && !parcelableAr.isEmpty())? 0: 1;
       if (i1) {
          o11 b = tI.b;
          b.getClass();
          single = Single.fromCallable(new hi7(4, b));
          co5.l(single, "get\(\) = Single.fromCalla…shi, CALLING_CODES_XML\) }");
          single = single.map(ir2.Q);
          co5.l(single, "list.map { callingCodes:…untryName\(callingCodes\) }");
       }else {
          single = Single.just(parcelableAr);
          co5.l(single, "{\n            Single.just\(callingCodes\)\n        }");
       }
       tI.t.c(single.observeOn(tI.c).subscribe(new hb0(tI, i), new hb0(tI, 1)));
       return;
    }
    public final void onStop(){
       this.I.q();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       Context context = p0.getContext();
       int[][] ointArray = new int[][2];
       int[] ointArray1 = new int[]{0x10100a7};
       ointArray[0] = ointArray1;
       ointArray1 = new int[0];
       ointArray[1] = ointArray1;
       int[] ointArray2 = new int[]{n6.b(context, R.color.opacity_black_30),n6.b(context, R.color.black)};
       ColorStateList uColorStateL = new ColorStateList(ointArray, ointArray2);
       Drawable uDrawable = eb3.L(uw5.m(context, 0x101030b));
       ce1.h(uDrawable, uColorStateL);
       or6 ointArray3 = new or6(context, null, 0x7f030490);
       ointArray3.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       ointArray3.setImageDrawable(uDrawable);
       SearchView searchView = p0.findViewById(R.id.search_view);
       searchView.setOnQueryTextListener(new eb0(this));
       ImageView imageView = searchView.findViewById(R.id.search_mag_icon);
       imageView.setImageDrawable(uDrawable);
       imageView.setOnClickListener(new jm7(5, this));
       lp6 uDrawable1 = new lp6(context, sp6.q0, (float)context.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
       uDrawable1.c(uColorStateL);
       searchView.findViewById(R.id.search_close_btn).setImageDrawable(uDrawable1);
       EditText uEditText = searchView.findViewById(R.id.search_src_text);
       this.L = uEditText;
       uEditText.setTextColor(uw5.l(context, R.attr.pasteColorTextPrimary));
       this.L.setHintTextColor(uw5.l(context, R.attr.pasteColorTextSecondary));
       this.requireContext();
       this.K = new LinearLayoutManager(1);
       RecyclerView recyclerView = p0.findViewById(R.id.recycler_view);
       recyclerView.getClass();
       recyclerView.setLayoutManager(this.K);
       recyclerView.setAdapter(this.J);
    }
}
