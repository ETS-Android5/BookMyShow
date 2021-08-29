// Generated by view binder compiler. Do not edit!
package com.example.bookmyshow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.borjabravo.readmoretextview.ReadMoreTextView;
import com.example.bookmyshow.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBookMovieTicketBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final YouTubePlayerView activityMainYoutubePlayerView;

  @NonNull
  public final Button btnBookTicket;

  @NonNull
  public final ReadMoreTextView text2;

  @NonNull
  public final TextView tvFilmyPass;

  @NonNull
  public final TextView tvRating;

  private ActivityBookMovieTicketBinding(@NonNull RelativeLayout rootView,
      @NonNull YouTubePlayerView activityMainYoutubePlayerView, @NonNull Button btnBookTicket,
      @NonNull ReadMoreTextView text2, @NonNull TextView tvFilmyPass, @NonNull TextView tvRating) {
    this.rootView = rootView;
    this.activityMainYoutubePlayerView = activityMainYoutubePlayerView;
    this.btnBookTicket = btnBookTicket;
    this.text2 = text2;
    this.tvFilmyPass = tvFilmyPass;
    this.tvRating = tvRating;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBookMovieTicketBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBookMovieTicketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_book_movie_ticket, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBookMovieTicketBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity_main_youtubePlayerView;
      YouTubePlayerView activityMainYoutubePlayerView = ViewBindings.findChildViewById(rootView, id);
      if (activityMainYoutubePlayerView == null) {
        break missingId;
      }

      id = R.id.btnBookTicket;
      Button btnBookTicket = ViewBindings.findChildViewById(rootView, id);
      if (btnBookTicket == null) {
        break missingId;
      }

      id = R.id.text2;
      ReadMoreTextView text2 = ViewBindings.findChildViewById(rootView, id);
      if (text2 == null) {
        break missingId;
      }

      id = R.id.tvFilmyPass;
      TextView tvFilmyPass = ViewBindings.findChildViewById(rootView, id);
      if (tvFilmyPass == null) {
        break missingId;
      }

      id = R.id.tvRating;
      TextView tvRating = ViewBindings.findChildViewById(rootView, id);
      if (tvRating == null) {
        break missingId;
      }

      return new ActivityBookMovieTicketBinding((RelativeLayout) rootView,
          activityMainYoutubePlayerView, btnBookTicket, text2, tvFilmyPass, tvRating);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
