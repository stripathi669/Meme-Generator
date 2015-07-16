package orbyt.memegenerator;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by orbyt on 7/14/2015.
 */
public class TopSectionFragment extends Fragment {

    private String mTopText;
    private String mBottomText;

    TopSectionListener activityCommander;

    public interface TopSectionListener {
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (TopSectionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    //Bind the components to variables
//    @Bind(R.id.topTextInput) EditText topTextInput;
//    @Bind(R.id.bottomTextInput) EditText bottomTextInput;
//    @Bind(R.id.button) Button button;

    EditText topTextInput;
    EditText bottomTextInput;
    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        topTextInput = (EditText) view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);
        button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return view;
    }

    private void buttonClicked(View view) {
        mTopText = topTextInput.getText().toString();
        mBottomText = bottomTextInput.getText().toString();

        activityCommander.createMeme(mTopText, mBottomText);
    }
}
