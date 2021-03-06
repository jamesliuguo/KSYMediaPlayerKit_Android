package com.ksy.media.widget.ui.livereplay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.ksy.mediaPlayer.widget.R;

/**
 * @author LIXIAOPENG
 */
public class LiveReplayHeadListAdapter extends BaseAdapter {

	private LayoutInflater inflater;

	public LiveReplayHeadListAdapter(Context mContext) {
		inflater = LayoutInflater.from(mContext);
	}

	@Override
	public int getCount() {
		return 8;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder = null;
		
		if (convertView == null) {
			viewHolder = new ViewHolder();

			convertView = inflater.inflate(R.layout.live_replay_item, null);
			viewHolder.headListImage = (ImageView)convertView.findViewById(R.id.live_replay_imageview);
			
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		viewHolder.headListImage.setImageResource(R.drawable.live_dialog_list_item);
//		viewHolder.videoTextName.setText(videoInfoList.get(position).getDisplayName());

		return convertView;
	}

	
	class ViewHolder {
		public ImageView headListImage;
	}
	
}

