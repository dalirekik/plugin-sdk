/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.ide.tutorial.wizard.pages.page4;

import com.codenvy.ide.api.wizard.AbstractWizardPage;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;

import static com.codenvy.ide.tutorial.wizard.WizardTutorialExtension.PAGE4_SKIP;

/**
 * The fourth page into wizard.
 *
 * @author <a href="mailto:aplotnikov@codenvy.com">Andrey Plotnikov</a>
 */
public class Page4Presenter extends AbstractWizardPage {

    @Inject
    public Page4Presenter() {
        super("Page 4", null);
    }

    /** {@inheritDoc} */
    @Override
    public String getNotice() {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public boolean isCompleted() {
        return true;
    }

    /** {@inheritDoc} */
    @Override
    public boolean canSkip() {
        Boolean skip = wizardContext.getData(PAGE4_SKIP);
        return skip != null && skip;
    }

    /** {@inheritDoc} */
    @Override
    public void focusComponent() {
        // do nothing
    }

    /** {@inheritDoc} */
    @Override
    public void removeOptions() {
        // do nothing
    }

    /** {@inheritDoc} */
    @Override
    public void go(AcceptsOneWidget container) {
        Label label = new Label(getCaption());
        container.setWidget(label);
    }
}