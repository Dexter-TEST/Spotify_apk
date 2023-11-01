package p.k10;
import p.d51;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import androidx.fragment.app.f;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import android.widget.DatePicker;
import p.ic;
import java.lang.Class;
import java.lang.Object;
import java.lang.System;
import java.util.Calendar;
import java.lang.String;
import java.io.Serializable;
import android.widget.Button;
import p.i10;
import android.view.View$OnClickListener;

public class k10 extends d51	// class@001b84 from classes.dex
{
    public zg0 I;
    public j10 J;
    public DatePicker K;
    public static final int L;

    public void k10(){
       super();
    }
    public static void C(LinearLayout p0){
       int i = (p0.getChildCount() > 1)? 1: 0;
       View childAt = p0.getChildAt(i);
       if (childAt instanceof EditText) {
          childAt.setTextSize(1, 14.00f);
       }
       return;
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.z(2, R.style.SignUpDialogFragment);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.signup_datepicker_dialog, p1, false);
    }
    public final void onViewCreated(View p0,Bundle p1){
       Bundle arguments;
       Calendar serializable;
       LinearLayout linearLayout1;
       super.onViewCreated(p0, p1);
       DatePicker uDatePicker = p0.findViewById(R.id.datepicker);
       this.K = uDatePicker;
       this.I.getClass();
       uDatePicker.setMaxDate(System.currentTimeMillis());
       this.I.getClass();
       Calendar instance = Calendar.getInstance();
       instance.add(1, -10);
       if ((arguments = this.getArguments()) != null && (serializable = arguments.getSerializable("ARG_DATE")) != null) {
          instance = serializable;
       }
       int i = 2;
       this.K.updateDate(instance.get(1), instance.get(i), instance.get(5));
       View childAt = this.K.getChildAt(0);
       LinearLayout linearLayout = null;
       if (childAt instanceof LinearLayout) {
       }else {
          linearLayout1 = linearLayout;
       }
       if (childAt != null) {
          childAt = childAt.getChildAt(0);
          if (childAt instanceof LinearLayout) {
          }else {
             linearLayout1 = linearLayout;
          }
          if (childAt != null) {
             View childAt1 = childAt.getChildAt(0);
             if (childAt1 instanceof LinearLayout) {
             }else {
                childAt1 = linearLayout;
             }
             View childAt2 = childAt.getChildAt(1);
             if (childAt2 instanceof LinearLayout) {
             }else {
                childAt2 = linearLayout;
             }
             childAt = childAt.getChildAt(i);
             if (childAt instanceof LinearLayout) {
                linearLayout = childAt;
             }
             if (childAt1 != null && (childAt2 != null && linearLayout != null)) {
                k10.C(childAt1);
                k10.C(childAt2);
                k10.C(linearLayout);
             }
          }
       }
       p0.findViewById(R.id.signup_datepicker_ok).setOnClickListener(new i10(this, 0));
       p0.findViewById(R.id.signup_datepicker_cancel).setOnClickListener(new i10(this, 1));
       return;
    }
}
