package tokyo.tommy_kw.drawerlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tommy on 2016/03/06.
 */
public class BottomSheetFragment extends Fragment {
    private static final String ID_LIST = "id_list";
    private RecyclerView recyclerView;

    public static BottomSheetFragment newInstance() {
        return new BottomSheetFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false);

        TextView addButton = (TextView) view.findViewById(R.id.add);
        addButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

        TextView removeButton = (TextView) view.findViewById(R.id.remove);
        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        final SwipeRefreshLayout swipeRefresh = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh);
        swipeRefresh.setOnClickListener(new SwipeRefreshLayout.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

        if (recyclerView == null) {
            recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view)
        }

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        if (recyclerView.getAdapter() == null) {

        }
    }


}
