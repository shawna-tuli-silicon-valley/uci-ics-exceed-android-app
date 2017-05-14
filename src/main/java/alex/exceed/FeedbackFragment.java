package alex.exceed;

/**
 * Created by Alex on 4/17/2017.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by Alex on 4/17/2017.
 */


public class FeedbackFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.feedback_fragment, container, false);
    }
}