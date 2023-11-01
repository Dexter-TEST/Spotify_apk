package p.r64;
import android.view.MenuItem;
import p.uy;
import android.content.Context;
import p.mw6;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.ActionProvider;
import p.m64;
import android.view.View;
import p.o64;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.content.Intent;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.SubMenu;
import p.n64;
import android.view.CollapsibleActionView;
import android.view.MenuItem$OnActionExpandListener;
import p.p64;
import android.view.MenuItem$OnMenuItemClickListener;
import p.q64;

public final class r64 extends uy implements MenuItem	// class@002486 from classes.dex
{
    public final mw6 d;
    public Method e;

    public void r64(Context p0,mw6 p1){
       super(p0);
       if (p1 == null) {
          throw new IllegalArgumentException("Wrapped Object can not be null.");
       }
       this.d = p1;
       return;
    }
    public final boolean collapseActionView(){
       return this.d.collapseActionView();
    }
    public final boolean expandActionView(){
       return this.d.expandActionView();
    }
    public final ActionProvider getActionProvider(){
       m64 om64 = this.d.b();
       if (om64 instanceof m64) {
          return om64.a;
       }
       return null;
    }
    public final View getActionView(){
       View actionView = this.d.getActionView();
       if (actionView instanceof o64) {
          actionView = actionView.a;
       }
       return actionView;
    }
    public final int getAlphabeticModifiers(){
       return this.d.getAlphabeticModifiers();
    }
    public final char getAlphabeticShortcut(){
       return this.d.getAlphabeticShortcut();
    }
    public final CharSequence getContentDescription(){
       return this.d.getContentDescription();
    }
    public final int getGroupId(){
       return this.d.getGroupId();
    }
    public final Drawable getIcon(){
       return this.d.getIcon();
    }
    public final ColorStateList getIconTintList(){
       return this.d.getIconTintList();
    }
    public final PorterDuff$Mode getIconTintMode(){
       return this.d.getIconTintMode();
    }
    public final Intent getIntent(){
       return this.d.getIntent();
    }
    public final int getItemId(){
       return this.d.getItemId();
    }
    public final ContextMenu$ContextMenuInfo getMenuInfo(){
       return this.d.getMenuInfo();
    }
    public final int getNumericModifiers(){
       return this.d.getNumericModifiers();
    }
    public final char getNumericShortcut(){
       return this.d.getNumericShortcut();
    }
    public final int getOrder(){
       return this.d.getOrder();
    }
    public final SubMenu getSubMenu(){
       return this.d.getSubMenu();
    }
    public final CharSequence getTitle(){
       return this.d.getTitle();
    }
    public final CharSequence getTitleCondensed(){
       return this.d.getTitleCondensed();
    }
    public final CharSequence getTooltipText(){
       return this.d.getTooltipText();
    }
    public final boolean hasSubMenu(){
       return this.d.hasSubMenu();
    }
    public final boolean isActionViewExpanded(){
       return this.d.isActionViewExpanded();
    }
    public final boolean isCheckable(){
       return this.d.isCheckable();
    }
    public final boolean isChecked(){
       return this.d.isChecked();
    }
    public final boolean isEnabled(){
       return this.d.isEnabled();
    }
    public final boolean isVisible(){
       return this.d.isVisible();
    }
    public final MenuItem setActionProvider(ActionProvider p0){
       n64 on64 = new n64(this, p0);
       if (p0 != null) {
       }else {
          on64 = null;
       }
       this.d.a(on64);
       return this;
    }
    public final MenuItem setActionView(int p0){
       r64 td = this.d;
       td.setActionView(p0);
       View actionView = td.getActionView();
       if (actionView instanceof CollapsibleActionView) {
          td.setActionView(new o64(actionView));
       }
       return this;
    }
    public final MenuItem setActionView(View p0){
       o64 oo64;
       if (p0 instanceof CollapsibleActionView) {
          oo64 = new o64(p0);
       }
       this.d.setActionView(oo64);
       return this;
    }
    public final MenuItem setAlphabeticShortcut(char p0){
       this.d.setAlphabeticShortcut(p0);
       return this;
    }
    public final MenuItem setAlphabeticShortcut(char p0,int p1){
       this.d.setAlphabeticShortcut(p0, p1);
       return this;
    }
    public final MenuItem setCheckable(boolean p0){
       this.d.setCheckable(p0);
       return this;
    }
    public final MenuItem setChecked(boolean p0){
       this.d.setChecked(p0);
       return this;
    }
    public final MenuItem setContentDescription(CharSequence p0){
       this.d.setContentDescription(p0);
       return this;
    }
    public final MenuItem setEnabled(boolean p0){
       this.d.setEnabled(p0);
       return this;
    }
    public final MenuItem setIcon(int p0){
       this.d.setIcon(p0);
       return this;
    }
    public final MenuItem setIcon(Drawable p0){
       this.d.setIcon(p0);
       return this;
    }
    public final MenuItem setIconTintList(ColorStateList p0){
       this.d.setIconTintList(p0);
       return this;
    }
    public final MenuItem setIconTintMode(PorterDuff$Mode p0){
       this.d.setIconTintMode(p0);
       return this;
    }
    public final MenuItem setIntent(Intent p0){
       this.d.setIntent(p0);
       return this;
    }
    public final MenuItem setNumericShortcut(char p0){
       this.d.setNumericShortcut(p0);
       return this;
    }
    public final MenuItem setNumericShortcut(char p0,int p1){
       this.d.setNumericShortcut(p0, p1);
       return this;
    }
    public final MenuItem setOnActionExpandListener(MenuItem$OnActionExpandListener p0){
       p64 op64 = (p0 != null)? new p64(this, p0): null;
       this.d.setOnActionExpandListener(op64);
       return this;
    }
    public final MenuItem setOnMenuItemClickListener(MenuItem$OnMenuItemClickListener p0){
       q64 oq64 = (p0 != null)? new q64(this, p0): null;
       this.d.setOnMenuItemClickListener(oq64);
       return this;
    }
    public final MenuItem setShortcut(char p0,char p1){
       this.d.setShortcut(p0, p1);
       return this;
    }
    public final MenuItem setShortcut(char p0,char p1,int p2,int p3){
       this.d.setShortcut(p0, p1, p2, p3);
       return this;
    }
    public final void setShowAsAction(int p0){
       this.d.setShowAsAction(p0);
    }
    public final MenuItem setShowAsActionFlags(int p0){
       this.d.setShowAsActionFlags(p0);
       return this;
    }
    public final MenuItem setTitle(int p0){
       this.d.setTitle(p0);
       return this;
    }
    public final MenuItem setTitle(CharSequence p0){
       this.d.setTitle(p0);
       return this;
    }
    public final MenuItem setTitleCondensed(CharSequence p0){
       this.d.setTitleCondensed(p0);
       return this;
    }
    public final MenuItem setTooltipText(CharSequence p0){
       this.d.setTooltipText(p0);
       return this;
    }
    public final MenuItem setVisible(boolean p0){
       return this.d.setVisible(p0);
    }
}
