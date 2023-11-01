package p.io6;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import java.lang.CharSequence;
import java.util.ArrayList;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Object;
import p.ho6;
import java.util.concurrent.atomic.AtomicInteger;
import android.text.Editable;
import java.lang.Appendable;
import java.lang.reflect.Array;

public final class io6 extends SpannableStringBuilder	// class@0019d5 from classes.dex
{
    public final Class a;
    public final ArrayList b;

    public void io6(Class p0,CharSequence p1){
       super(p1);
       this.b = new ArrayList();
       if (p0 == null) {
          throw new NullPointerException("watcherClass cannot be null");
       }
       this.a = p0;
       return;
    }
    public void io6(Class p0,CharSequence p1,int p2,int p3){
       super(p1, p2, p3);
       this.b = new ArrayList();
       if (p0 == null) {
          throw new NullPointerException("watcherClass cannot be null");
       }
       this.a = p0;
       return;
    }
    public final void a(){
       int i = 0;
       while (true) {
          io6 tb = this.b;
          if (i < tb.size()) {
             tb.get(i).b.incrementAndGet();
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public final Editable append(char p0){
       super.append(p0);
       return this;
    }
    public final Editable append(CharSequence p0){
       super.append(p0);
       return this;
    }
    public final Editable append(CharSequence p0,int p1,int p2){
       super.append(p0, p1, p2);
       return this;
    }
    public final SpannableStringBuilder append(char p0){
       super.append(p0);
       return this;
    }
    public final SpannableStringBuilder append(CharSequence p0){
       super.append(p0);
       return this;
    }
    public final SpannableStringBuilder append(CharSequence p0,int p1,int p2){
       super.append(p0, p1, p2);
       return this;
    }
    public final SpannableStringBuilder append(CharSequence p0,Object p1,int p2){
       super.append(p0, p1, p2);
       return this;
    }
    public final Appendable append(char p0){
       super.append(p0);
       return this;
    }
    public final Appendable append(CharSequence p0){
       super.append(p0);
       return this;
    }
    public final Appendable append(CharSequence p0,int p1,int p2){
       super.append(p0, p1, p2);
       return this;
    }
    public final void b(){
       this.e();
       int i = 0;
       while (true) {
          io6 tb = this.b;
          if (i < tb.size()) {
             tb.get(i).onTextChanged(this, 0, this.length(), this.length());
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public final ho6 c(Object p0){
       ho6 oho6;
       int i = 0;
       while (true) {
          io6 tb = this.b;
          if (i >= tb.size()) {
             return null;
          }
          oho6 = tb.get(i);
          if (oho6.a == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oho6;
    }
    public final boolean d(Object p0){
       boolean b = false;
       if (p0 != null) {
          int i = (this.a == p0.getClass())? 1: 0;
          if (i) {
             b = true;
          }
       }
       return b;
    }
    public final Editable delete(int p0,int p1){
       super.delete(p0, p1);
       return this;
    }
    public final SpannableStringBuilder delete(int p0,int p1){
       super.delete(p0, p1);
       return this;
    }
    public final void e(){
       int i = 0;
       while (true) {
          io6 tb = this.b;
          if (i < tb.size()) {
             tb.get(i).b.decrementAndGet();
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public final int getSpanEnd(Object p0){
       ho6 oho6;
       if (this.d(p0) && (oho6 = this.c(p0)) != null) {
          p0 = oho6;
       }
       return super.getSpanEnd(p0);
    }
    public final int getSpanFlags(Object p0){
       ho6 oho6;
       if (this.d(p0) && (oho6 = this.c(p0)) != null) {
          p0 = oho6;
       }
       return super.getSpanFlags(p0);
    }
    public final int getSpanStart(Object p0){
       ho6 oho6;
       if (this.d(p0) && (oho6 = this.c(p0)) != null) {
          p0 = oho6;
       }
       return super.getSpanStart(p0);
    }
    public final Object[] getSpans(int p0,int p1,Class p2){
       int i = 0;
       int i1 = (this.a == p2)? 1: 0;
       if (i1) {
          ho6[] spans = super.getSpans(p0, p1, ho6.class);
          Object[] objArray = Array.newInstance(p2, spans.length);
          for (; i < spans.length; i = i + 1) {
             objArray[i] = spans[i].a;
          }
          return objArray;
       }else {
          return super.getSpans(p0, p1, p2);
       }
    }
    public final Editable insert(int p0,CharSequence p1){
       super.insert(p0, p1);
       return this;
    }
    public final Editable insert(int p0,CharSequence p1,int p2,int p3){
       super.insert(p0, p1, p2, p3);
       return this;
    }
    public final SpannableStringBuilder insert(int p0,CharSequence p1){
       super.insert(p0, p1);
       return this;
    }
    public final SpannableStringBuilder insert(int p0,CharSequence p1,int p2,int p3){
       super.insert(p0, p1, p2, p3);
       return this;
    }
    public final int nextSpanTransition(int p0,int p1,Class p2){
       ho6 oho6;
       if (p2 != null) {
          int i = (this.a == p2)? 1: 0;
          if (!i) {
          label_000d :
             return super.nextSpanTransition(p0, p1, oho6);
          }
       }
       oho6 = ho6.class;
       goto label_000d ;
    }
    public final void removeSpan(Object p0){
       ho6 oho6;
       if (this.d(p0)) {
          if ((oho6 = this.c(p0)) != null) {
             p0 = oho6;
          }
       }else {
          oho6 = null;
       }
       super.removeSpan(p0);
       if (oho6 != null) {
          this.b.remove(oho6);
       }
       return;
    }
    public final Editable replace(int p0,int p1,CharSequence p2){
       this.replace(p0, p1, p2);
       return this;
    }
    public final Editable replace(int p0,int p1,CharSequence p2,int p3,int p4){
       this.replace(p0, p1, p2, p3, p4);
       return this;
    }
    public final SpannableStringBuilder replace(int p0,int p1,CharSequence p2){
       this.a();
       super.replace(p0, p1, p2);
       this.e();
       return this;
    }
    public final SpannableStringBuilder replace(int p0,int p1,CharSequence p2,int p3,int p4){
       this.a();
       super.replace(p0, p1, p2, p3, p4);
       this.e();
       return this;
    }
    public final void setSpan(Object p0,int p1,int p2,int p3){
       if (this.d(p0)) {
          ho6 oho6 = new ho6(p0);
          this.b.add(oho6);
          p0 = oho6;
       }
       super.setSpan(p0, p1, p2, p3);
       return;
    }
    public final CharSequence subSequence(int p0,int p1){
       return new io6(this.a, this, p0, p1);
    }
}
