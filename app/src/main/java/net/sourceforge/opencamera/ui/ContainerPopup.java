package net.sourceforge.opencamera.ui;

import android.view.View;
import android.view.ViewGroup;

public abstract class ContainerPopup {
    public ViewGroup container = null;

    public abstract void setup();
    public abstract boolean isOpen();

    public void close() {
        if (container != null) {
            container.setVisibility(View.GONE);
        }
    }
}
