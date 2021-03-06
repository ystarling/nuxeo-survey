/*
 * (C) Copyright 2011 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     eugen
 */
package org.nuxeo.ecm.survey;

import org.nuxeo.ecm.core.api.DocumentModel;

/**
 * An object that wraps a {@code DocumentModel} of type {@code Question}.
 * 
 * @author <a href="mailto:ei@nuxeo.com">Eugen Ionica</a>
 * @since 5.4.3
 */
public interface Question {

    String getQuestion();

    String[] getAnswers();

    void setQuestion(String value);

    void setAnswers(String[] value);

    DocumentModel getQuestionDocument();

}
