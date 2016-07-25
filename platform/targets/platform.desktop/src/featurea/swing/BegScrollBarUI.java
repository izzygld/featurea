package featurea.swing;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class BegScrollBarUI extends BasicScrollBarUI {

  private static final Color background = Color.white;
  private static final Color foreground = new Color(211, 211, 211);

  public static ComponentUI createUI(JComponent c) {
    return new BegScrollBarUI();
  }

  @Override
  protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
    if (thumbBounds.isEmpty() || !scrollbar.isEnabled()) {
      return;
    }

    int w = thumbBounds.width;
    int h = thumbBounds.height;

    g.translate(thumbBounds.x, thumbBounds.y);

    g.setColor(foreground);
//    g.drawRect(0, 0, w - 1, h - 1);
    g.drawLine(0, 1, 0, h - 2);
    //left
    g.drawLine(1, 0, w - 2, 0);
    //top
    g.drawLine(w - 1, 1, w - 1, h - 2);
    //right
    g.drawLine(1, h - 1, w - 2, h - 1);
    //bottom
//    g.setColor(thumbColor);
    g.setColor(foreground);
    g.fillRect(1, 1, w - 2, h - 2);

//    g.setColor(thumbHighlightColor);
//    g.setColor(Color.darkGray);
//    g.drawLine(1, 1, 1, h - 2);
//    g.drawLine(2, 1, w - 3, 1);

//    g.setColor(thumbLightShadowColor);
//    g.drawLine(2, h - 2, w - 2, h - 2);
//    g.drawLine(w - 2, 1, w - 2, h - 3);

    g.translate(-thumbBounds.x, -thumbBounds.y);
  }

  @Override
  protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
    g.setColor(background);
    g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);

    if (trackHighlight == DECREASE_HIGHLIGHT) {
      paintDecreaseHighlight(g);
    } else if (trackHighlight == INCREASE_HIGHLIGHT) {
      paintIncreaseHighlight(g);
    }
  }

  @Override
  protected JButton createDecreaseButton(int orientation) {
    return createZeroButton();
  }

  @Override
  protected JButton createIncreaseButton(int orientation) {
    return createZeroButton();
  }

  private JButton createZeroButton() {
    JButton jbutton = new JButton();
    jbutton.setPreferredSize(new Dimension(0, 0));
    jbutton.setMinimumSize(new Dimension(0, 0));
    jbutton.setMaximumSize(new Dimension(0, 0));
    return jbutton;
  }

}