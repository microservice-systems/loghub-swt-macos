/*******************************************************************************
 * Copyright (c) 2000, 2019 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.cocoa;

public class CGAffineTransform {
	/** @field cast=(CGFloat) */
	public double a;
	/** @field cast=(CGFloat) */
	public double b;
	/** @field cast=(CGFloat) */
	public double c;
	/** @field cast=(CGFloat) */
	public double d;
	/** @field cast=(CGFloat) */
	public double tx;
	/** @field cast=(CGFloat) */
	public double ty;
	public static final int sizeof = OS.CGAffineTransform_sizeof();
}
