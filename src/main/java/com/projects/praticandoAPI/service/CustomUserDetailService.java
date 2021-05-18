//package com.projects.praticandoAPI.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import com.projects.praticandoAPI.modelo.Usuario;
//import com.projects.praticandoAPI.repository.UsuarioRepository;
//
//@Component
//public class CustomUserDetailService implements UserDetailsService {
//	private final UsuarioRepository usuarioRepository;
//
//	@Autowired
//	public CustomUserDetailService(UsuarioRepository usuarioRepository) {
//		this.usuarioRepository = usuarioRepository;
//	}
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Usuario usuario = Optional.ofNullable(usuarioRepository.findByNome(username))
//				.orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado"));
//
//		String[] rolesStringList = usuario.getRoles().stream().map(f -> f.toString()).toArray(String[]::new);
//
//		List<GrantedAuthority> authorityList = AuthorityUtils.createAuthorityList(rolesStringList);
//
//		return new User(usuario.getNome(), usuario.getSenha(), authorityList);
//	}
//
//}
