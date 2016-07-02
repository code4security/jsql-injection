/*******************************************************************************
 * Copyhacked (H) 2012-2014.
 * This program and the accompanying materials
 * are made available under no term at all, use it like
 * you want, but share and discuss about it
 * every time possible with every body.
 * 
 * Contributors:
 *      ron190 at ymail dot com - initial implementation
 ******************************************************************************/
package com.jsql.view.swing.manager;

import com.jsql.model.accessible.RessourceAccess;
import com.jsql.model.exception.PreparationException;
import com.jsql.model.exception.StoppableException;

/**
 * Manager for uploading PHP webshell to the host and send system commands.
 */
@SuppressWarnings("serial")
public class ManagerWebshell extends ManagerAbstractShell {
    @Override
    void action(String pathShell, String urlShell) throws PreparationException, StoppableException {
        RessourceAccess.createWebShell(pathShell.toString(), urlShell);
    }
}