package tokyo.tommy_kw.drawerlayout;

import android.support.annotation.NonNull;
import android.support.v7.util.SortedList;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tommy on 2016/03/07.
 */
public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.> {
    private SortedList<SampleData> sortedList;
    public SampleAdapter() {
        sortedList = new SortedList<>(SampleData.class)
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

    public static class SampleViewHolder extends RecyclerView.ViewHolder {
        private TextView idText;
        private TextView textText;

        public SampleViewHolder(View itemView) {
            super(itemView);
            idText = (TextView) itemView.findViewById(R.id.id);
            textText = (TextView) itemView.findViewById(R.id.text);
        }

        public void bind(@NonNull SampleData data) {
            idText.setText(String.valueOf(data.getId()));
            textText.setText(data.getText());
        }
    }
}
