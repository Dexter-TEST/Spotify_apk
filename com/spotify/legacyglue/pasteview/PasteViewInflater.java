package com.spotify.legacyglue.pasteview.PasteViewInflater;
import p.ii;
import android.content.Context;
import android.util.AttributeSet;
import p.hf;
import java.lang.String;
import android.view.View;
import p.jf;
import androidx.appcompat.widget.AppCompatCheckBox;
import p.lf;
import p.pg;
import p.sg;
import androidx.appcompat.widget.AppCompatImageView;
import p.ug;
import p.xg;
import p.yg;
import p.ah;
import p.mh;
import androidx.appcompat.widget.AppCompatTextView;
import p.gi;
import p.l95;
import java.lang.Object;
import java.util.Map;
import p.k95;
import android.widget.TextView;
import p.hm1;
import p.bc2;

public class PasteViewInflater extends ii	// class@000901 from classes.dex
{

    public void PasteViewInflater(){
       super();
    }
    public hf createAutoCompleteTextView(Context p0,AttributeSet p1){
       hf ohf;
       if ((ohf = this.createView(p0, "AutoCompleteTextView", p1)) == null) {
          ohf = super.createAutoCompleteTextView(p0, p1);
       }
       return ohf;
    }
    public jf createButton(Context p0,AttributeSet p1){
       jf ojf;
       if ((ojf = this.createView(p0, "Button", p1)) == null) {
          ojf = new jf(p0, p1);
       }
       return ojf;
    }
    public AppCompatCheckBox createCheckBox(Context p0,AttributeSet p1){
       AppCompatCheckBox uAppCompatCh;
       if ((uAppCompatCh = this.createView(p0, "CheckBox", p1)) == null) {
          uAppCompatCh = new AppCompatCheckBox(p0, p1);
       }
       return uAppCompatCh;
    }
    public lf createCheckedTextView(Context p0,AttributeSet p1){
       lf olf;
       if ((olf = this.createView(p0, "CheckedTextView", p1)) == null) {
          olf = super.createCheckedTextView(p0, p1);
       }
       return olf;
    }
    public pg createEditText(Context p0,AttributeSet p1){
       pg opg;
       if ((opg = this.createView(p0, "EditText", p1)) == null) {
          opg = new pg(p0, p1);
       }
       return opg;
    }
    public sg createImageButton(Context p0,AttributeSet p1){
       sg osg;
       if ((osg = this.createView(p0, "ImageButton", p1)) == null) {
          osg = new sg(p0, p1);
       }
       return osg;
    }
    public AppCompatImageView createImageView(Context p0,AttributeSet p1){
       AppCompatImageView uAppCompatIm;
       if ((uAppCompatIm = this.createView(p0, "ImageView", p1)) == null) {
          uAppCompatIm = new AppCompatImageView(p0, p1);
       }
       return uAppCompatIm;
    }
    public ug createMultiAutoCompleteTextView(Context p0,AttributeSet p1){
       ug oug;
       if ((oug = this.createView(p0, "MultiAutoCompleteTextView", p1)) == null) {
          oug = new ug(p0, p1);
       }
       return oug;
    }
    public xg createRadioButton(Context p0,AttributeSet p1){
       xg oxg;
       if ((oxg = this.createView(p0, "RadioButton", p1)) == null) {
          oxg = super.createRadioButton(p0, p1);
       }
       return oxg;
    }
    public yg createRatingBar(Context p0,AttributeSet p1){
       yg oyg;
       if ((oyg = this.createView(p0, "RatingBar", p1)) == null) {
          oyg = new yg(p0, p1);
       }
       return oyg;
    }
    public ah createSeekBar(Context p0,AttributeSet p1){
       ah uoah;
       if ((uoah = this.createView(p0, "SeekBar", p1)) == null) {
          uoah = new ah(p0, p1);
       }
       return uoah;
    }
    public mh createSpinner(Context p0,AttributeSet p1){
       mh omh;
       if ((omh = this.createView(p0, "Spinner", p1)) == null) {
          omh = new mh(p0, p1);
       }
       return omh;
    }
    public AppCompatTextView createTextView(Context p0,AttributeSet p1){
       AppCompatTextView uAppCompatTe;
       if ((uAppCompatTe = this.createView(p0, "TextView", p1)) == null) {
          uAppCompatTe = new AppCompatTextView(p0, p1);
       }
       return uAppCompatTe;
    }
    public gi createToggleButton(Context p0,AttributeSet p1){
       gi ogi;
       if ((ogi = this.createView(p0, "ToggleButton", p1)) == null) {
          ogi = super.createToggleButton(p0, p1);
       }
       return ogi;
    }
    public View createView(Context p0,String p1,AttributeSet p2){
       k95 ok95;
       View view;
       if ((ok95 = l95.b.get(p1)) == null) {
          ok95 = l95.a.get(p1);
       }
       if (ok95 == null) {
          view = null;
       }else {
          View view1 = ok95.a(p0, p2, ok95.b());
          if (view1 instanceof TextView && !view1 instanceof hm1) {
             bc2.a(view1, p0);
          }
          view = view1;
       }
       return view;
    }
}
