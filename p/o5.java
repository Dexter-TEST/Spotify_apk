package p.o5;
import p.mw6;
import android.content.Context;
import java.lang.CharSequence;
import java.lang.Object;
import p.m64;
import java.lang.UnsupportedOperationException;
import android.graphics.drawable.Drawable;
import p.eb3;
import android.content.res.ColorStateList;
import p.ce1;
import android.graphics.PorterDuff$Mode;
import android.view.ActionProvider;
import android.view.View;
import android.content.Intent;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.SubMenu;
import android.view.MenuItem;
import java.lang.Character;
import android.view.KeyEvent;
import p.n6;
import p.os0;
import android.view.MenuItem$OnActionExpandListener;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.res.Resources;
import java.lang.String;

public final class o5 implements mw6	// class@0020b6 from classes.dex
{
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public int e;
    public char f;
    public int g;
    public Drawable h;
    public final Context i;
    public CharSequence j;
    public CharSequence k;
    public ColorStateList l;
    public PorterDuff$Mode m;
    public boolean n;
    public boolean o;
    public int p;

    public void o5(Context p0,CharSequence p1){
       super();
       this.e = 4096;
       this.g = 4096;
       this.l = null;
       this.m = null;
       this.n = false;
       this.o = false;
       this.p = 16;
       this.i = p0;
       this.a = p1;
    }
    public final mw6 a(m64 p0){
       throw new UnsupportedOperationException();
    }
    public final m64 b(){
       return null;
    }
    public final void c(){
       o5 th;
       if ((th = this.h) != null && (this.n != null && this.o == null)) {
          Drawable uDrawable = eb3.L(th);
          this.h = uDrawable;
          uDrawable = uDrawable.mutate();
          this.h = uDrawable;
          if (this.n != null) {
             ce1.h(uDrawable, this.l);
          }
          if (this.o != null) {
             ce1.i(this.h, this.m);
          }
       }
       return;
    }
    public final boolean collapseActionView(){
       return false;
    }
    public final boolean expandActionView(){
       return false;
    }
    public final ActionProvider getActionProvider(){
       throw new UnsupportedOperationException();
    }
    public final View getActionView(){
       return null;
    }
    public final int getAlphabeticModifiers(){
       return this.g;
    }
    public final char getAlphabeticShortcut(){
       return this.f;
    }
    public final CharSequence getContentDescription(){
       return this.j;
    }
    public final int getGroupId(){
       return 0;
    }
    public final Drawable getIcon(){
       return this.h;
    }
    public final ColorStateList getIconTintList(){
       return this.l;
    }
    public final PorterDuff$Mode getIconTintMode(){
       return this.m;
    }
    public final Intent getIntent(){
       return this.c;
    }
    public final int getItemId(){
       return 0x102002c;
    }
    public final ContextMenu$ContextMenuInfo getMenuInfo(){
       return null;
    }
    public final int getNumericModifiers(){
       return this.e;
    }
    public final char getNumericShortcut(){
       return this.d;
    }
    public final int getOrder(){
       return 0;
    }
    public final SubMenu getSubMenu(){
       return null;
    }
    public final CharSequence getTitle(){
       return this.a;
    }
    public final CharSequence getTitleCondensed(){
       o5 tb;
       if ((tb = this.b) != null) {
       }else {
          tb = this.a;
       }
       return tb;
    }
    public final CharSequence getTooltipText(){
       return this.k;
    }
    public final boolean hasSubMenu(){
       return false;
    }
    public final boolean isActionViewExpanded(){
       return false;
    }
    public final boolean isCheckable(){
       int i = 1;
       if ((this.p & i)) {
       }else {
          i = false;
       }
       return i;
    }
    public final boolean isChecked(){
       boolean b = ((this.p & 0x02))? true: false;
       return b;
    }
    public final boolean isEnabled(){
       boolean b = ((this.p & 0x10))? true: false;
       return b;
    }
    public final boolean isVisible(){
       boolean b = (!((this.p & 0x08)))? true: false;
       return b;
    }
    public final MenuItem setActionProvider(ActionProvider p0){
       throw new UnsupportedOperationException();
    }
    public final MenuItem setActionView(int p0){
       throw new UnsupportedOperationException();
    }
    public final MenuItem setActionView(View p0){
       throw new UnsupportedOperationException();
    }
    public final MenuItem setAlphabeticShortcut(char p0){
       this.f = Character.toLowerCase(p0);
       return this;
    }
    public final MenuItem setAlphabeticShortcut(char p0,int p1){
       this.f = Character.toLowerCase(p0);
       this.g = KeyEvent.normalizeMetaState(p1);
       return this;
    }
    public final MenuItem setCheckable(boolean p0){
       this.p = p0 | (this.p & 0xfe);
       return this;
    }
    public final MenuItem setChecked(boolean p0){
       int i = this.p & 0xfd;
       int i1 = (p0)? 2: 0;
       this.p = i1 | i;
       return this;
    }
    public final MenuItem setContentDescription(CharSequence p0){
       this.j = p0;
       return this;
    }
    public final mw6 setContentDescription(CharSequence p0){
       this.j = p0;
       return this;
    }
    public final MenuItem setEnabled(boolean p0){
       int i = this.p & 0xef;
       int i1 = (p0)? 16: 0;
       this.p = i1 | i;
       return this;
    }
    public final MenuItem setIcon(int p0){
       this.h = os0.b(this.i, p0);
       this.c();
       return this;
    }
    public final MenuItem setIcon(Drawable p0){
       this.h = p0;
       this.c();
       return this;
    }
    public final MenuItem setIconTintList(ColorStateList p0){
       this.l = p0;
       this.n = true;
       this.c();
       return this;
    }
    public final MenuItem setIconTintMode(PorterDuff$Mode p0){
       this.m = p0;
       this.o = true;
       this.c();
       return this;
    }
    public final MenuItem setIntent(Intent p0){
       this.c = p0;
       return this;
    }
    public final MenuItem setNumericShortcut(char p0){
       this.d = p0;
       return this;
    }
    public final MenuItem setNumericShortcut(char p0,int p1){
       this.d = p0;
       this.e = KeyEvent.normalizeMetaState(p1);
       return this;
    }
    public final MenuItem setOnActionExpandListener(MenuItem$OnActionExpandListener p0){
       throw new UnsupportedOperationException();
    }
    public final MenuItem setOnMenuItemClickListener(MenuItem$OnMenuItemClickListener p0){
       return this;
    }
    public final MenuItem setShortcut(char p0,char p1){
       this.d = p0;
       this.f = Character.toLowerCase(p1);
       return this;
    }
    public final MenuItem setShortcut(char p0,char p1,int p2,int p3){
       this.d = p0;
       this.e = KeyEvent.normalizeMetaState(p2);
       this.f = Character.toLowerCase(p1);
       this.g = KeyEvent.normalizeMetaState(p3);
       return this;
    }
    public final void setShowAsAction(int p0){
    }
    public final MenuItem setShowAsActionFlags(int p0){
       return this;
    }
    public final MenuItem setTitle(int p0){
       this.a = this.i.getResources().getString(p0);
       return this;
    }
    public final MenuItem setTitle(CharSequence p0){
       this.a = p0;
       return this;
    }
    public final MenuItem setTitleCondensed(CharSequence p0){
       this.b = p0;
       return this;
    }
    public final MenuItem setTooltipText(CharSequence p0){
       this.k = p0;
       return this;
    }
    public final mw6 setTooltipText(CharSequence p0){
       this.k = p0;
       return this;
    }
    public final MenuItem setVisible(boolean p0){
       int i = 8;
       int i1 = this.p & i;
       if (p0) {
          i = 0;
       }
       this.p = i1 | i;
       return this;
    }
}
