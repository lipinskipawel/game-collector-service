package com.github.lipinskipawel.game.question;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
final class TokenFilter extends OncePerRequestFilter {

    @Value("${TOKEN_NAME}")
    private String tokenName;

    @Value("${TOKEN_VALUE}")
    private String tokenValue;

    @Override
    protected void doFilterInternal(final HttpServletRequest request,
                                    final HttpServletResponse response,
                                    final FilterChain filterChain)
            throws ServletException, IOException {
        final var token = request.getHeader(tokenName);
        if (token != null && token.equals(tokenValue)) {
            filterChain.doFilter(request, response);
        }
        response.setStatus(401);
    }
}
