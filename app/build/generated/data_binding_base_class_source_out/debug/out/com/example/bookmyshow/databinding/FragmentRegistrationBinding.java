// Generated by view binder compiler. Do not edit!
package com.example.bookmyshow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bookmyshow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRegistrationBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnNextContact;

  @NonNull
  public final EditText etContact;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etName;

  private FragmentRegistrationBinding(@NonNull RelativeLayout rootView,
      @NonNull Button btnNextContact, @NonNull EditText etContact, @NonNull EditText etEmail,
      @NonNull EditText etName) {
    this.rootView = rootView;
    this.btnNextContact = btnNextContact;
    this.etContact = etContact;
    this.etEmail = etEmail;
    this.etName = etName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_registration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRegistrationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnNextContact;
      Button btnNextContact = ViewBindings.findChildViewById(rootView, id);
      if (btnNextContact == null) {
        break missingId;
      }

      id = R.id.etContact;
      EditText etContact = ViewBindings.findChildViewById(rootView, id);
      if (etContact == null) {
        break missingId;
      }

      id = R.id.etEmail;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.etName;
      EditText etName = ViewBindings.findChildViewById(rootView, id);
      if (etName == null) {
        break missingId;
      }

      return new FragmentRegistrationBinding((RelativeLayout) rootView, btnNextContact, etContact,
          etEmail, etName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
