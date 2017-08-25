package homedevstudio.cookingup.fragments.allrecipies.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import homedevstudio.cookingup.R;
import homedevstudio.cookingup.fragments.AbstractFragment;

/**
 * Created by xdewnik on 24.08.2017.
 */

public class AllRecipiesFragment extends AbstractFragment {

    private static final int FRAGMENT_LAYOUT = R.layout.allrecipies_layout;

    @BindView(R.id.allRecipiesRecycleView) RecyclerView recyclerView;



    //Позволяет получить экземпляр фрагмента. Нужен для передачи данных например из бд в другие фрагменты
    public static AllRecipiesFragment getInstance(Context context) {
        Bundle args = new Bundle();
        AllRecipiesFragment fragment = new AllRecipiesFragment();
        fragment.setArguments(args);
        fragment.setContext(context);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(FRAGMENT_LAYOUT, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

}
