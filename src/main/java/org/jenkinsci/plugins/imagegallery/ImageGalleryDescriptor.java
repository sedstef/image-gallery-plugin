/*
 * The MIT License
 *
 * Copyright (c) 2012-2015 Bruno P. Kinoshita, BioUno
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins.imagegallery;


import hudson.init.InitMilestone;
import hudson.init.Initializer;
import hudson.model.Items;
import hudson.model.Descriptor;

/**
 * Descriptor for {@link ImageGallery ImageGallery}.
 *
 * @author Bruno P. Kinoshita - http://www.kinoshita.eti.br
 * @see ImageGallery
 * @since 0.1
 */
public abstract class ImageGalleryDescriptor extends Descriptor<ImageGallery> {

	// Backward compatibility
	@Initializer(before=InitMilestone.PLUGINS_STARTED)
	public static void addAliases() {
		Items.XSTREAM2.addCompatibilityAlias("org.jenkinsci.plugins.imagegallery.imagegallery.ImageGallery", ImageGallery.class);
		Items.XSTREAM2.addCompatibilityAlias("org.jenkinsci.plugins.imagegallery.imagegallery.ImageGalleryDescriptor", ImageGalleryDescriptor.class);
	}
	
}
