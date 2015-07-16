package orbyt.memegenerator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by orbyt on 7/14/2015.
 */
public class BottomPictureFragment extends Fragment {

    TextView topText;
    TextView bottomText;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        topText = (TextView) view.findViewById(R.id.topText);
        bottomText = (TextView) view.findViewById(R.id.bottomText);
        return view;
    }

    public void setMemeText(String top, String bottom) {

        topText.setText(top);
        bottomText.setText(bottom);
    }
}
