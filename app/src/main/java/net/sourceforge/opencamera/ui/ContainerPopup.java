package net.sourceforge.opencamera.ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import net.sourceforge.opencamera.R;

public abstract class ContainerPopup {
    private ViewGroup container = null;
    private int containerRes;
    private Activity context;

    public ContainerPopup(Activity context, int containerRes) {
        this.context = context;
        this.containerRes = containerRes;
    }

    public abstract void setup();

    public boolean isOpen() {
        ViewGroup container = getContainer();
        if (container == null) {
            return false;
        }
        return container.getVisibility() == View.VISIBLE;
    }

    public ViewGroup getContainer() {
        if (container == null) {
            container = context.findViewById(containerRes);
        }
        return container;
    }

    public void close() {
        if (container != null) {
            container.setVisibility(View.GONE);
        }
    }
}
