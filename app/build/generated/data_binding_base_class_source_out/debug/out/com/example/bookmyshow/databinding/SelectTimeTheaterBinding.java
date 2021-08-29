// Generated by view binder compiler. Do not edit!
package com.example.bookmyshow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bookmyshow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SelectTimeTheaterBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout layoutMovieTime;

  @NonNull
  public final TextView tvShowTime1;

  @NonNull
  public final TextView tvShowTime2;

  @NonNull
  public final TextView tvTheaterName;

  private SelectTimeTheaterBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout layoutMovieTime, @NonNull TextView tvShowTime1,
      @NonNull TextView tvShowTime2, @NonNull TextView tvTheaterName) {
    this.rootView = rootView;
    this.layoutMovieTime = layoutMovieTime;
    this.tvShowTime1 = tvShowTime1;
    this.tvShowTime2 = tvShowTime2;
    this.tvTheaterName = tvTheaterName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SelectTimeTheaterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SelectTimeTheaterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.select_time_theater, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SelectTimeTheaterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.layoutMovieTime;
      LinearLayout layoutMovieTime = ViewBindings.findChildViewById(rootView, id);
      if (layoutMovieTime == null) {
        break missingId;
      }

      id = R.id.tvShowTime1;
      TextView tvShowTime1 = ViewBindings.findChildViewById(rootView, id);
      if (tvShowTime1 == null) {
        break missingId;
      }

      id = R.id.tvShowTime2;
      TextView tvShowTime2 = ViewBindings.findChildViewById(rootView, id);
      if (tvShowTime2 == null) {
        break missingId;
      }

      id = R.id.tvTheaterName;
      TextView tvTheaterName = ViewBindings.findChildViewById(rootView, id);
      if (tvTheaterName == null) {
        break missingId;
      }

      return new SelectTimeTheaterBinding((LinearLayout) rootView, layoutMovieTime, tvShowTime1,
          tvShowTime2, tvTheaterName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
