package tokyo.tommy_kw.drawerlayout;

import android.support.annotation.NonNull;
import android.support.v7.util.SortedList;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tommy on 2016/03/07.
 */
public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.SampleViewHolder> {
    private SortedList<SampleData> sortedList;

    public SampleAdapter() {
        sortedList = new SortedList<>(SampleData.class, new SampleCallback(this));
    }

    @Override
    public SampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_list, parent, false);
        return new SampleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SampleViewHolder holder, int position) {
        SampleData data = sortedList.get(position);
        if (data != null) {
            holder.bind(data);
        }

    }

    @Override
    public int getItemCount() {
        return sortedList.size();
    }

    public void addDataOf(List<SampleData> list) {
        sortedList.addAll(list);
    }

    public void removeDataOf(List<SampleData> dataList) {
        sortedList.beginBatchedUpdates();
        for (SampleData data : dataList) {
            sortedList.remove(data);
        }
        sortedList.endBatchedUpdates();
    }

    public void clearData() {
        sortedList.clear();
    }

    public SortedList<SampleData> getList() {
        return sortedList;
    }

    public static class SampleViewHolder extends RecyclerView.ViewHolder {
        private TextView idText;
        private TextView textView;

        public SampleViewHolder(View itemView) {
            super(itemView);
            idText = (TextView) itemView.findViewById(R.id.id);
            textView = (TextView) itemView.findViewById(R.id.text);
        }

        public void bind(@NonNull SampleData data) {
            idText.setText(String.valueOf(data.getId()));
            textView.setText(data.getText());
        }
    }


    private static class SampleCallback extends SortedList.Callback<SampleData> {
        private RecyclerView.Adapter adapter;

        SampleCallback(@NonNull RecyclerView.Adapter adapter) {
            this.adapter = adapter;
        }

        @Override
        public int compare(SampleData o1, SampleData o2) {
            return o1.getId() - o2.getId();
        }

        @Override
        public void onInserted(int position, int count) {
            adapter.notifyItemRangeInserted(position, count);
        }

        @Override
        public void onRemoved(int position, int count) {
            adapter.notifyItemRangeRemoved(position, count);
        }

        @Override
        public void onMoved(int fromPosition, int toPosition) {
            adapter.notifyItemMoved(fromPosition, toPosition);
        }

        @Override
        public void onChanged(int position, int count) {
            adapter.notifyItemRangeChanged(position, count);
        }

        @Override
        public boolean areContentsTheSame(SampleData oldItem, SampleData newItem) {
            String oldText = oldItem.getText();
            if (oldText == null) {
                return newItem.getText() == null;
            }
            return oldText.equals(newItem.getText());
        }

        @Override
        public boolean areItemsTheSame(SampleData item1, SampleData item2) {
            return item1.getId() == item2.getId();
        }
    }
}
