package net.codejava;

import java.io.IOException;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		for (GrantedAuthority auth : authentication.getAuthorities()) {
            if (auth.getAuthority().equals("administration")) {
                response.sendRedirect("/admin");
                return;
            } else if (auth.getAuthority().equals("hr")) {
                response.sendRedirect("/hr");
                return;
            } else if (auth.getAuthority().equals("sales")) {
                response.sendRedirect("/sales");
                return;
            } else if (auth.getAuthority().equals("accountant")) {
                response.sendRedirect("/accountant");
                return;
            }
        }
        throw new IllegalStateException();
    }

	}

