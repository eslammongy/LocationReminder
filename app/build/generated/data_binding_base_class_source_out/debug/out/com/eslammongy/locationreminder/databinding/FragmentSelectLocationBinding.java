// Generated by data binding compiler. Do not edit!
package com.eslammongy.locationreminder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.eslammongy.locationreminder.R;
import com.eslammongy.locationreminder.locationreminders.savereminder.SaveReminderViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSelectLocationBinding extends ViewDataBinding {
  @NonNull
  public final Button button;

  @Bindable
  protected SaveReminderViewModel mViewModel;

  protected FragmentSelectLocationBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button button) {
    super(_bindingComponent, _root, _localFieldCount);
    this.button = button;
  }

  public abstract void setViewModel(@Nullable SaveReminderViewModel viewModel);

  @Nullable
  public SaveReminderViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSelectLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_select_location, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSelectLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSelectLocationBinding>inflateInternal(inflater, R.layout.fragment_select_location, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSelectLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_select_location, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSelectLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSelectLocationBinding>inflateInternal(inflater, R.layout.fragment_select_location, null, false, component);
  }

  public static FragmentSelectLocationBinding bind(@NonNull View view) {
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
  public static FragmentSelectLocationBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSelectLocationBinding)bind(component, view, R.layout.fragment_select_location);
  }
}