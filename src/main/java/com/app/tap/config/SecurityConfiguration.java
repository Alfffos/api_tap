package com.app.tap.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration extends WebSecurityConfiguration implements WebMvcConfigurer {

    @Autowired
    private final JwtAutheticationFilter _jwtAuthenticationFilter;
    @Autowired
    private final AuthenticationProvider _authProvider;

    @Bean
    public CorsConfigurationSource customCorsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("*")); // Puedes restringir los orígenes permitidos según tus necesidades
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS")); // Métodos permitidos
        configuration.setAllowedHeaders(Arrays.asList("*")); // Cabeceras permitidas
        configuration.setAllowCredentials(true); // Permitir credenciales

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .cors() // Habilitar la configuración CORS en la cadena de seguridad
                .and()
                .authorizeHttpRequests(authRequest ->
                        authRequest
                                .requestMatchers("/auth/**").permitAll()
                                .anyRequest().authenticated()
                )
                .sessionManagement(sessionManager ->
                        sessionManager.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .authenticationProvider(_authProvider)
                .addFilterBefore(_jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }


//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        return http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(authRequest ->
//                    authRequest
//                            .requestMatchers("/auth/**").permitAll()
//                .anyRequest().authenticated()
//            )
//            .sessionManagement(sessionManager->
//                    sessionManager
//                            .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//            .authenticationProvider(_authProvider)
//            .addFilterBefore(_jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
//            .build();
//
//    }
}










                                    // Este pedazo de codigo es la primera clase que cree pero que no finciona porque no encutra los paquetes instalados javax.
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//
//    @Autowired
//    private UserManagementService userManagementService;
//
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//
//
//    @Override
//    protected  void configure(HttpSecurity http) throws Exception{
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/user/**")
//                .permitAll()
//                .anyRequest()
//                .authenticated().and()
//                .formLogin();
//    }
//
//
//
//    @Bean
//    public DaoAuthenticationProvider daoAuthenticationProvider() {
//        DaoAuthenticationProvider provider= new DaoAuthenticationProvider();
//        provider.setPasswordEncoder(bCryptPasswordEncoder);
//        provider.setUserDetailsService(userManagementService);
//        return provider;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(daoAuthenticationProvider());
//    }
//
//
//}
