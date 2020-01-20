/*
 * Copyright Siemens AG, 2016. Part of the SW360 Portal Project.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.sw360.licenseinfo.parsers;

import org.eclipse.sw360.datahandler.thrift.attachments.Attachment;
import org.eclipse.sw360.datahandler.thrift.attachments.AttachmentContent;
import org.apache.thrift.TException;

/**
 * @author: alex.borodin@evosoft.com
 */
@FunctionalInterface
public interface AttachmentContentProvider {
    AttachmentContent getAttachmentContent(Attachment attachment) throws TException;
}
