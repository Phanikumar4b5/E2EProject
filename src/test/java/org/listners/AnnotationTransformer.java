package org.listners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);

	}

}
