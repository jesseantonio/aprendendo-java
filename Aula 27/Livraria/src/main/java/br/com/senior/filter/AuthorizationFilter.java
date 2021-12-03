package br.com.senior.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.senior.controller.LoginController;

@Component
@Order(1)
@Profile("prod")
public class AuthorizationFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request1 = (HttpServletRequest) request;
		String authorization = request1.getHeader("authorization");

		if (request1.getRequestURI().equals("/login")) {
			chain.doFilter(request, response);
		}

		System.out.println(authorization);

		if (LoginController.uuid.contains(authorization)) {
			chain.doFilter(request, response);
		} else {
			HttpServletResponse responseSv = (HttpServletResponse) response;
			responseSv.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Token Invalido.");
		}
		
	}

}
