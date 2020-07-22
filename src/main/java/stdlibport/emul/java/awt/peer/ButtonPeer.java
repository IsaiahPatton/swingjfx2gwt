// Copyright (c) 2020 Fungus Software & Oracle under GPLv2 only with classpath exception

package java.awt.peer;

import java.awt.Button;

/**
 * The peer interface for {@link Button}.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
public interface ButtonPeer extends ComponentPeer {

    /**
     * Sets the label that is displayed on the button. Can be {@code null}
     * when the button should not display a label.
     *
     * @param label the label string to set
     *
     * @see Button#setLabel
     */
    void setLabel(String label);
}
