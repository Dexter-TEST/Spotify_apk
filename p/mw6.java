package p.mw6;
import android.view.MenuItem;
import p.m64;
import android.view.View;
import java.lang.CharSequence;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public interface abstract mw6 implements MenuItem	// class@001f1d from classes.dex
{

    mw6 a(m64 p0);
    m64 b();
    boolean collapseActionView();
    boolean expandActionView();
    View getActionView();
    int getAlphabeticModifiers();
    CharSequence getContentDescription();
    ColorStateList getIconTintList();
    PorterDuff$Mode getIconTintMode();
    int getNumericModifiers();
    CharSequence getTooltipText();
    boolean isActionViewExpanded();
    MenuItem setActionView(int p0);
    MenuItem setActionView(View p0);
    MenuItem setAlphabeticShortcut(char p0,int p1);
    mw6 setContentDescription(CharSequence p0);
    MenuItem setIconTintList(ColorStateList p0);
    MenuItem setIconTintMode(PorterDuff$Mode p0);
    MenuItem setNumericShortcut(char p0,int p1);
    MenuItem setShortcut(char p0,char p1,int p2,int p3);
    void setShowAsAction(int p0);
    MenuItem setShowAsActionFlags(int p0);
    mw6 setTooltipText(CharSequence p0);
}
