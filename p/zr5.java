package p.zr5;
import java.util.List;
import java.util.Collections;
import android.view.View;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import p.yq5;
import android.view.ViewParent;
import p.wh7;
import p.dh7;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import java.lang.StringBuilder;
import android.util.Log;
import java.lang.Class;
import p.en6;
import java.lang.Integer;

public abstract class zr5	// class@002f51 from classes.dex
{
    public final View a;
    public WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public zr5 h;
    public zr5 i;
    public int j;
    public ArrayList k;
    public List l;
    public int m;
    public pr5 n;
    public boolean o;
    public int p;
    public int q;
    public RecyclerView r;
    public yq5 s;
    public static final List t;

    static {
       zr5.t = Collections.emptyList();
    }
    public void zr5(View p0){
       super();
       int i = -1;
       this.c = i;
       this.d = i;
       this.e = -1;
       this.f = i;
       this.g = i;
       this.h = null;
       this.i = null;
       this.k = null;
       this.l = null;
       this.m = 0;
       this.n = null;
       this.o = false;
       this.p = 0;
       this.q = i;
       if (p0 == null) {
          throw new IllegalArgumentException("itemView may not be null");
       }
       this.a = p0;
       return;
    }
    public final void a(Object p0){
       int i = 1024;
       if (p0 == null) {
          this.b(i);
       }else if(!((i & this.j))){
          if (this.k == null) {
             ArrayList i1 = new ArrayList();
             this.k = i1;
             this.l = Collections.unmodifiableList(i1);
          }
          this.k.add(p0);
       }
       return;
    }
    public final void b(int p0){
       this.j = p0 | this.j;
    }
    public final int c(){
       zr5 tr;
       if ((tr = this.r) == null) {
          return -1;
       }
       return tr.J(this);
    }
    public final int d(){
       zr5 tr;
       yq5 adapter;
       int i1;
       int i = -1;
       if (this.s == null) {
          return i;
       }
       if ((tr = this.r) == null) {
          return i;
       }
       if ((adapter = tr.getAdapter()) == null) {
          return i;
       }
       if ((i1 = this.r.J(this)) == i) {
          return i;
       }
       return adapter.c(this.s, this, i1);
    }
    public final int e(){
       zr5 tg;
       if ((tg = this.g) == -1) {
          tg = this.c;
       }
       return tg;
    }
    public final List f(){
       zr5 tk;
       if (!((this.j & 0x0400)) && ((tk = this.k) != null && tk.size())) {
          return this.l;
       }
       return zr5.t;
    }
    public final boolean g(){
       zr5 ta = this.a;
       boolean b = (ta.getParent() != null && ta.getParent() != this.r)? true: false;
       return b;
    }
    public final boolean h(){
       int i = 1;
       if ((this.j & i)) {
       }else {
          i = false;
       }
       return i;
    }
    public final boolean i(){
       boolean b = ((this.j & 0x04))? true: false;
       return b;
    }
    public final boolean j(){
       boolean b = (!((this.j & 0x10)) && !dh7.i(this.a))? true: false;
       return b;
    }
    public final boolean k(){
       boolean b = ((this.j & 0x08))? true: false;
       return b;
    }
    public final boolean l(){
       boolean b = (this.n != null)? true: false;
       return b;
    }
    public final boolean m(){
       boolean b = ((this.j & 0x0100))? true: false;
       return b;
    }
    public final void n(int p0,boolean p1){
       if (this.d == -1) {
          this.d = this.c;
       }
       if (this.g == -1) {
          this.g = this.c;
       }
       if (p1) {
          this.g = this.g + p0;
       }
       this.c = this.c + p0;
       zr5 ta = this.a;
       if (ta.getLayoutParams() != null) {
          ta.c = true;
       }
       return;
    }
    public final void o(){
       zr5 tk;
       this.j = 0;
       this.c = -1;
       this.d = -1;
       this.e = -1;
       this.g = -1;
       this.m = 0;
       this.h = null;
       this.i = null;
       if ((tk = this.k) != null) {
          tk.clear();
       }
       this.j = this.j & 0xfbff;
       this.p = 0;
       this.q = -1;
       RecyclerView.k(this);
       return;
    }
    public final void p(boolean p0){
       int i = 1;
       zr5 tm = this.m;
       int i1 = (p0)? tm - i: tm + i;
       this.m = i1;
       if (i1 < 0) {
          this.m = 0;
          Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable\(\) calls for "+this);
       }else if(!p0 && i1 == i){
          this.j = this.j | 0x10;
       }else if(p0 && !i1){
          this.j = this.j & 0xef;
       }
       return;
    }
    public final boolean q(){
       boolean b = ((this.j & 0x0080))? true: false;
       return b;
    }
    public final boolean r(){
       boolean b = ((this.j & 0x20))? true: false;
       return b;
    }
    public String toString(){
       String str = (this.getClass().isAnonymousClass())? "ViewHolder": this.getClass().getSimpleName();
       StringBuilder str1 = en6.s(str, "{")+Integer.toHexString(this.hashCode())+" position="+this.c+" id="+this.e+", oldPos="+this.d+", pLpos:"+this.g;
       if (this.l()) {
          str1 = str1+" scrap ";
          str = (this.o != null)? "[changeScrap]": "[attachedScrap]";
          str1 = str1+str;
       }
       if (this.i()) {
          str1 = str1+" invalid";
       }
       if (!this.h()) {
          str1 = str1+" unbound";
       }
       int i = 1;
       str = ((this.j & 0x02))? 1: 0;
       if (str) {
          str1 = str1+" update";
       }
       if (this.k()) {
          str1 = str1+" removed";
       }
       if (this.q()) {
          str1 = str1+" ignored";
       }
       if (this.m()) {
          str1 = str1+" tmpDetached";
       }
       if (!this.j()) {
          str1 = str1+" not recyclable\("+this.m+"\)";
       }
       if (!((this.j & 0x0200)) && !this.i()) {
          i = 0;
       }
       if (i) {
          str1 = str1+" undefined adapter position";
       }
       if (this.a.getParent() == null) {
          str1 = str1+" no parent";
       }
       return str1+"}";
    }
}
