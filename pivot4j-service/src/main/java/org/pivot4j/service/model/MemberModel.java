/*
 * ====================================================================
 * This software is subject to the terms of the Common Public License
 * Agreement, available at the following URL:
 *   http://www.opensource.org/licenses/cpl.html .
 * You must accept the terms of that agreement to use this software.
 * ====================================================================
 */
package org.pivot4j.service.model;

import org.olap4j.metadata.Member;

public class MemberModel extends MetadataModel {

	private static final long serialVersionUID = 4655816736526836558L;

	/**
	 * @param member
	 */
	public MemberModel(Member member) {
		super(member);
	}
}