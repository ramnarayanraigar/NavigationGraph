package raigar.ramnarayan.naviationgraph;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class AFragment extends Fragment {
    private View view;
    private Context mContext;

    private NavController mNavController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_a, container, false);
        mContext = getActivity();

        mNavController = Navigation.findNavController(getActivity(), R.id.my_nav_host_fragment);

        Button B = view.findViewById(R.id.btnb);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNavController.navigate(R.id.action_fragmentA_to_fragmentB);
            }
        });

        Button C = view.findViewById(R.id.btnc);

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNavController.navigate(R.id.action_fragmentA_to_fragmentC);
            }
        });

        return view;
    }
}
