/**
 * Copyright 2013. All rights reserved.
 */
package org.happysoft.zxsprite.export;

import org.happysoft.zxsprite.SpriteModel;

import java.util.List;


/**
 * @author Chris Francis (c_francis1@yahoo.com)
 */
public interface ExportFormat {

    public String export(List<SpriteModel> model);

}
