/*
 * This file is part of FFractal, created by Guilhelm Savin and modified
 * by Bilyan Borisov.
 * 
 * FFractal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FFractal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with FFractal.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2010
 * 	Guilhelm Savin
 * 
 * Copyright 2012
 *  Bilyan Borisov
 */
package org.ri2c.flame.gui;

import org.ri2c.flame.FFunction;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class FFRenderer
  extends JLabel implements ListCellRenderer
{
  FFunction ff;
  
  public FFRenderer( FFunction ff, String name )
  {
    super(name);
    setOpaque(false);
  }
  
  @Override
public Component getListCellRendererComponent(JList list,
                                                   Object value,
                                                   int index,
                                                   boolean isSelected,
                                                   boolean cellHasFocus) {
      return this;
    }
}
