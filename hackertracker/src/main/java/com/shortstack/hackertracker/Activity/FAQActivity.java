package com.shortstack.hackertracker.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.pedrogomez.renderers.RendererAdapter;
import com.pedrogomez.renderers.RendererBuilder;
import com.shortstack.hackertracker.R;
import com.shortstack.hackertracker.Renderer.FAQRenderer;

public class FAQActivity extends ListActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RendererBuilder rendererBuilder = new RendererBuilder().bind(String[].class, new FAQRenderer());

        RendererAdapter adapter = new RendererAdapter(rendererBuilder);
        list.setAdapter(adapter);

        String[] myItems = getResources().getStringArray(R.array.faq_questions);

        for (int i = 0; i < myItems.length - 1; i += 2) {
            String[] update = new String[2];

            update[0] = myItems[i];
            update[1] = myItems[i + 1];

            adapter.add(update);
        }
    }
}



