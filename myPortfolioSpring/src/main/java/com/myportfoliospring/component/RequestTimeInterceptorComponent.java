package com.myportfoliospring.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptorComponent")
public class RequestTimeInterceptorComponent extends HandlerInterceptorAdapter {

	public static final Log LOG = LogFactory.getLog(RequestTimeInterceptorComponent.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("starTimeRequest", System.currentTimeMillis());
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long starTimeRequest = (long) request.getAttribute("starTimeRequest");
		LOG.info("REQUEST URL:'" + request.getRequestURL().toString() + "' TOTAL TIME:"
				+ (System.currentTimeMillis() - starTimeRequest) + "ms");
	}

}
