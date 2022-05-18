/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2022, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.core.model;

public class ImportModel extends Model {

    private static final long serialVersionUID = 1L;

    // Class/getClass() are part of java.lang.Object. We use 'className' instead.
    String className;

    @Override
    protected ImportModel makeNewInstance() {
        return new ImportModel();
    }
    
    @Override
    protected void mirror(Model that) {
        ImportModel actual = (ImportModel) that;
        super.mirror(actual);
        this.className = actual.className;
    }
    
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
