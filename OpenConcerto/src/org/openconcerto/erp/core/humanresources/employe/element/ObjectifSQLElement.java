/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 2011 OpenConcerto, by ILM Informatique. All rights reserved.
 * 
 * The contents of this file are subject to the terms of the GNU General Public License Version 3
 * only ("GPL"). You may not use this file except in compliance with the License. You can obtain a
 * copy of the License at http://www.gnu.org/licenses/gpl-3.0.html See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each file.
 */
 
 /*
 * Créé le 26 mars 2012
 */
package org.openconcerto.erp.core.humanresources.employe.element;

import org.openconcerto.erp.core.common.element.ComptaSQLConfElement;
import org.openconcerto.sql.element.BaseSQLComponent;
import org.openconcerto.sql.element.SQLComponent;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ObjectifSQLElement extends ComptaSQLConfElement {

    public ObjectifSQLElement() {
        super("OBJECTIF_COMMERCIAL", "un objectif commercial", "Objectifs commerciaux");
    }

    protected List<String> getListFields() {
        final List<String> l = new ArrayList<String>();
        l.add("ANNEE");
        return l;
    }

    protected List<String> getComboFields() {
        final List<String> l = new ArrayList<String>();
        l.add("ANNEE");
        return l;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.openconcerto.devis.SQLElement#getComponent()
     */
    public SQLComponent createComponent() {
        return new BaseSQLComponent(this) {
            public void addViews() {

                this.setLayout(new GridBagLayout());
                GridBagConstraints c = new GridBagConstraints();
                c.gridx = GridBagConstraints.RELATIVE;

                JTextField textNom = new JTextField();
                JLabel labelNom = new JLabel(getLabelFor("ANNEE"));

                this.add(labelNom, c);
                this.add(textNom, c);

                this.addSQLObject(textNom, "ANNEE");
            }
        };
    }
}
