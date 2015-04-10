package io.futurestud.tutorials.picasso.ui.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import io.futurestud.tutorials.picasso.R;
import io.futurestud.tutorials.picasso.ui.adapter.ImageListAdapter;

public class UsageExampleAdapter extends ActionBarActivity {

    @InjectView(R.id.usage_example_adapter_listview) ListView listView;
    String[] eatFoodyImages = {
            "http://i.imgur.com/rFLNqWI.jpg",
            "http://i.imgur.com/C9pBVt7.jpg",
            "http://i.imgur.com/rT5vXE1.jpg",
            "http://i.imgur.com/aIy5R2k.jpg",
            "http://i.imgur.com/MoJs9pT.jpg",
            "http://i.imgur.com/S963yEM.jpg",
            "http://i.imgur.com/rLR2cyc.jpg",
            "http://i.imgur.com/SEPdUIx.jpg",
            "http://i.imgur.com/aC9OjaM.jpg",
            "http://i.imgur.com/76Jfv9b.jpg",
            "http://i.imgur.com/fUX7EIB.jpg",
            "http://i.imgur.com/syELajx.jpg",
            "http://i.imgur.com/COzBnru.jpg",
            "http://i.imgur.com/Z3QjilA.jpg",
    };

    public UsageExampleAdapter() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_usage_example_adapter);
        ButterKnife.inject(this);

        listView.setAdapter(new ImageListAdapter(UsageExampleAdapter.this, eatFoodyImages));
    }
}