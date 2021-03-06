package javax.swing;

import com.google.gwt.user.client.ui.ScrollPanel;

import java.awt.Dimension;

public class JScrollPane extends JComponent {

    public JScrollPane() {
        gwt = new ScrollPanel();
    }

    public JScrollPane(JComponent p) {
        this();
        ((ScrollPanel)gwt).setWidget(p.gwt);
    }

    public void fixSize(Dimension d) {
        this.gwt.setSize(d.width-2 + "px", d.height+5 + "px");
    }

    public JComponent add(JComponent j) {
        ((ScrollPanel)gwt).add(j.gwt);
        return j;
    }

}