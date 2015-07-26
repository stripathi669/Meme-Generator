package orbyt.memegenerator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by orbyt on 7/14/2015.
 */
public class BottomPictureFragment extends Fragment {

    @Bind(R.id.topText) TextView topText;
    @Bind(R.id.bottomText) TextView bottomText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    public void setMemeText(String top, String bottom) {

        topText.setText(top);
        bottomText.setText(bottom);
    }
}
