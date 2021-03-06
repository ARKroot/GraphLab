// GraphLab Project: http://graphlab.sharif.edu
// Copyright (C) 2008 Mathematical Science Department of Sharif University of Technology
// Distributed under the terms of the GNU General Public License (GPL): http://www.gnu.org/licenses/

package graphlab.plugins.main.ui;

import graphlab.platform.core.BlackBoard;
import graphlab.ui.components.GComponentInterface;

import java.awt.*;

public class GTabbedGraphPane implements GComponentInterface {
    public Component getComponent(BlackBoard b) {
        return new graphlab.graph.ui.GTabbedGraphPane(b).getComponent(b);
    }
}
