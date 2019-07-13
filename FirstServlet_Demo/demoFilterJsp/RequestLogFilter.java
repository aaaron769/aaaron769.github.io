package com.test;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// this is a a filter class which filters the request came to webServer from browser
public class RequestLogFilter implements Filter {
	// the doFilter is the method which we do filtering and has three parameters
	//  the interface ServletRequest( the abstract class ServletRequest which we need to downcast to HttpServletRequest
	// inorder to useIt), ServletResponse( an abstract class ServletResponse) and FilterChain( an Interface )
	 @Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Instant start = Instant.now();
		try {
			chain.doFilter(request, response);
		} finally {
			Instant end = Instant.now();
			Duration timeElapsed = Duration.between(start, end);
			HttpServletRequest in = (HttpServletRequest) request;
			HttpServletResponse out = (HttpServletResponse) response;
			String length = out.getHeader("Content-Length");
			if (length == null || length.length() == 0)
				length = "-";
			System.out.println(in.getRemoteAddr() + " - - [" + start + "]" + " \"" + in.getMethod() + " "
					+ in.getRequestURI() + " " + in.getProtocol() + "\" " + out.getStatus() + " " + length + " "
					+ timeElapsed.toNanos() + " nano-seconds");
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}
}