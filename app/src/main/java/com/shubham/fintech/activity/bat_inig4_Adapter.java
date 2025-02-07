package com.shubham.fintech.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.shubham.fintech.R;

/**
 * Created by sakhi on 3/27/2017.
 */
public class bat_inig4_Adapter extends BaseAdapter {

    bat_bowl_ining_4 main;

    bat_inig4_Adapter(bat_bowl_ining_4 main) {

        this.main = main;
    }


    @Override
    public int getCount() {
        return main.batsmen_data_list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public static class ViewHolderItem {
        TextView batsmanId_ing1, outdescription_ing1, run_ing1, ball_ing1, four_ing1, six_ing1, sr_ing1;
        public TextView vcity, vcountry, time;
        public RelativeLayout bat_score_layout, bowl_score_layout, vcity_vcountry_layout;
        public ImageView flag1, flag2;
        public String TW, decisn, team1_fName, team2_fName, team1_id, team2_id, flag_url1, flag_url2;
        public String mchState, batteamid, bowlteamid, batteamscore_str, bowlteamscore_str;
        String matchId, datapath;


    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolderItem holder = new ViewHolderItem();
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) main.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.batemen_list_cell, null);
            holder.batsmanId_ing1 = (TextView) convertView.findViewById(R.id.stricker_player);
            holder.run_ing1 = (TextView) convertView.findViewById(R.id.stricker_player_run);
            holder.ball_ing1 = (TextView) convertView.findViewById(R.id.stricker_player_bowl);
            holder.four_ing1 = (TextView) convertView.findViewById(R.id.stricker_player_4s);
            holder.six_ing1 = (TextView) convertView.findViewById(R.id.stricker_player_6s);
            holder.sr_ing1 = (TextView) convertView.findViewById(R.id.stricker_player_sr);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolderItem) convertView.getTag();
        }
      /*  holder.TW = this.main.live_data_list.get(position).TW;
        holder.decisn = this.main.live_data_list.get(position).decisn;
        holder.matchId = this.main.live_data_list.get(position).matchId;
        holder.datapath = this.main.live_data_list.get(position).datapath;
        holder.team1_fName = this.main.live_data_list.get(position).team1_fName;

        holder.batteamid = this.main.live_data_list.get(position).batteamid;
        holder.bowlteamid = this.main.live_data_list.get(position).bowlteamid;
        holder.team2_fName = this.main.live_data_list.get(position).team2_fName;
        holder.mchState = this.main.live_data_list.get(position).mchState;
        holder.batteamscore_str = this.main.live_data_list.get(position).batteamscore;
        holder.bowlteamscore_str = this.main.live_data_list.get(position).bowlteamscore;*/
        //holder.team1_id = this.main.batsmen_data_list.get(position).batteamid;
        //holder.team2_id = this.main.batsmen_data_list.get(position).team2_id;

        holder.batsmanId_ing1.setText(this.main.batsmen_data_list.get(position).batsmanId_ing1);
        holder.run_ing1.setText(this.main.batsmen_data_list.get(position).run_ing1);
        holder.ball_ing1.setText(this.main.batsmen_data_list.get(position).ball_ing1);
        holder.four_ing1.setText(this.main.batsmen_data_list.get(position).four_ing1);
        holder.six_ing1.setText(this.main.batsmen_data_list.get(position).six_ing1);
        holder.sr_ing1.setText(this.main.batsmen_data_list.get(position).sr_ing1);


        return convertView;
    }
}