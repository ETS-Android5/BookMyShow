package com.example.bookmyshow.Home.aMyHome;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bookmyshow.R;

import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventsViewHolder> {
    private List<EventsModel> modelList;

    public EventsAdapter(List<EventsModel> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public EventsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.streaming_seeall_item_layout, parent, false);
        return new EventsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventsViewHolder holder, int position) {
        EventsModel model = modelList.get(position);
        holder.setData(model);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public void updateData(List<EventsModel> modelList) {
        this.modelList = modelList;
        notifyDataSetChanged();
    }

    public class EventsViewHolder extends RecyclerView.ViewHolder {
        ImageView eventImage;
        TextView eventName,eventType,whereToWatch,price;

        public EventsViewHolder(@NonNull View itemView) {
            super(itemView);
            eventImage = itemView.findViewById(R.id.streamingImage);
            eventName = itemView.findViewById(R.id.txtEventName);
            eventType = itemView.findViewById(R.id.txtEventType);
            whereToWatch = itemView.findViewById(R.id.txtWhereToWatch);
            price = itemView.findViewById(R.id.txtPrice);
        }

        public void setData(EventsModel model) {
            Glide.with(eventImage).load(model.getImages()).into(eventImage);
            eventName.setText(model.getEventName());
            eventType.setText(model.getEventType());
            whereToWatch.setText(model.getWhereToWatch());
            price.setText(model.getPrice());
        }
    }

}