package com.shortstack.hackertracker.List;

import com.pedrogomez.renderers.RendererBuilder;
import com.shortstack.hackertracker.Model.Item;
import com.shortstack.hackertracker.Renderer.FeedEndRenderer;
import com.shortstack.hackertracker.Renderer.GenericHeaderRenderer;
import com.shortstack.hackertracker.Renderer.GenericTimeRenderer;
import com.shortstack.hackertracker.Renderer.ItemRenderer;

import java.util.Date;


public class ScheduleItemBuilder extends RendererBuilder<Item> {

    public static final int HEADER = 0;
    public static final int FOOTER = 1;

    public ScheduleItemBuilder() {

        bind(Item.class, new ItemRenderer())
                .bind(String.class, new GenericHeaderRenderer())
                .bind(Date.class, new GenericTimeRenderer())

                .bind(HEADER, new FeedEndRenderer())
                .bind(FOOTER, new FeedEndRenderer());
    }
}
