
package org.happysoft.zxsprite;

/**
 *
 * @author Chris
 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ZXSprite {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      createAndShowGUI();
    });
  }

  private static void createAndShowGUI() {
    JFrame f = new ZXSpriteFrame("ZX Sprite Editor");
    f.pack();
    f.setVisible(true);
  }
}
