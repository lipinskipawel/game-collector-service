package com.github.lipinskipawel.game.question;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
final class WeakTokenFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(final HttpServletRequest request,
                                    final HttpServletResponse response,
                                    final FilterChain filterChain)
            throws ServletException, IOException {
//        final var token = request.getAttribute("${env}");
//        if (token != null && token.equals("${env}")) {
//            filterChain.doFilter(request, response);
//        }
//        response.setStatus(401);
        filterChain.doFilter(request, response);
    }
}
