package br.com.senior.Calculator;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.senior.Calculator.service.LoginService;

//Ao acessar com usuario e senha
//Gerar token de autentificação para usar novamente nas outras requisições

//controller para login
//dto para user
//UUID para gerar token

@Component
@Order(1)
public class AuthenticationFilter implements Filter {

	@Autowired
	private LoginService loginService;

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		final HttpServletRequest request = (HttpServletRequest) servletRequest;
		final String authorization = request.getHeader("authorization");
		final String uri = request.getRequestURI();
		System.out.println(uri);

		if (uri.equals("/Calculator/login/")) {
			filterChain.doFilter(servletRequest, servletResponse);
		}

		if (loginService.isTokenValid(authorization)) {
			filterChain.doFilter(servletRequest, servletResponse);

		} else {
			final HttpServletResponse response = (HttpServletResponse) servletResponse;
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Não autorizado");
		}

	}

}
