// Generated by view binder compiler. Do not edit!
package com.example.coursawy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.coursawy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTestsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button backBtn;

  @NonNull
  public final ImageView backIv;

  @NonNull
  public final TextView counterTv;

  @NonNull
  public final TextView equestionTv;

  @NonNull
  public final RadioButton eradioFour;

  @NonNull
  public final RadioGroup eradioGroupAll;

  @NonNull
  public final RadioButton eradioOne;

  @NonNull
  public final RadioButton eradioThree;

  @NonNull
  public final RadioButton eradioTwo;

  @NonNull
  public final LinearLayout examLl;

  @NonNull
  public final Button examSubmitBtn;

  @NonNull
  public final TextView examTitleTv;

  @NonNull
  public final View infoV;

  @NonNull
  public final TextView markTv;

  @NonNull
  public final Button nextBtn;

  @NonNull
  public final LinearLayout questionsLl;

  @NonNull
  public final SeekBar questionsProgress;

  @NonNull
  public final Button showMarksBtn;

  @NonNull
  public final TextView timerTv;

  private ActivityTestsBinding(@NonNull RelativeLayout rootView, @NonNull Button backBtn,
      @NonNull ImageView backIv, @NonNull TextView counterTv, @NonNull TextView equestionTv,
      @NonNull RadioButton eradioFour, @NonNull RadioGroup eradioGroupAll,
      @NonNull RadioButton eradioOne, @NonNull RadioButton eradioThree,
      @NonNull RadioButton eradioTwo, @NonNull LinearLayout examLl, @NonNull Button examSubmitBtn,
      @NonNull TextView examTitleTv, @NonNull View infoV, @NonNull TextView markTv,
      @NonNull Button nextBtn, @NonNull LinearLayout questionsLl,
      @NonNull SeekBar questionsProgress, @NonNull Button showMarksBtn, @NonNull TextView timerTv) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.backIv = backIv;
    this.counterTv = counterTv;
    this.equestionTv = equestionTv;
    this.eradioFour = eradioFour;
    this.eradioGroupAll = eradioGroupAll;
    this.eradioOne = eradioOne;
    this.eradioThree = eradioThree;
    this.eradioTwo = eradioTwo;
    this.examLl = examLl;
    this.examSubmitBtn = examSubmitBtn;
    this.examTitleTv = examTitleTv;
    this.infoV = infoV;
    this.markTv = markTv;
    this.nextBtn = nextBtn;
    this.questionsLl = questionsLl;
    this.questionsProgress = questionsProgress;
    this.showMarksBtn = showMarksBtn;
    this.timerTv = timerTv;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTestsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTestsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_tests, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTestsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn;
      Button backBtn = rootView.findViewById(id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.back_iv;
      ImageView backIv = rootView.findViewById(id);
      if (backIv == null) {
        break missingId;
      }

      id = R.id.counter_tv;
      TextView counterTv = rootView.findViewById(id);
      if (counterTv == null) {
        break missingId;
      }

      id = R.id.equestion_tv;
      TextView equestionTv = rootView.findViewById(id);
      if (equestionTv == null) {
        break missingId;
      }

      id = R.id.eradio_four;
      RadioButton eradioFour = rootView.findViewById(id);
      if (eradioFour == null) {
        break missingId;
      }

      id = R.id.eradio_group_all;
      RadioGroup eradioGroupAll = rootView.findViewById(id);
      if (eradioGroupAll == null) {
        break missingId;
      }

      id = R.id.eradio_one;
      RadioButton eradioOne = rootView.findViewById(id);
      if (eradioOne == null) {
        break missingId;
      }

      id = R.id.eradio_three;
      RadioButton eradioThree = rootView.findViewById(id);
      if (eradioThree == null) {
        break missingId;
      }

      id = R.id.eradio_two;
      RadioButton eradioTwo = rootView.findViewById(id);
      if (eradioTwo == null) {
        break missingId;
      }

      id = R.id.exam_ll;
      LinearLayout examLl = rootView.findViewById(id);
      if (examLl == null) {
        break missingId;
      }

      id = R.id.exam_submit_btn;
      Button examSubmitBtn = rootView.findViewById(id);
      if (examSubmitBtn == null) {
        break missingId;
      }

      id = R.id.exam_title_tv;
      TextView examTitleTv = rootView.findViewById(id);
      if (examTitleTv == null) {
        break missingId;
      }

      id = R.id.info_v;
      View infoV = rootView.findViewById(id);
      if (infoV == null) {
        break missingId;
      }

      id = R.id.mark_tv;
      TextView markTv = rootView.findViewById(id);
      if (markTv == null) {
        break missingId;
      }

      id = R.id.next_btn;
      Button nextBtn = rootView.findViewById(id);
      if (nextBtn == null) {
        break missingId;
      }

      id = R.id.questions_ll;
      LinearLayout questionsLl = rootView.findViewById(id);
      if (questionsLl == null) {
        break missingId;
      }

      id = R.id.questions_progress;
      SeekBar questionsProgress = rootView.findViewById(id);
      if (questionsProgress == null) {
        break missingId;
      }

      id = R.id.show_marks_btn;
      Button showMarksBtn = rootView.findViewById(id);
      if (showMarksBtn == null) {
        break missingId;
      }

      id = R.id.timer_tv;
      TextView timerTv = rootView.findViewById(id);
      if (timerTv == null) {
        break missingId;
      }

      return new ActivityTestsBinding((RelativeLayout) rootView, backBtn, backIv, counterTv,
          equestionTv, eradioFour, eradioGroupAll, eradioOne, eradioThree, eradioTwo, examLl,
          examSubmitBtn, examTitleTv, infoV, markTv, nextBtn, questionsLl, questionsProgress,
          showMarksBtn, timerTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
