// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.common.view.CTextView;
import com.loseweight.R;
import com.loseweight.fragments.MeFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMeBinding extends ViewDataBinding {
  @NonNull
  public final Switch SwitchTurnOnWater;

  @NonNull
  public final LinearLayout llGoPremium;

  @NonNull
  public final CTextView tvReminders;

  @Bindable
  protected MeFragment.ClickHandler mHandler;

  protected FragmentMeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Switch SwitchTurnOnWater, LinearLayout llGoPremium, CTextView tvReminders) {
    super(_bindingComponent, _root, _localFieldCount);
    this.SwitchTurnOnWater = SwitchTurnOnWater;
    this.llGoPremium = llGoPremium;
    this.tvReminders = tvReminders;
  }

  public abstract void setHandler(@Nullable MeFragment.ClickHandler handler);

  @Nullable
  public MeFragment.ClickHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentMeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_me, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMeBinding>inflateInternal(inflater, R.layout.fragment_me, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_me, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMeBinding>inflateInternal(inflater, R.layout.fragment_me, null, false, component);
  }

  public static FragmentMeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentMeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMeBinding)bind(component, view, R.layout.fragment_me);
  }
}